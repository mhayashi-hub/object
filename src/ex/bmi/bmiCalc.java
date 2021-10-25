package ex.bmi;

import basic.sample.enumsample.Gender;

class bmiCalc {
    public static void main(String[] args) {

        // Memberクラスの動作確認用
        Member member1 = new Member("山田　太郎",Gender.MEN,33,1.657,99.2);
        System.out.println(member1.getAge());
        System.out.println(member1.getHeight());
        System.out.println(member1.getWeight());

        System.out.println(member1.getBmi());
        System.out.println(member1.getBodyShape());

        System.out.println(member1);
    }
}
