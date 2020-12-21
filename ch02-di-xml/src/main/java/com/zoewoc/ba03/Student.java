package com.zoewoc.ba03;

public class Student {
    private String name;
    private int age;

    //声明一个引用类型
    private School school;

    public Student() {
    }

    public Student(String myname, int myage, School mySchool){
        System.out.println("====student有参数构造方法=====");
        this.name=myname;
        this.age=myage;
        this.school=mySchool;

    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        System.out.println("setName:"+school);
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
