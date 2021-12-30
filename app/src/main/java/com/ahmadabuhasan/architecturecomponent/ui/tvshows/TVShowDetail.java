package com.ahmadabuhasan.architecturecomponent.ui.tvshows;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ahmadabuhasan.architecturecomponent.R;
import com.ahmadabuhasan.architecturecomponent.databinding.ActivityTvshowDetailBinding;

public class TVShowDetail extends AppCompatActivity {

    public static final String EXTRA_TVSHOW = "extra_tvshow";

    private ActivityTvshowDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvshow_detail);
    }
}