package localtest.lambdaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class InterfaceConsumerSample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<> ();
        list1.add("赤");
        list1.add("青");
        list1.add("緑");
        // クラス化してConsumerを実装するのは別途クラスファイルを書くのが冗長すぎるので省略。
        // 書き方は基礎的なクラスにinterfaceをimpelementsで紐づけて実装を書く形式。
        // 匿名クラス化してConsumerを利用する。
        new Consumer<List<String>> () {
            @Override
            public void accept(List<String> list1) {
                for (String element:list1) {
                    System.out.println(element +" です。");
                }
            }
        }.accept(list1);
        // Overrideあり、匿名クラスでの書き方。forEachメソッドを使って拡張for文の部分はメソッド側に移している。
        list1.forEach(new Consumer<String> () {
            @Override
            public void accept(String t) {
                System.out.println(t + " です。");
            }
        });
        // 上記の匿名クラスをlambda式にして省略した書き方。
        list1.forEach((String t) -> {
            System.out.println(t + " です。");
        });
        // 引数の型は入出力で同一のため省略可能。
        list1.forEach((t) -> {
            System.out.println(t + " です。");
        });
        // 引数が一つだけなので引数をくくる()を省略可能。
        list1.forEach(t -> {
            System.out.println(t +" です。");
        });
        // {}ブロック内コードが一行で済んでいるので{}を省略して一行にまとめられる。
        list1.forEach(t -> System.out.println(t + " です。"));
        // 関数型インターフェースのメソッドと出力部のメソッドのシグネチャ(引数の型、数、並び)が一致していれば、
        // メソッド参照形式でメソッドに値を渡せる。ただし今回は入力(t)と出力(t + " です。")の内容が違うので無理。

        // lambda式でメソッド参照できる場合の書き方。
        list1.forEach(System.out::println);

        // lambda式＋streamでマッピングして入力の内容を加工してメソッド参照にできるようにした場合の書き方。
        list1.stream().map(s -> s + " です。").forEach(System.out::println);
    }
}
