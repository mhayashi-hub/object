package ex.student2;

import basic.sample.enumsample.Gender;

class Student {
    // fields
    private String name;//名前
    private Gender gender;//性別
    private int jap;//国語の得点
    private int math;//数学の得点
    private int eng;//英語の得点
    // constructor
    public Student(String name, Gender gender, int jap, int math, int eng) {
        this.name = name;
        this.gender = gender;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }
    // getter
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
    /*
    // toString Override
    @Override
    public String toString() {
        return String.format("%s %s %d %d %d",name,gender,jap,math,eng);
    }
    */
    // output methods for Q1 Answer
    public String q1Answer () {
        return String.format("%s %s %d %d %d",name,gender.getJpName(),jap,math,eng);
    }
    // sum, ave methods
    public int sum() {
        int sumscore = jap + math + eng;
        return sumscore;
    }
    public double ave() {
        // double avescore = Math.round(this.sum() * 100.0) / 3 / 100.0;
        double avescore = this.sum() / 3.00;
        return avescore;
    }
    // output method for Q2,3 Answer
    public String q2Answer() {
        return this.q1Answer() + String.format(" %d",sum());
    }
    public String q3Answer() {
        return this.q2Answer() + String.format(" %.2f",ave());
    }
}