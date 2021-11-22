package localtest.lambdaTest;

import basic.sample.IntegerSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

class InterfaceFunctionSample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<> ();
        list1.add(20);
        list1.add(10);
        list1.add(1000);
        list1.add(100);
        list1.add(50);
        // 生成したリストがきちんとできているかの出力テスト。
        for (Integer num:list1) {
            System.out.println(num);
        }
        // Functionインターフェースを使用しての実装と出力表示。
        // Functionインターフェースでの実装の部分、実装によってリストを変換(ここではソート)して新しいリストに出力する。
        List<Integer> list2 = new Function<List<Integer>,List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> list2){
                Collections.sort(list2);
                return list2;
            }
        }.apply(list1);
        // 変換したリストの内容を確認する出力テスト。
        for (Integer num:list2) {
            System.out.println(num +" を出力します。");
        }
        System.out.println();

        // 実装を含めた式を整理。まずlist1に対しての加工メソッドを持つlistを定義する。
        // applyメソッドを実装したいがどこに実装するかを考えた場合、結果のリストに実装はできない。
        // (結果のリストはすでにapply相当の処理を適用した後の結果なので、そこに実装しても使えない。)
        // となると中間処理で加工するインスタンスとして同じList<Integer>型の物を持つべきかと思ったが、
        // Functionインターフェースの実装なので無名クラス実装としてFunctionを型に取り、
        // list1convという無名クラスを定義する。この時はapplyでのlist変換が実装できれば良い。
        Function<List<Integer>, List<Integer>> list1conv = new Function<>() {
            @Override
            public List<Integer> apply(List<Integer> list1conv) {
               Collections.sort(list1conv);
               return list1conv;
            }
        };
        // リストの加工用(に準備したインスタンスとその中にある)メソッドが実装できたので、それを使ってリストを加工する。
        List<Integer> list2a = list1conv.apply(list1);
        // 加工したリストの内容を確認するための出力テスト。
        for (Integer num:list2a) {
            System.out.println(num +" を出力します。");
        }
        System.out.println();

        // 無名クラス実装部分を省略してラムダ式に変換する。
        // ラムダ式の中の引数は仮の引数であり実際は外では定義されないし参照できない。あくまでも引数として渡すのに
        // なにかの枠がいる部 分を埋めるためのものなので、使い捨ての仮の変数でよい。
        // return部分は一行に変換可能か？<-変換しなくても一応ラムダ式ではある。
        Function<List<Integer>, List<Integer>> list1conva = (List<Integer> list) -> {
            Collections.sort(list);
            return list;
        };
        // Functionインターフェースではapplyメソッドしか存在しない(関数型インターフェースではメソッドは一つのみ)ので、
        // applyの実装部分を書いていてもapplyと書くことを省略できる。
        // (書いた実装はFunctionであるかぎりapplyに適用されると自明的に判断できるため。
        //  これが関数型の特徴でラムダ式の省略で活用されている。)
        List<Integer> list2b = list1conva.apply(list1);
        for(Integer num:list2b) {
            System.out.println(num +" を出力します。");
        };
        System.out.println();
        // 結果のリストを生成した後の処理は、変換してみるとforEachで処理するのと同じか？
        // ここはFunctionではなくConsumerインターフェースでのラムダ式記述が使える。
        list2b.forEach(n -> System.out.println(n +" を出力します。"));
        System.out.println();

        // ラムダ式は関数型インターフェースFunctionを利用するための実装を書く部分での無名クラス実装の箇所で
        // 置き換えが可能、他の処理は無理か？
        // 一行でリスト生成するには、関数型インターフェースFunctionの処理がリスト生成に直結していないとダメか。

        // streamのmapでメソッド参照可能にして、 + lambdaで書きなおした場合。
        // ソートの場合はsorted()メソッド、出力の加工にはmap()メソッドが使えて、さらに出力部分にforEach、
        // その中でメソッド参照で標準出力への出力メソッドを呼び出している。
        list1.stream().sorted().map(s -> s +" を出力します。").forEach(System.out::println);
    }
}
