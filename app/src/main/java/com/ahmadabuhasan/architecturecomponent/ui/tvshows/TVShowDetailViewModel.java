package com.ahmadabuhasan.architecturecomponent.ui.tvshows;

import androidx.lifecycle.ViewModel;

import com.ahmadabuhasan.architecturecomponent.data.TVShowEntity;
import com.ahmadabuhasan.architecturecomponent.utils.DataDummy;

import java.util.ArrayList;

public class TVShowDetailViewModel extends ViewModel {

    private String tvshowId;

    public void setSelectedTVShow(String tvshowId) {
        this.tvshowId = tvshowId;
    }

    public TVShowEntity getTVShow() {
        TVShowEntity tvshow = null;
        ArrayList<TVShowEntity> tvShowEntities = (ArrayList<TVShowEntity>) DataDummy.generateDummyTVShow();
        for (TVShowEntity tvShowEntity : tvShowEntities) {
            if (tvShowEntity.getTvshowId().equals(tvshowId)) {
                tvshow = tvShowEntity;
            }
        }
        return tvshow;
    }
}