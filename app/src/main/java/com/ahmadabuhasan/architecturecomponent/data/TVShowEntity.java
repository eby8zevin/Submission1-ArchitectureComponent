package com.ahmadabuhasan.architecturecomponent.data;

public class TVShowEntity {

    private String tvshowId;
    private String title;
    private String release;
    private String genre;
    private String duration;
    private String overview;
    private Integer poster;

    public TVShowEntity(String tvshowId, String title, String release, String genre, String duration, String overview, Integer poster) {
        this.tvshowId = tvshowId;
        this.title = title;
        this.release = release;
        this.genre = genre;
        this.duration = duration;
        this.overview = overview;
        this.poster = poster;
    }

    public String getTvshowId() {
        return tvshowId;
    }

    public void setTvshowId(String tvshowId) {
        this.tvshowId = tvshowId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Integer getPoster() {
        return poster;
    }

    public void setPoster(Integer poster) {
        this.poster = poster;
    }
}