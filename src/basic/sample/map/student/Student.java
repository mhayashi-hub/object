package basic.sample.map.student;

import basic.sample.enumsample.Gender;

class Student {
    // 学年、クラスを指定
    // ClassはJava言語の予約語のため書けないのでgroupとして記述する。
    private String group;
    private String name;
    private Gender gender;
    private int jap;
    private int math;
    private int eng;

    public Student(String group, String name, Gender gender, int jap, int math, int eng) {
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getJap() {
        return jap;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    public int sum(){
        return jap + math + eng;
    }

    public double ave() {
        return sum() / 3.0 ;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %d %d %.2f",
                group,name,gender.getJpName(),jap,math,eng,sum(),ave());
    }

}
