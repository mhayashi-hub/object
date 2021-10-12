package basic.sample;

//スーパークラスのサンプル
class SuperSample {
    protected int number;

    public SuperSample(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "SuperSample{" +
                "number=" + number +
                '}';
    }
}

//継承のみのサブクラス
class SubSample1 extends SuperSample {
    public SubSample1(int number) {
        super(number);
    }
}

//フィールドとメソッドの追加とオーバーライドをしたサブクラス
class SubSample2 extends SuperSample {
    //追加したフィールド
    private String string;

    public SubSample2(int number, String string) {
        super(number);
        this.string = string;
    }

    //追加したメソッド
    public String getString() {
        return string;
    }

    //オーバーライドしたメソッド
    @Override
    public String toString() {
        return "SubSample2{" +
                "number=" + number +
                ", string='" + string + '\'' +
                '}';
    }
}

public class InheritanceSample1 {
    public static void main(String[] args) {
        //スーパークラスの型での宣言
        SuperSample superSample = new SuperSample(10);
        SuperSample subSample1 = new SubSample1(10);
        SuperSample subSample2 = new SubSample2(10,"abc");

        //各インスタンスの振る舞い
        //振る舞いはどのクラスのインスタンスによるかで決まる
        System.out.println(superSample);
        System.out.println(subSample1);
        System.out.println(subSample2);

        //型による制約
        //型のクラスに存在しないメソッドは利用できない
        SubSample2 subSample3 = (SubSample2) subSample2;
        //SubSample2型でないと追加されたメソッドは使用できない
        System.out.println(subSample3.getString());
    }
}
