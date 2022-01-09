package com.ahmadabuhasan.architecturecomponent.ui.tvshows;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.ahmadabuhasan.architecturecomponent.R;
import com.ahmadabuhasan.architecturecomponent.data.TVShowEntity;
import com.ahmadabuhasan.architecturecomponent.databinding.ActivityTvshowDetailBinding;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import java.util.Objects;

public class TVShowDetail extends AppCompatActivity {

    public static final String EXTRA_TVSHOW = "extra_tvshow";

    private ActivityTvshowDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTvshowDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Objects.requireNonNull(getSupportActionBar()).hide();

        TVShowDetailViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(TVShowDetailViewModel.class);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String tvshowId = extras.getString(EXTRA_TVSHOW);
            if (tvshowId != null) {
                viewModel.setSelectedTVShow(tvshowId);
                populateTVShow(viewModel.getTVShow());
            }
        }

        binding.toolbar.setNavigationOnClickListener(view -> onBackPressed());
    }

    private void populateTVShow(TVShowEntity tvShowEntity) {
        binding.collapsingTvshow.setTitle(tvShowEntity.getTitle());
        binding.tvTvshowGenreDuration.setText(String.format("%s  •  %s", tvShowEntity.getGenre(), tvShowEntity.getDuration()));
        binding.tvTvshowDetailOverview.setText(tvShowEntity.getOverview());

        Glide.with(this)
                .load(tvShowEntity.getPoster())
                .transform(new RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading).error(R.drawable.ic_broken_image))
                .into(binding.ivTvshowPoster);

        binding.ivTvshowShare.setOnClickListener(view -> {
            String shareIntent = "TV Show" +
                    "\n Title: " + tvShowEntity.getTitle() +
                    "\n Overview: " + tvShowEntity.getOverview();
            Intent i = new Intent();
            i.setAction(Intent.ACTION_SEND);
            i.putExtra(Intent.EXTRA_TEXT, shareIntent);
            i.setType("text/plain");
            startActivity(Intent.createChooser(i, "Share"));
        });
    }
}