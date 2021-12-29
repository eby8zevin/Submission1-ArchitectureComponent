package com.ahmadabuhasan.architecturecomponent.ui.movies;

import androidx.lifecycle.ViewModel;

import com.ahmadabuhasan.architecturecomponent.data.MovieEntity;
import com.ahmadabuhasan.architecturecomponent.utils.DataDummy;

import java.util.List;

public class MovieViewModel extends ViewModel {

    public List<MovieEntity> getMovies() {
        return DataDummy.generateDummyMovie();
    }
}