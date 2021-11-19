package localtest.lambdaTest;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class SampleFunctionalInterfaceLambda {
    public static void main(String[] args) {
        // 文字列入力、文字列出力の場合でFunctionインターフェースの場合
        // ラムダ式を使わないで書く。
        // Function c1 = new Function () {
        //     @Override
        //     public String apply(String a) {
        //
        //      return a +" です。";
        //   }
        // };
        // };
        // 省略せず書く。
        // Function<String,String> c1 = (String a) -> {return a +" です。";};
        // 引数一つなので(String a)の部分を省略して書く。
        // Function<String,String> c1 = a -> {return a +" です。";};
        // 実装の{}とreturnを省略して書く。
        Function<String,String> c1 = a -> a +" です。";
        System.out.println(c1.apply("赤"));
        // Integer入力、文字列出力の場合
        // 省略なしで書く。
        // Function<Integer,String> d1 = (Integer b) -> {return b +" です。";};
        // 引数一つなので省略して書く。
        // Function<Integer,String> d1 = b -> {return b +" です。";};
        // 実装の{}とreturnを省略して書く。
        Function<Integer,String> d1 = b -> b +" です。";
        System.out.println(d1.apply(2));
        // Consumerインターフェースの場合、最初から省略して書く。
        Consumer<Integer> e1 = a -> System.out.println(a +" を入力しました。");
        // 上はあくまでもインターフェースでのインスタンス生成と実装の作成なのでこれだけでは動かない。
        // Consumerの場合はacceptで戻り値なしのメソッドとして実装の内容を実行できる。
        // 戻り値がないのでreturnは書かない。省略する先もないので他のメソッドを指定したりする？
        e1.accept(6);
        // 引数、戻り値：booleanのインターフェースPredicateの場合
        // 最初から省略型で書く。戻り値booleanのためbooleanを返すメソッドをたたかせることに注意。
        Predicate<String> f1 = b -> b.isEmpty();
        System.out.println(f1.test("a"));
        System.out.println(f1.test(""));
        // 引数なし、戻り値ありのSupplierインターフェースの場合
        // 引数なしで値をとってくるのでgetterとの相性が良いか？
        Supplier <String> g1 = () -> "青葉です。";
        System.out.println(g1.get());
    }
}
