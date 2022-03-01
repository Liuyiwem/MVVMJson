package com.example.mvvmjson.ViewModel;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmjson.Model.MovieModel;
import com.example.mvvmjson.Repositories.MainRepo;

import java.util.List;

public class MainActivityViewModel extends ViewModel {
    private final MainRepo mainRepo;

    public MainActivityViewModel() {
        mainRepo = new MainRepo();
    }

    public LiveData<List<MovieModel>> getMovieList(){
        return mainRepo.getMovieModelLiveData();
    }
}
