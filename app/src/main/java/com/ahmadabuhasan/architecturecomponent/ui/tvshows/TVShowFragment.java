package com.ahmadabuhasan.architecturecomponent.ui.tvshows;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.ahmadabuhasan.architecturecomponent.data.TVShowEntity;
import com.ahmadabuhasan.architecturecomponent.databinding.FragmentTvShowBinding;

import java.util.List;

public class TVShowFragment extends Fragment {

    FragmentTvShowBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentTvShowBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getActivity() != null) {
            TVShowViewModel tvShowViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(TVShowViewModel.class);
            List<TVShowEntity> tvshow = tvShowViewModel.getTVShow();

            TVShowAdapter tvShowAdapter = new TVShowAdapter();
            tvShowAdapter.setTVShow(tvshow);

            binding.rvTvShow.setLayoutManager(new LinearLayoutManager(getContext()));
            binding.rvTvShow.setHasFixedSize(true);
            binding.rvTvShow.setAdapter(tvShowAdapter);
        }
    }
}