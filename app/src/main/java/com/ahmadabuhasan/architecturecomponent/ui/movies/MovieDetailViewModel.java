package com.ahmadabuhasan.architecturecomponent.ui.movies;

import androidx.lifecycle.ViewModel;

import com.ahmadabuhasan.architecturecomponent.data.MovieEntity;
import com.ahmadabuhasan.architecturecomponent.utils.DataDummy;

import java.util.ArrayList;

public class MovieDetailViewModel extends ViewModel {

    private String movieId;

    public void setSelectedMovie(String movieId) {
        this.movieId = movieId;
    }

    public MovieEntity getMovie() {
        MovieEntity movie = null;
        ArrayList<MovieEntity> movieEntities = (ArrayList<MovieEntity>) DataDummy.generateDummyMovie();
        for (MovieEntity movieEntity : movieEntities) {
            if (movieEntity.getMovieId().equals(movieId)) {
                movie = movieEntity;
            }
        }
        return movie;
    }
}