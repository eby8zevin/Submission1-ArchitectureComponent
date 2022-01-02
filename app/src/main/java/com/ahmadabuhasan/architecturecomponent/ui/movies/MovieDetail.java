package com.ahmadabuhasan.architecturecomponent.ui.movies;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.ahmadabuhasan.architecturecomponent.R;
import com.ahmadabuhasan.architecturecomponent.data.MovieEntity;
import com.ahmadabuhasan.architecturecomponent.databinding.ActivityMovieDetailBinding;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import java.util.Objects;

public class MovieDetail extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";

    private ActivityMovieDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_movie_detail);

        binding = ActivityMovieDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Objects.requireNonNull(getSupportActionBar()).hide();

        MovieDetailViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(MovieDetailViewModel.class);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String movieId = extras.getString(EXTRA_MOVIE);
            if (movieId != null) {
                viewModel.setSelectedMovie(movieId);
                populateMovie(viewModel.getMovie());
            }
        }

        binding.toolbar.setNavigationOnClickListener(view -> onBackPressed());
    }

    private void populateMovie(MovieEntity movieEntity) {
        binding.collapsing.setTitle(movieEntity.getTitle());
        binding.tvGenreDuration.setText(String.format("%s  •  %s", movieEntity.getGenre(), movieEntity.getDuration()));
        binding.tvDetailOverview.setText(movieEntity.getOverview());

        Glide.with(this)
                .load(movieEntity.getPoster())
                .transform(new RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading).error(R.drawable.ic_broken_image))
                .into(binding.ivDetail);

        binding.ivShare.setOnClickListener(view -> {
            String shareIntent = "Movie" +
                    "\n Title: " + movieEntity.getTitle() +
                    "\n Overview: " + movieEntity.getOverview();
            Intent i = new Intent();
            i.setAction(Intent.ACTION_SEND);
            i.putExtra(Intent.EXTRA_TEXT, shareIntent);
            i.setType("text/plain");
            startActivity(Intent.createChooser(i, "Share"));
        });
    }
}