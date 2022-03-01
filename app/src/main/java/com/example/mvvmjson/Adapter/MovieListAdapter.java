package com.example.mvvmjson.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvmjson.Model.MovieModel;
import com.example.mvvmjson.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MyViewHolder> {

    public Context context;
    public List<MovieModel> movieModelList;

    public MovieListAdapter(Context context, List<MovieModel> movieModelList) {
        this.context = context;
        this.movieModelList = movieModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.layout_movie_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Picasso.get().load(movieModelList.get(position).getImageUrl()).into(holder.imgMovie);
        holder.txtMovieName.setText(movieModelList.get(position).getName());
        holder.txtTeam.setText(movieModelList.get(position).getTeam());
        holder.txtCreatedBy.setText(movieModelList.get(position).getCreatedBy());
    }

    @Override
    public int getItemCount() {
        return movieModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgMovie;
        TextView txtMovieName,txtTeam,txtCreatedBy;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgMovie = itemView.findViewById(R.id.imgMovie);
            txtMovieName = itemView.findViewById(R.id.txtMovieName);
            txtTeam = itemView.findViewById(R.id.txtTeam);
            txtCreatedBy = itemView.findViewById(R.id.txtCreatedBy);

        }
    }
}
