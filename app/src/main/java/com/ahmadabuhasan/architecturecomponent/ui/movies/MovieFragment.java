package com.ahmadabuhasan.architecturecomponent.ui.movies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.ahmadabuhasan.architecturecomponent.data.MovieEntity;
import com.ahmadabuhasan.architecturecomponent.databinding.FragmentMoviesBinding;

import java.util.List;

public class MovieFragment extends Fragment {

    private FragmentMoviesBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentMoviesBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getActivity() != null) {
            MovieViewModel movieViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(MovieViewModel.class);
            List<MovieEntity> movies = movieViewModel.getMovies();

            MovieAdapter movieAdapter = new MovieAdapter();
            movieAdapter.setMovie(movies);

            binding.rvMovies.setLayoutManager(new LinearLayoutManager(getContext()));
            binding.rvMovies.setHasFixedSize(true);
            binding.rvMovies.setAdapter(movieAdapter);
        }
    }
}