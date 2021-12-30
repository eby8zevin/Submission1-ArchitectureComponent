package com.ahmadabuhasan.architecturecomponent.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.ahmadabuhasan.architecturecomponent.ui.movies.MovieFragment;
import com.ahmadabuhasan.architecturecomponent.ui.tvshows.TVShowFragment;

import java.util.Objects;

public class MainPagerAdapter extends FragmentStateAdapter {

    public MainPagerAdapter(AppCompatActivity activity) {
        super(activity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new MovieFragment();
                break;
            case 1:
                fragment= new TVShowFragment();
                break;
        }
        return Objects.requireNonNull(fragment);
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}