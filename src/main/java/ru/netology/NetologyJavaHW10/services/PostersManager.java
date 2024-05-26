package ru.netology.NetologyJavaHW10.services;

public class PostersManager {

    private PostersManager manage;
    private PostersClass[] posters = new PostersClass[0];

    public void addNewPoster(PostersClass poster) {

        PostersClass[] tmp = new PostersClass[posters.length + 1];

        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }

        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

     public PostersClass[] getNewPosters() {
        return posters;
    }

    public PostersClass[] getAllPostersInOrder() {
        return posters;

    }

    public PostersClass[] getLastPosterReversed () {
        PostersClass[] allPoster = posters.getNewPosters();
        PostersClass[] reversedPoster = new PostersClass[allPoster.length];

        for (int i = 0; i < allPoster.length; i++) {
            reversedPoster[i] = allPoster[allPoster.length - 1 - i];
        }
        return reversedPoster;
    }
}

