package ru.netology.NetologyJavaHW10.services;

public class FilmManager {
    private String title;
    private String[] films = new String[0];
    private int maxAllowed;

    public FilmManager() {
        this.maxAllowed = maxAllowed;
    }

    public FilmManager(int maxAllowed) {
        this.maxAllowed = 5;
    }

    public FilmManager(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
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

        if (films.length < 5) {
            resultLength = films.length;
        } else {
            resultLength = 5;
        }

        String[] all = new String[resultLength];
        String[] reverse = new String[all.length];

        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = all[all.length - 1 - i];
        }
        return reverse;

    }

}
