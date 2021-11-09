package localtest.stringsTest;

class ValueOfConvSample {
    public static void main(String[] args) {
        int num1 = 100;
        long num2 = 200;
        float num3 = 100.25f;
        double num4 = 120.36;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        // 数値型を文字列型に変換、String.valueOf()を使用する。
        // 単純に標準出力に表示するだけでは一見してわからないが、Stringクラスで作ったインスタンスに入れられるので
        // 文字列型になっていることがわかる。
        // (消費型インスタンスとしてメソッドの中に入れるとコンパイルエラーやIDEの静的チェックが働きにくくなる？)
        String string1 = String.valueOf(num1);
        String string2 = String.valueOf(num2);
        String string3 = String.valueOf(num3);
        String string4 = String.valueOf(num4);

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);
        // 文字列から数値への変換、同様に数値型.valueOf()を使う。
        // またはparse+数値型という個別メソッドも使える。
        int num11 = Integer.valueOf(string1);
        int num12 = Integer.parseInt(string1);
        System.out.println(num11);
        System.out.println(num12);
        // 一度文字列変換すると数値の型は情報がなくなるので、longだろうがintに入れられる。
        // ただしfloat-文字列-intとかだと小数点以下の値が欠落するので注意すること。
        // またlongの大きな数値をintに入れる場合、桁が合わない部分はやっぱり削られるので注意が必要。
        long num21 = Long.valueOf(string2);
        long num22 = Long.parseLong(string2);
        System.out.println(num21);
        System.out.println(num22);
        // 浮動小数点の文字列から数値への変換。注意するのは小数点の桁数削れ等での誤差発生とか。
        float num31 = Float.valueOf(string3);
        float num32 = Float.parseFloat(string3);
        System.out.println(num31);
        System.out.println(num32);

        double num41 = Double.valueOf(string4);
        double num42 = Double.parseDouble(string4);
        System.out.println(num41);
        System.out.println(num42);

        // 数値型同士の相互変換。
        int numA = 100;
        double numB = numA; // 型の違う変数に格納して暗黙的キャストで型変換実施
        System.out.println(numA);
        System.out.println(numB); // 同じ整数型で桁がどちらも許容範囲の型変換なので数値の欠落はない。
        double numC = 100.25;
        int numD =(int) numC; // 整数型と小数型なので型自体が合わず情報が欠落する。()内に型を指定して明示的キャストで変換。
        System.out.println(numC);
        System.out.println(numD);

    }
}
