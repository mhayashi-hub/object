package localtest.lambdaTest;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class InterfacePredicateSample {
    public static void main(String[] args) {
        int c1 = 10;

        boolean bool1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer c1) {
                // 初期化漏れ対策のため一度falseで初期化する。
                boolean b2 = false;
                // 判定ロジックの実装。
                if (c1 == 1) {
                    b2 = true;
                } else {
                    b2 = false;
                }
                return b2;
                // 戻り値はbooleanなのでどちらかを出力することが強制される。
            }
        }.test(c1);
        System.out.println(bool1);
        System.out.println();

        // メソッド呼び出しと関数型インターフェースの定義の部分を分離して書く。
        Predicate predicateTest = new Predicate<Integer> () {
            @Override
            public boolean test(Integer c1) {
                boolean b2 = false;
                if (c1 == 1) {
                    b2 = true;
                } else {
                    b2 = false;
                };
                return b2;
            };
        };
        boolean bool1a = predicateTest.test(c1);
        System.out.println(bool1a);
        System.out.println();
        // Predicateインターフェースの部分をラムダ式にする。
        Predicate<Integer> predicateLambda = (Integer cs) -> {
            boolean b2 = false;
            if (cs == 1) {
                b2 = true;
            } else {
                b2 = false;
            };
            return b2;
        };
        boolean bool1b = predicateLambda.test(c1);
        System.out.println(bool1b);
        System.out.println();
        // もう少し省略、if文も簡素化してみる。
        Predicate<Integer> predicateSimple = ca -> {
            boolean b2 = false;
            if (ca == 1) b2 = true;
            return b2;
        };
        System.out.println(predicateSimple.test(c1));
        System.out.println();
        // Streamが使えるか、と思ったが処理中の値も結果も単一の値なのでStreamを使うまでもないか？
        // 一応Stream.ofでBooleanのstreamを作成することは可能。
        Stream<Boolean> booleanStream = Stream.of(predicateSimple.test(c1));
        booleanStream.forEach(System.out::println);
        System.out.println();
        // ついでにPredicateの中身は入力と出力が同じ型でないので簡単にlambda式にできない。
        // Predicateで実装してる対象の処理がlambda式には不向き。
        // (returnがbooleanを返すが入力は結局intなので型は一致しない。)
        // 実装から考えるのではなくロジックから考えてみたが、Stream自体は複数の値を処理するのに向いており、
        // 単一の値を入れて取り出すのは可能だが実装テクニック的に練習以外にあまり意味はない。
        // Predicateで処理しているのは条件判定でtrueかfalseのbooleanを返すが入力はintなので、
        // Stream処理で同じ値を返すような仕組みは作りにくい。
        
    }
}
