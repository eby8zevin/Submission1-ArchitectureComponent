package com.ahmadabuhasan.architecturecomponent.ui.movies;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ahmadabuhasan.architecturecomponent.R;
import com.ahmadabuhasan.architecturecomponent.databinding.ActivityMovieDetailBinding;

import java.util.Objects;

public class MovieDetail extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";

    private ActivityMovieDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        setTitle("Detail Movie");
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}