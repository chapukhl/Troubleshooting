package com.epam.mp.deadlock.entity;


public class Friend {

    private String name;

    public Friend(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                '}';
    }

}
