package ru.netology.NetologyJavaHW10.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PostersManagerTest {



    PostersClass posters1 = new PostersClass("Бладшот");
    PostersClass posters2 = new PostersClass("Вперёд");
    PostersClass posters3 = new PostersClass("Отель Белград");
    PostersClass posters4 = new PostersClass("Джентльмены");
    PostersClass posters5 = new PostersClass("Человек-невидимка");
    PostersClass posters6 = new PostersClass("Тролли. Мировой тур");
    PostersClass posters7 = new PostersClass("Номер один");


    @Test

    public void shouldAddNewMovie() {
        PostersManager movie = new PostersManager();

        movie.addNewPoster(posters1);
        movie.addNewPoster(posters2);
        movie.addNewPoster(posters3);

        PostersClass[] expected = { posters1, posters2, posters3 };
        PostersClass[] actual = movie.getNewPosters();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldShowAllPostersInOrder() {
        PostersManager movie = new PostersManager();

        movie.addNewPoster(posters1);
        movie.addNewPoster(posters2);
        movie.addNewPoster(posters3);
        movie.addNewPoster(posters4);
        movie.addNewPoster(posters5);
        movie.addNewPoster(posters6);
        movie.addNewPoster(posters7);

        PostersClass[] expected = { posters1, posters2, posters3 };
        PostersClass[] actual = movie.getAllPostersInOrder();

    }

    @Test

    public void shouldShowAllPostersInReverseOrder() {

        movie.addNewPoster(posters1);
        movie.addNewPoster(posters2);
        movie.addNewPoster(posters3);

        PostersClass[] expected = { posters3, posters2, posters1 };
        PostersClass[] actual = movie.getLastPosterReversed();

        Assertions.assertArrayEquals(expected, actual);
    }
}
