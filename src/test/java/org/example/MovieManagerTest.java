package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MovieManagerTest {

    MovieManager movieManager = new MovieManager();
    MovieItem movie1 = new MovieItem(1, "Бладшот", "боевик");
    MovieItem movie2 = new MovieItem(2, "Вперед", "мультфильм");
    MovieItem movie3 = new MovieItem(3, "Отель Белград", "комедия");
    MovieItem movie4 = new MovieItem(4, "Джентельмены", "боевик");
    MovieItem movie5 = new MovieItem(5, "Человек-невидимка", "ужасы");
    MovieItem movie6 = new MovieItem(6, "Тролли. Мировой тур", "мультфильм");
    MovieItem movie7 = new MovieItem(7, "Номер один", "комедия");

    @BeforeEach
    public void setup() {
        movieManager.add(movie1);
        movieManager.add(movie2);
        movieManager.add(movie3);
        movieManager.add(movie4);
        movieManager.add(movie5);
        movieManager.add(movie6);

    }

    @Test
    public void shouldFindAll() {
        MovieItem[] expected = {movie1, movie2, movie3, movie4, movie5, movie6};
        MovieItem[] actual = movieManager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdd() {
        movieManager.add(movie7);
        MovieItem[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        MovieItem[] actual = movieManager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemove() {
        movieManager.removeById(2);
        MovieItem[] expected = {movie1, movie3, movie4, movie5, movie6};
        MovieItem[] actual = movieManager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        MovieItem[] expected = {movie6, movie5, movie4, movie3, movie2};
        MovieItem[] actual = movieManager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfParam() {
        MovieManager movieManagerParam = new MovieManager(4);
        movieManagerParam.add(movie1);
        movieManagerParam.add(movie2);
        movieManagerParam.add(movie3);
        movieManagerParam.add(movie4);
        movieManagerParam.add(movie5);
        movieManagerParam.add(movie6);
        MovieItem[] expected = {movie6, movie5, movie4, movie3};
        MovieItem[] actual = movieManagerParam.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldBeMovieManagerEmpty() {
        MovieManager movieManagerEmpty = new MovieManager();
        MovieItem[] expected = {};
        MovieItem[] actual = movieManagerEmpty.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


}