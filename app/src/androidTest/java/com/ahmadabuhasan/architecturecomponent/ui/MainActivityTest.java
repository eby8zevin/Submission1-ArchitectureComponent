package com.ahmadabuhasan.architecturecomponent.ui;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.action.ViewActions.swipeUp;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withTagValue;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.allOf;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.ahmadabuhasan.architecturecomponent.R;
import com.ahmadabuhasan.architecturecomponent.data.MovieEntity;
import com.ahmadabuhasan.architecturecomponent.data.TVShowEntity;
import com.ahmadabuhasan.architecturecomponent.utils.DataDummy;

import org.junit.Rule;
import org.junit.Test;

import java.util.List;

public class MainActivityTest {

    private List<MovieEntity> dummyMovie = DataDummy.generateDummyMovie();
    private List<TVShowEntity> dummyTVShow = DataDummy.generateDummyTVShow();

    @Rule
    public ActivityScenarioRule activityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void loadMovie() {
        onView(withId(R.id.rv_movies)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.scrollToPosition(dummyMovie.size()));
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.actionOnItemAtPosition(9, scrollTo()));
    }

    @Test
    public void loadMovieDetail() {
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));

        // Title
        onView(allOf(withId(R.id.collapsing_movie)
                , withText(dummyMovie.get(0).getTitle())
                , withContentDescription("Title")
                , isDisplayed()));

        // Poster
        onView(withId(R.id.iv_movie_poster)).check(matches(isDisplayed()));

        // Genre & Duration
        onView(withId(R.id.tv_movie_genre_duration)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_movie_genre_duration)).check(matches(withText
                (String.format("%s  •  %s", dummyMovie.get(0).getGenre(), dummyMovie.get(0).getDuration()))));

        // Overview
        onView(withId(R.id.tv_movie_detail_overview)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_movie_detail_overview)).check(matches(withText(dummyMovie.get(0).getOverview())));

        onView(withId(R.id.appbar_movie)).perform(click(), swipeUp());
    }

    @Test
    public void loadTVShow() {
        onView(withText("TV Show")).perform(click());
        onView(withId(R.id.rv_tv_show)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_tv_show)).perform(RecyclerViewActions.scrollToPosition(dummyTVShow.size()));
        onView(withId(R.id.rv_tv_show)).perform(RecyclerViewActions.actionOnItemAtPosition(9, scrollTo()));
    }
}