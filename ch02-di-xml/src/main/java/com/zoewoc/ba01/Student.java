package com.zoewoc.ba01;

public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" + "name='" + name + '\'' + ",age=" + age + "}";
    }
}
