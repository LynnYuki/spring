package com.lynnyuki.entity;

public class Student {
    private int stuNo;
    private String stuName;
    private int age;

    public Student(int stuNo, String stuName, int age) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.age = age;
    }

    public Student() {

    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo=" + stuNo +
                ", stuName='" + stuName + '\'' +
                ", age=" + age +
                '}';
    }
}
