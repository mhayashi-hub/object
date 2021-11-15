package localtest.streamAPITest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class StreamSample {
    public static void main(String[] args) {
        // サンプルとするリスト作成と内容確認
        List<String> list1 = new ArrayList<> ();
        list1.add("赤");
        list1.add("青");
        list1.add("朱");
        list1.add("緑");
        list1.add("黄緑");
        list1.add("橙");
        list1.add("オレンジ");
        for (String cName:list1) {
            System.out.println("色名は "+ cName +" です。");
        }
        // streamを作成して処理する基本形式。mapで処理してforEachで個別出力。
        list1.stream()
                // streamのmapメソッドで各要素を指定して文字列を追加、
                // 追加状態はstream処理中は個別要素に付随して保持される。
                .map(cName -> "色名："+ cName +" です。")
                // forEachメソッドで個別要素を取り出して処理、処理内容はメソッド参照(::)でprintlnに渡している。
                .forEach(System.out::println);
        // streamインスタンスをfilterで選別して処理する形式、filiterとforEachで出力。
        list1.stream()
                // filterメソッドで各要素についてふるい分けの条件を指定、
                // 要素の指定の枠としての変数はローカル変数で被らなければ何でもよい
                // 条件判定はfilterメソッド内で判定結果をtrue/falseで返せる処理内容だけ、
                // trueとなった要素だけ新しいstreamとして次の処理に渡される。
                .filter(cName -> cName.length() >= 2)
                // forEachメソッドで個別要素についてのprintlnのメソッド参照での処理(最終結果としては出力が出る)。
                .forEach(System.out::println);
        // 重複文字のある一文字のリストをサンプルとして構築、内容確認。
        List<String> list2 = new ArrayList<> ();
        list2.add("A");
        list2.add("B");
        list2.add("D");
        list2.add("a");
        list2.add("A");
        list2.add("C");
        list2.add("A");
        list2.add("C");
        list2.add("E");
        for (String element:list2) {
            System.out.println(element);
        }
        System.out.println();
        // streamでのdistinct処理形式。
        // distinctはいわゆるuniqコマンドと同じように同一内容の要素を削って一つごとにユニークな要素のみ残すもの。
        list2.stream().distinct().forEach(System.out::println);
        System.out.println();
        // streamでのsorted処理形式。
        // sortedはsort機能。指定なしで辞書通りの昇順になるはず。
        list2.stream().sorted().forEach(System.out::println);
        System.out.println();
        // ComparatorからreverseOrderをパワーんに指定すると降順にできる。
        list2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println();
        // distinctと組み合わせのテスト。
        list2.stream().distinct().sorted().forEach(System.out::println);
        System.out.println();
        // streamでのlimit処理形式。streamで出力した要素数を指定した数まで削減する。
        list2.stream().limit(4).forEach(System.out::println);
        System.out.println();
        // distinctとの組み合わせ例。
        list2.stream().distinct().limit(5).forEach(System.out::println);
        System.out.println();
        // distinctしてsortedしての組み合わせ。
        list2.stream().distinct().sorted().limit(5).forEach(System.out::println);
        System.out.println();
        // countでの要素数カウント。
        System.out.println(list2.stream().count());
        System.out.println();
        // findFirstでの先頭要素取得。取得した要素の型はOptionalになるので、getメソッドを使って出力した方がいい
        System.out.println(list2.stream().findFirst());
        System.out.println(list2.stream().findFirst().get());
        System.out.println();
        // 要素を加工してリストを返すcollectメソッドとその中で実行するtoListメソッドを使う形式。
        // collect()メソッドではCollectorsのメソッドで分類、リストへの変換などが行える。リストへの変換はtoList()メソッド。
        System.out.println(list2.stream().map(a -> a + " でした。").collect(Collectors.toList()));
        list2.stream().map(a -> a +" でした。").collect(Collectors.toList()).forEach(System.out::println);
        System.out.println();
        // filteringはうまく動くサンプルを考え付かないので途中で止めておく。
        // list2.stream().map(a -> a +" 要素").collect(Collectors.filtering(s -> String::contains("a"))).forEach(System.out::println);
    }
}
