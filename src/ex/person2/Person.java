package ex.person2;

import basic.sample.enumsample.Gender;

class Person {
    private String name;
    private BirthPlace birthPlace;
    private Gender gender;
    private int age;

    // constructor
    public Person(String name, BirthPlace birthPlace, Gender gender, int age) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.gender = gender;
        this.age = age;
    }
    // getter
    public String getName() {
        return name;
    }

    public BirthPlace getBirthPlace() {
        return birthPlace;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    // output method override
    @Override
    public String toString() {
        return String.format("%s : %s %s %d", birthPlace.getName(),name,gender.getJpName(),age);
    }

}
