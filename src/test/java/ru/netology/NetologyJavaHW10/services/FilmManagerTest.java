package ru.netology.NetologyJavaHW10.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    FilmManager films = new FilmManager();
    FilmManager manager = new FilmManager();

    String film1 = "Бладшот";
    String film2 = "Вперёд";
    String film3 = "Отель Белград";
    String film4 = "Джентльмены";
    String film5 = "Человек-невидимка";
    String film6 = "Тролли. Мировой тур";
    String film7 = "Номер один";


    @Test
    public void FilmManager() {
        FilmManager films = new FilmManager(7);

        films.addFilm(film1);
        films.addFilm(film2);
        films.addFilm(film3);
        films.addFilm(film4);
        films.addFilm(film5);
        films.addFilm(film6);
        films.addFilm(film7);

        String[] expected = { film7, film6, film5, film4, film3, film2, film1 };
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilms() {

        films.addFilm(film1);

        String[] expected = {film1};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void zeroFilms() {

        String[] expected = {};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneFilm() {

        films.addFilm(film1);

        String[] expected = {film1};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddSixFilms() {

        films.addFilm(film1);
        films.addFilm(film2);
        films.addFilm(film3);
        films.addFilm(film4);
        films.addFilm(film5);
        films.addFilm(film6);

        String[] expected = {film1, film2, film3, film4, film5, film6};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldAddAllFilms() {

        films.addFilm(film1);
        films.addFilm(film2);
        films.addFilm(film3);
        films.addFilm(film4);
        films.addFilm(film5);
        films.addFilm(film6);
        films.addFilm(film7);

        String[] expected = {film1, film2, film3, film4, film5, film6, film7};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldShowLastFilmsReversed() {

        films.addFilm(film1);
        films.addFilm(film2);
        films.addFilm(film3);
        films.addFilm(film4);
        films.addFilm(film5);
        films.addFilm(film6);
        films.addFilm(film7);

        String[] expected = { film7, film6, film5, film4, film3 };
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldShowLastFiveFilmsReversed() {

        films.addFilm(film1);
        films.addFilm(film2);
        films.addFilm(film3);
        films.addFilm(film4);
        films.addFilm(film5);

        String[] expected = { film5, film4, film3, film2, film1 };
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldShowLastFilmsReversedIfLessThanFive() {

        films.addFilm(film1);
        films.addFilm(film2);


        String[] expected = { film2, film1 };
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
