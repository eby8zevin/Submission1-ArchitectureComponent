package com.ahmadabuhasan.architecturecomponent.data;

public class MovieEntity {

    private final String movieId;
    private final String title;
    private final String release;
    private final String genre;
    private final String duration;
    private final String overview;
    private final Integer poster;

    public MovieEntity(String movieId, String title, String release, String genre, String duration, String overview, Integer poster) {
        this.movieId = movieId;
        this.title = title;
        this.release = release;
        this.genre = genre;
        this.duration = duration;
        this.overview = overview;
        this.poster = poster;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getRelease() {
        return release;
    }

    public String getGenre() {
        return genre;
    }

    public String getDuration() {
        return duration;
    }

    public String getOverview() {
        return overview;
    }

    public Integer getPoster() {
        return poster;
    }

}