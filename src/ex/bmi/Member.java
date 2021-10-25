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
    // parameter declaration -> not need to write!
    // 変数を宣言時に演算しようとしても、method内にあるかConstructorに計算式を記述してないと、
    // 変数宣言時点で変数に演算結果を代入できない。なぜならmethod外およびConstructor以外の部分の変数宣言では
    // 値をクラスで宣言していても何も入っていない状態になっているため。
    // インスタンス生成時点では入力値が与えられるが、その値を実際に処理するのはmethodかconstructorのみ、
    // 内部でローカルな共通変数として宣言し宣言時点で変数の演算をしようとした場合は、未初期化もしくは0などの
    // 値で演算した値が最初に入ってそのまま変わらなくなる。
    // つまり、ローカルな共通変数として記述する場合には定数などのクラス固有で固定の値などか、
    // クラス生成前にあらかじめ値を決めている変数の演算のみとする必要がある。要注意!!
    /*
    public double bmi = 0.0;
    public String bodyShape;
    public double appWeight = 0.0;
     */

    // methods
    public double getBmi() {
        return Math.round(weight / Math.pow(height, 2) * 100.0)/100.0;
    }
    // 日本肥満学会基準の体系判定
    public String getBodyShape() {
        String bodyShape = null;
        double bmi = getBmi();
        if (bmi < 18.5) {
            bodyShape = "低体重(痩せ型)";
        } else if (bmi < 25) {
            bodyShape = "普通体重";
        } else if (bmi < 30) {
            bodyShape = "肥満(1度)";
        } else if (bmi < 35) {
            bodyShape = "肥満(2度)";
        } else if (bmi < 40) {
            bodyShape = "肥満(3度)";
        } else if (bmi >= 40) {
            bodyShape = "肥満(4度)";
        } else {
            System.out.println("Error: 体形判別ができません。");
        }
        return bodyShape;
    }
    public double getAppWeight() {
         return Math.round(22*Math.pow(height, 2) * 100.0)/100.0;
    }
    // println()の出力形式のオーバーライド
    @Override
    public String toString() {
        return String.format("名前 %s 性別 %s 年齢 %d 身長 %.3fm 体重 %.2fkg BMI %.2f 適正体重 %.2fkg 判定：%s",
                getName(), getGender().getJpName(),getAge(),getHeight(),getWeight(),
                getBmi(),getAppWeight(),getBodyShape());
    }
}
