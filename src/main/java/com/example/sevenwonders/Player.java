package com.example.sevenwonders;

public class Player {
    private String name;
    private int age;
    private int number;

    public Player(String name, int age, int i) {
        this.name = name;
        this.age = age;
        this.number = i;
        System.out.println("Joueur : " + i + ", " + name + ". Vous avez " + age + " ans.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
