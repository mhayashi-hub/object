package localtest.MapInMap;

import basic.sample.enumsample.Gender;

class Member {
    private String name;
    private Gender gender;
    private int age;

    public Member(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    // override toString for output
    @Override
    public String toString() {
        return String.format("%s %s %d", name,gender.getJpName(),age);
    }
}
