package com.ahmadabuhasan.architecturecomponent.ui.movies;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ahmadabuhasan.architecturecomponent.data.MovieEntity;
import com.ahmadabuhasan.architecturecomponent.databinding.ItemMovieBinding;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private final ArrayList<MovieEntity> movieEntityArrayList = new ArrayList<>();

    public void setMovieEntityArrayList(ArrayList<MovieEntity> data){
        movieEntityArrayList.clear();
        movieEntityArrayList.addAll(data);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MovieAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMovieBinding binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MovieViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MovieViewHolder holder, int position) {
        MovieEntity movieEntity = movieEntityArrayList.get(position);
        Glide.with(holder.itemView.getContext())
                .load(movieEntity.getPoster())
                .apply(new RequestOptions().override(120, 80))
                .into(holder.binding.ivPoster);
        holder.binding.tvTitle.setText(movieEntity.getTitle());
        holder.binding.tvRelease.setText(movieEntity.getRelease());
    }

    @Override
    public int getItemCount() {
        return movieEntityArrayList.size();
    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder {

        private final ItemMovieBinding binding;

        public MovieViewHolder(@NonNull ItemMovieBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}