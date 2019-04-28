package com.company.zadanie004.rozwiazanie.src.pl.gsrmeen;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String nickName;

    private static int USERS_COUNTER = 0;

    public User(String firstName, String lastName, String nickName) {
        this.id = ++USERS_COUNTER;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }
}
