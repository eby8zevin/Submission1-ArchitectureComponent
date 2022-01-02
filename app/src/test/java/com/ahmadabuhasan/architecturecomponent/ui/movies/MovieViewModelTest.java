package com.ahmadabuhasan.architecturecomponent.ui.movies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.ahmadabuhasan.architecturecomponent.data.MovieEntity;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class MovieViewModelTest {

    private MovieViewModel viewModel;

    @Before
    public void setUp() {
        viewModel = new MovieViewModel();
    }

    @Test
    public void testGetMovies() {
        List<MovieEntity> movieEntities = viewModel.getMovies();
        assertNotNull(movieEntities);
        assertEquals(10, movieEntities.size());
    }
}