package com.ahmadabuhasan.architecturecomponent.ui.tvshows;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.ahmadabuhasan.architecturecomponent.data.TVShowEntity;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TVShowViewModelTest {

    private TVShowViewModel viewModel;

    @Before
    public void setUp() {
        viewModel = new TVShowViewModel();
    }

    @Test
    public void testGetTVShow() {
        List<TVShowEntity> tvShowEntities = viewModel.getTVShow();
        assertNotNull(tvShowEntities);
        assertEquals(10, tvShowEntities.size());
    }
}