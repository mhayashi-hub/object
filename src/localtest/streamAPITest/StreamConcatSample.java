package localtest.streamAPITest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class StreamConcatSample {
    public static void main(String[] args) {
        // StringのStreamの生成と結合のテスト。
        // 入力用データとなるリスト生成。
        List<String> list1 = new ArrayList<> ();
        list1.add("赤");
        list1.add("青");
        list1.add("だいだい");
        list1.add("黄緑");
        List<String> list2 = new ArrayList<> ();
        list2.add("blue");
        list2.add("green");
        list2.add("red");
        list2.add("orange");
        list2.add("Brown");
        // 単体でのStreamによるcountと要素すべての出力のテスト。
        System.out.println(list1.stream().count());
        list1.stream().forEach(System.out::println);
        System.out.println(list2.stream().count());
        list2.stream().forEach(System.out::println);
        Stream list1Stream = list1.stream();
        Stream list2Stream = list2.stream();
        // Stream<String>の結合テスト。
        // -> Stream同士をcontcatの中で生成して結合すると、Streamの構成要素自体がStreamになって扱えなくなる。
        //    Streamの中身にアクセスできなくなるし取り出せなくなるので結合処理をする意味はないのでは？
        Stream outStream1 = Stream.concat(Stream.of(list1),Stream.of(list2));
        outStream1.forEach(System.out::println);
        // Stream.ofでその場でStreamを生成した場合はStreamが要素として組み入れられるが、事前に作成した
        // Streamインスタンスの場合はStreamインスタンスではなくStreamの各要素が格納される。
        // -> Streamはコンパイルでプリミティブな処理に置き換えて結果を出力して渡すからこうなる？
        //    それだとconcatの内部でStream.ofを使うのでなぜStream型が要素になるのか、意味不明。
        //    -> 一応、Streamインスタンスの結合の際はその場で生成させて結合しない(禁忌)としておいた方が安全か。
        //    多分この型の相違が発生するので、Stream.ofと生成済みStreamインスタンスをまぜて結合すると、
        //    Streamの結合処理で型不一致による例外が発生する？
        Stream outStream2 = Stream.concat(list1Stream,list2Stream);
        outStream2.forEach(System.out::println);
        // 作成済みStreamインスタンス同士を結合するとあたらしいStreamインスタンスとして要素に元のStreamの要素の
        // 型を保持したものがまとめて入れられてStreamインスタンスとなる。
        // System.out.println(outStream2.count());
        // なので、Stream自体をカウントすることはcount()メソッドにはできないので例外が発生。
        // System.out.println(outStream1.count());
        // Streamを結合した場合、Stream群となるがその要素ごとに処理すればどうにかなる？
        // いやStreamの処理対象はあくまでも一つでは？
        // -> その通り、StreamAPIの仕組みだと最初に見つかる外側のStreamのみ処理対象になるし、要素として
        // 　　内部要素のStreamにアクセスできないので使いものにならなくなる。要注意！

        // IntStreamの結合テスト。
        // まず入力データとしてInteger要素のリスト作成。
        // int要素はリストには指定できないのでInteger型で作成する。後の変換等でも気にしておくべき？
        List<Integer> intList1 = new ArrayList<> ();
        intList1.add(1);
        intList1.add(2);
        intList1.add(1);
        intList1.add(4);
        intList1.add(3);
        List<Integer> intList2 = new ArrayList<> ();
        intList2.add(10);
        intList2.add(9);
        intList2.add(8);
        intList2.add(15);
        intList2.add(7);
        intList2.add(12);
        intList2.add(12);
        System.out.println(intList1.stream().count());
        intList1.stream().forEach(System.out::println);
        System.out.println(intList1.stream().count());
        System.out.println(intList1.stream().sum());
        System.out.println(intList2.stream().count());
        intList1.stream().forEach(System.out::println);
        System.out.println(intList2.stream().count());
        // System.out.println(intList2.stream().sum());

    }
}
