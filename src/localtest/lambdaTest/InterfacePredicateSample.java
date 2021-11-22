package localtest.lambdaTest;

import java.util.function.Predicate;
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
        // Streamが使えるか、と思ったが処理中の値も結果も単一の値なのでStreamを使うまでもない。
        // 使って書けなくもないがかなり冗長になって意味不明なのでやめておく。
        
    }
}
