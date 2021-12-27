package com.ahmadabuhasan.architecturecomponent.ui.movies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ahmadabuhasan.architecturecomponent.databinding.FragmentMoviesBinding;

public class MovieFragment extends Fragment {

    FragmentMoviesBinding binding;

    public MovieFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentMoviesBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MovieAdapter adapter = new MovieAdapter();
        binding.rvMovies.setAdapter(adapter);
        binding.rvMovies.setHasFixedSize(true);
    }
}