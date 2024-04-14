package org.example;

public class MovieItem {


    private int id;
    private String movieTitle;
    private String movieGenre;

    public MovieItem(int id, String movieTitle, String movieGenre) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.movieGenre = movieGenre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }
}
