package com.example.mvvmjson.Network;

import com.example.mvvmjson.Model.MovieModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("marvel")
    Call<List<MovieModel>> getMovieList();
}
