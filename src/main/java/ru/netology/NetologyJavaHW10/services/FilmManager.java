package ru.netology.NetologyJavaHW10.services;

public class FilmManager {
    private String[] films = new String[0];
    private final int maxAllowed;


    public FilmManager() {
        this.maxAllowed = 5;
    }

    public FilmManager(int maxAllowed) {
        this.maxAllowed = maxAllowed;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];

        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;

        if (films.length < maxAllowed) {
            resultLength = films.length;
        } else {
            resultLength = maxAllowed;
        }

        String[] reverse = new String[resultLength];

        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = films[films.length - 1 - i];
        }
        return reverse;
    }
}
