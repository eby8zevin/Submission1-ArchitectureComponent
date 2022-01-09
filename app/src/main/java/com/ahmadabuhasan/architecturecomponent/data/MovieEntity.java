package com.ahmadabuhasan.architecturecomponent.data;

public class MovieEntity {

    private String movieId;
    private String title;
    private String release;
    private String genre;
    private String duration;
    private String overview;
    private Integer poster;

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