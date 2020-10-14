package com.serenitydojo;

public class Hamster extends pet {

    private String favoriteGame;

    public Hamster(String name, int age, String favoriteGame){
        super(name,age);
        this.favoriteGame = favoriteGame;
    }


    public String getFavoriteGame() {
        System.out.println(getName() + "'s Favorite Game is: "+favoriteGame);
        return favoriteGame;
    }
}
