package br.com.alura.mymusic.main;

import br.com.alura.mymusic.models.Music;
import br.com.alura.mymusic.models.MyFavorites;
import br.com.alura.mymusic.models.Podcast;

public class Main {

    public static void main(String[] args) {

        Music myMusic = new Music();
        myMusic.setTitle("Forever");
        myMusic.setSinger("Kiss");

        for (int i = 0; i < 1000; i++) {
            myMusic.plays();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("BolhaDev");
        myPodcast.setPresenter("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            myPodcast.plays();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        MyFavorites favorites = new MyFavorites();
        favorites.includes(myPodcast);
        favorites.includes(myMusic);
    }
}
