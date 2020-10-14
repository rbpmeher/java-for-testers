package com.serenitydojo;

public class pet {
    private int age;
    private String name;

    public pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        System.out.println(name+" Age is: "+ age);
        return age;
    }
}
