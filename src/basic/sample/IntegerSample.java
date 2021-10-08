package basic.sample;

public class IntegerSample {
    public static void main(String[] args) {
        //クラスに設定された値(クラスフィールドと呼び,static修飾子が付く)
        System.out.println("Integerの最大値:" + Integer.MAX_VALUE);
        System.out.println("Integerの最小値:" + Integer.MIN_VALUE);

        //オートボクシング（プリミティブ→ラッパークラス）
        int i1 = 10;
        Integer integer1 = i1;
        System.out.println("基本型:" + i1);
        System.out.println("ラッパークラス:" + integer1);

        //アンボクシング
        Integer integer2 = 20;
        int i2 = integer2;
        System.out.println("基本型:" + i2);
        System.out.println("ラッパークラス:" + integer2);

        //基本型への変換メソッド
        byte b = integer1.byteValue();
        short s = integer2.shortValue();
        long l = integer1.longValue();
        float f = integer1.floatValue();
        double d = integer1.doubleValue();

        //文字列への変換メソッド
        String str = integer1.toString();

        //println()メソッドの引数に書くと自動的にtoString()が呼び出される
        System.out.println(integer1);

        //値の比較
        // 一般的な等価比較をする際にはequals()メソッドを使う。
        System.out.println(integer1.equals(10));//true
        // int型の数値についてはintegerの型と一致しているため、等価演算子を書いて判定できる。
        System.out.println(integer1 == 10);//true
        // 数値的には10と等価だが、10.0はdouble型、intでもintegerでもないため型不一致でfalseになる。
        System.out.println(integer1.equals(10.0));//false
    }
}
