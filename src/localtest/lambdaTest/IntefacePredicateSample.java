package localtest.lambdaTest;

import java.util.function.Predicate;

class IntefacePredicateSample {
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
    }
}
