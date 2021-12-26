package com.ahmadabuhasan.architecturecomponent.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.ahmadabuhasan.architecturecomponent.ui.movies.MovieFragment;

public class MainPagerAdapter extends FragmentStateAdapter {

    public MainPagerAdapter(AppCompatActivity activity) {
        super(activity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        MovieFragment movieFragment = new MovieFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(MovieFragment.ARG_SECTION_NUMBER, position + 1);
        movieFragment.setArguments(bundle);
        return movieFragment;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}