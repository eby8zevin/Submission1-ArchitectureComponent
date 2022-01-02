package com.ahmadabuhasan.architecturecomponent.ui.movies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.ahmadabuhasan.architecturecomponent.data.MovieEntity;
import com.ahmadabuhasan.architecturecomponent.utils.DataDummy;

import org.junit.Before;
import org.junit.Test;

public class MovieDetailViewModelTest {

    private MovieDetailViewModel viewModel;
    private MovieEntity dummyMovie = DataDummy.generateDummyMovie().get(0);
    private String movieId = dummyMovie.getMovieId();

    @Before
    public void setUp() {
        viewModel = new MovieDetailViewModel();
        viewModel.setSelectedMovie(movieId);
    }

    @Test
    public void testSetSelectedMovie() {
        viewModel.setSelectedMovie(dummyMovie.getMovieId());
        MovieEntity movieEntity = viewModel.getMovie();
        assertNotNull(movieEntity);
        assertEquals(dummyMovie.getMovieId(), movieEntity.getMovieId());
        assertEquals(dummyMovie.getTitle(), movieEntity.getTitle());
        assertEquals(dummyMovie.getRelease(), movieEntity.getRelease());
        assertEquals(dummyMovie.getGenre(), movieEntity.getGenre());
        assertEquals(dummyMovie.getDuration(), movieEntity.getDuration());
        assertEquals(dummyMovie.getOverview(), movieEntity.getOverview());
        assertEquals(dummyMovie.getPoster(), movieEntity.getPoster());
    }
}