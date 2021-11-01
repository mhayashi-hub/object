package localtest.mapInListInMap;

import basic.sample.enumsample.Gender;

class MemberProperty extends Member {
    private Gender gender;
    private int age;

    public MemberProperty(String name, Gender gender, int age) {
        super(name);
        this.gender = gender;
        this.age = age;
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
        return String.format("%s %s %d 歳", name,gender.getJpName(),age);
    }

    @Override
    public String getInfo() {
        return String.format(" %s %d 歳", gender.getJpName(),age);
    }
}
