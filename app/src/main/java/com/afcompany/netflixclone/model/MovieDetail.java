package com.afcompany.netflixclone.model;

import org.json.JSONObject;

import java.util.List;

public class MovieDetail {

    private final Movie movie;
    private final List<Movie>moviesSimiar;

    public MovieDetail(Movie movie, List<Movie> moviesSimiar) {
        this.movie = movie;
        this.moviesSimiar = moviesSimiar;
    }

    public Movie getMovie() {
        return movie;
    }

    public List<Movie> getMoviesSimiar() {
        return moviesSimiar;
    }
}
