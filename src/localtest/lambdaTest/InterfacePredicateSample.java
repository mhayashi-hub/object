package localtest.lambdaTest;

import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class InterfacePredicateSample {
    public static void main(String[] args) {
        int c1 = 1;

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
        // 実装したい内容の整理。
        // 必要なのは入力値がint相当であること、その数値が1かどうか判定するロジック、
        // testメソッドの出力結果はbooleanでtrue/falseのどちらかのみ、booelan型であること。
        // つまりif文判定ではなくbooleanで結果を出すequalsなどのメソッドでもよい。
        // また、戻り値がequalsではbooleanに決まっている上に一行で終わるのでさらに省略できる。
        // Predicateはbooleanを返す前提として決められた関数型インターフェースで、
        // Predicateに与える型は引数の型、のため入力型に合わせた判定ロジックを選び、出力を
        // boolean前提でロジックを単純化すればうまく書けるか？
        Predicate<Integer> c3 = a -> a.equals(1);
        System.out.println(c3.test(c1));
        System.out.println();

        // Streamが使えるか、と思ったが処理中の値も結果も単一の値なのでStreamを使うまでもないか？
        // 一応Stream.ofでBooleanのstreamを作成することは可能。
        // Streamはobject型を指定して生成できるのでbooleanのStreamを生成することも可能。
        // booleanは一応Stringと同等のメソッドを持つはず。
        Stream<Boolean> booleanStream = Stream.of(predicateSimple.test(c1));
        booleanStream.forEach(System.out::println);
        System.out.println();
        // ついでにPredicateの中身は入力と出力が同じ型にはならない、というか出力は常にbooleanのはず。
        // そういう前提で関数型インターフェースとして定義されている。
        // (returnがbooleanを返すが入力は様々。なので入力と出力が同じ型、という前提は捨てて考えるべき。)
        // 実装から考えるのではなくロジックから考えてみたが、Stream自体は複数の値を処理するのに向いており、
        // 単一の値を入れて取り出すのは可能だが実装テクニック的に練習以外にあまり意味はない。
        // StreamにPredicateを組み合わせて処理する条件判定については
        // allMatch,anyMatch,noneMatchで中の判定式の結果について
        // 全部一致するか、どれか一つは一致するか、何も一致しないかの判定でbooleanを返せる。

        // もう一度Streamで書く試行。Streamは一要素でも作成可能。(コスト的に良いかは不明、実行は可能。)
        // 今回の入力要素はintなのでIntStreamでよい。
        // 判定ロジックはallMatchで戻り値判定がtrue/falseのbooleanになるのでそれを使う。
        // allMatchメソッドならその中に条件式を書ける。出力はallMatchの形式でbooleanになる。
        IntStream intStreamC1 =  IntStream.of(c1);
        System.out.println(intStreamC1.boxed().allMatch(a -> a.equals(1)));
        System.out.println();

    }
}
