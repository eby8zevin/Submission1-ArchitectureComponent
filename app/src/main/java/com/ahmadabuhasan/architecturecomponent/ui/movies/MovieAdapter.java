package com.ahmadabuhasan.architecturecomponent.ui.movies;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ahmadabuhasan.architecturecomponent.R;
import com.ahmadabuhasan.architecturecomponent.data.MovieEntity;
import com.ahmadabuhasan.architecturecomponent.databinding.ItemListBinding;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private final List<MovieEntity> listMovie = new ArrayList<>();

    void setMovie(List<MovieEntity> listMovie) {
        if (listMovie == null) return;
        this.listMovie.clear();
        this.listMovie.addAll(listMovie);
    }

    @NonNull
    @Override
    public MovieAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemListBinding binding = ItemListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MovieViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MovieViewHolder holder, int position) {
        MovieEntity movieEntity = listMovie.get(position);
        Glide.with(holder.itemView.getContext())
                .load(movieEntity.getPoster())
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading).error(R.drawable.ic_error))
                .into(holder.binding.ivPoster);
        holder.binding.tvTitle.setText(movieEntity.getTitle());
        holder.binding.tvRelease.setText(movieEntity.getRelease());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), MovieDetail.class);
            intent.putExtra(MovieDetail.EXTRA_MOVIE, movieEntity.getMovieId());
            view.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder {

        private final ItemListBinding binding;

        public MovieViewHolder(@NonNull ItemListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}