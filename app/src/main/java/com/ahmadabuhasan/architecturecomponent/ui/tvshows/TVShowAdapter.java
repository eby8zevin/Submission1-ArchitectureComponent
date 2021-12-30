package com.ahmadabuhasan.architecturecomponent.ui.tvshows;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ahmadabuhasan.architecturecomponent.data.TVShowEntity;
import com.ahmadabuhasan.architecturecomponent.databinding.ItemListBinding;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class TVShowAdapter extends RecyclerView.Adapter<TVShowAdapter.TVShowViewHolder> {

    private final List<TVShowEntity> listTVShow = new ArrayList<>();

    void setTVShow(List<TVShowEntity> listTVShow) {
        if (listTVShow == null) return;
        this.listTVShow.clear();
        this.listTVShow.addAll(listTVShow);
    }

    @NonNull
    @Override
    public TVShowAdapter.TVShowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemListBinding binding = ItemListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new TVShowViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull TVShowAdapter.TVShowViewHolder holder, int position) {
        TVShowEntity tvShowEntity = listTVShow.get(position);
        Glide.with(holder.itemView.getContext())
                .load(tvShowEntity.getPoster())
                .into(holder.binding.ivPoster);
        holder.binding.tvTitle.setText(tvShowEntity.getTitle());
        holder.binding.tvRelease.setText(tvShowEntity.getRelease());
    }

    @Override
    public int getItemCount() {
        return listTVShow.size();
    }

    public static class TVShowViewHolder extends RecyclerView.ViewHolder {

        private final ItemListBinding binding;

        public TVShowViewHolder(@NonNull ItemListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}