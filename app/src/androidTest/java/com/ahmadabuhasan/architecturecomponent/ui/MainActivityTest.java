package com.ahmadabuhasan.architecturecomponent.ui;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
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
    }

    @Test
    public void loadMovieDetail() {
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        onView(allOf(withId(R.id.collapsing), withText(dummyMovie.get(0).getTitle())
                , withContentDescription("Title"), isDisplayed()));
    }

    @Test
    public void loadTVShow() {
        onView(withText("TV Show")).perform(click());
        onView(withId(R.id.rv_tv_show)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_tv_show)).perform(RecyclerViewActions.scrollToPosition(dummyTVShow.size()));
    }
}