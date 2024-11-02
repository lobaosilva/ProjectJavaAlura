package br.com.alura.mymusic.models;

public class MyFavorites {

    public void includes(Audio audio) {
        if (audio.getClassification() >= 9) {
            System.out.println(audio.getTitle() + " is considered a success and preferred by everyone!");
        } else {
            System.out.println(audio.getTitle() + " is also one that everyone is enjoying.");
        }
    }
}
