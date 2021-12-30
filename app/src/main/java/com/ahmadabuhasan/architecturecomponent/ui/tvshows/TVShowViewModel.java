package com.ahmadabuhasan.architecturecomponent.ui.tvshows;

import androidx.lifecycle.ViewModel;

import com.ahmadabuhasan.architecturecomponent.data.TVShowEntity;
import com.ahmadabuhasan.architecturecomponent.utils.DataDummy;

import java.util.List;

public class TVShowViewModel extends ViewModel {

    public List<TVShowEntity> getTVShow() {
        return DataDummy.generateDummyTVShow();
    }
}