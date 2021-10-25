package ex.bmi;

import basic.sample.enumsample.Gender;

class Member {
    private String name;
    private Gender gender;
    private int age;
    private double height;
    private double weight;
// constructor
    public Member(String name, Gender gender, int age, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
// getter
    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // methods
    public double getBmi() {
        return ;
    }
    public String getBodyShape() {
        return ;
    }
    public double getAppWeight() {
        return ;
    }



}
