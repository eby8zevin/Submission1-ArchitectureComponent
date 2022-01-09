package com.ahmadabuhasan.architecturecomponent.ui.tvshows;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.ahmadabuhasan.architecturecomponent.data.TVShowEntity;
import com.ahmadabuhasan.architecturecomponent.utils.DataDummy;

import org.junit.Before;
import org.junit.Test;

public class TVShowDetailViewModelTest {

    private TVShowDetailViewModel viewModel;
    private final TVShowEntity dummyTVShow = DataDummy.generateDummyTVShow().get(0);
    private final String tvshowId = dummyTVShow.getTvshowId();

    @Before
    public void setUp() {
        viewModel = new TVShowDetailViewModel();
        viewModel.setSelectedTVShow(tvshowId);
    }

    @Test
    public void testSetSelectedTVShow() {
        viewModel.setSelectedTVShow(dummyTVShow.getTvshowId());
        TVShowEntity tvShowEntity = viewModel.getTVShow();
        assertNotNull(tvShowEntity);
        assertEquals(dummyTVShow.getTvshowId(), tvShowEntity.getTvshowId());
        assertEquals(dummyTVShow.getTitle(), tvShowEntity.getTitle());
        assertEquals(dummyTVShow.getRelease(), tvShowEntity.getRelease());
        assertEquals(dummyTVShow.getGenre(), tvShowEntity.getGenre());
        assertEquals(dummyTVShow.getDuration(), tvShowEntity.getDuration());
        assertEquals(dummyTVShow.getOverview(), tvShowEntity.getOverview());
        assertEquals(dummyTVShow.getPoster(), tvShowEntity.getPoster());
    }
}