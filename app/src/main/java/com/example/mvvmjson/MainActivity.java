package com.example.mvvmjson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.mvvmjson.Adapter.MovieListAdapter;
import com.example.mvvmjson.ViewModel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel mainActivityViewModel;
    private RecyclerView recyclerView;
    private MovieListAdapter adapter;
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        recycleViewFunction();
        mainActivityViewModel.getMovieList().observe(this, movieModels -> {
            Log.e("MainActivity","MovieList: " + movieModels.get(0).getName());

            if (movieModels != null){
                adapter = new MovieListAdapter(this, movieModels);
                adapter.notifyDataSetChanged();
                recyclerView.setAdapter(adapter);

            }

        });
    }
    private void recycleViewFunction(){
        recyclerView = findViewById(R.id.recycleView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);



    }


}