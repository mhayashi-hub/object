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
        // -> Stream同士をconcatの中で生成して結合すると、Streamの構成要素自体がStreamになって扱えなくなる。
        //    Streamの中身にアクセスできなくなるし取り出せなくなるので結合処理をする意味はないのでは？
        Stream outStream1 = Stream.concat(Stream.of(list1),Stream.of(list2));
        outStream1.forEach(System.out::println);
        // filterで要素を取り出せないか考えてみたがうまくStream要素のみ一つを取り出す方法が思いつかない。
        // Stream outStream1a1 = outStream1.limit(1);
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
        // 　　内部要素のStreamにアクセスできないので使いものにならなくなる？
        System.out.println();

        // IntStreamの結合テスト。
        // まず入力データとしてInteger要素のリスト作成。
        // int要素はリストには指定できないのでInteger型で作成する。後の変換等でも気にしておくべき？
        List<Integer> intList1 = new ArrayList<> ();
        intList1.add(1);
        intList1.add(2);
        intList1.add(1);
        intList1.add(4);
        intList1.add(3);
        // Listの型はIntegerなのでIntStream生成時点でmapToInt(Integer::intValue)を通しておかないとダメっぽい。
        IntStream inIntStream1 = intList1.stream().mapToInt(Integer::intValue);
        List<Integer> intList2 = new ArrayList<> ();
        intList2.add(10);
        intList2.add(9);
        intList2.add(8);
        intList2.add(15);
        intList2.add(7);
        intList2.add(12);
        intList2.add(12);
        IntStream inIntStream2 = intList2.stream().mapToInt(Integer::intValue);
        // Listでの型はIntegerしか許されないのでintの要素を持つはずのIntStreamなのに
        // List<Integer>から生成するとInteger型をもつStreamになってしまう。
        // この状態だとmaxやsumなどの終端メソッドが使えない(具体的には型不一致で例外が出る)。
        // 要素forEachでの列挙出力は可能。int型でなくても処理できるから？
        intList1.stream().forEach(System.out::println);
        // なぜか要素のカウントはできる。要素数はint型でなくても扱えるから？
        System.out.println(intList1.stream().count());
        // なので途中でmapToIntでIntegerからintValueメソッドでint型に変換してしまえばよい？
        // -> これだけでは不十分？maxなどの出力はOptional型になっているのでgetAsIntとかで変換を挟む必要がある。
        System.out.println("最大値："+ intList1.stream().mapToInt(Integer::intValue).max().getAsInt());
        intList2.stream().forEach(System.out::println);
        System.out.println(intList2.stream().count());
        // sumもmapToInt(Integer::intValue)がその前に必要、ただしこちらはどうもint型で出力するようだ。
        System.out.println("合計値："+ intList2.stream().mapToInt(Integer::intValue).sum());
        System.out.println("最大値："+ intList2.stream().mapToInt(Integer::intValue).max().getAsInt());
        // IntStreamの結合テスト。
        // ListはInteger型なので最初からIntStream.ofでその場でのIntStream生成ができない。
        IntStream intMergeStream1 = IntStream.concat(inIntStream1, inIntStream2);
        // もしかして終端処理のforEachが呼ばれるとIntStreamは終了してしまうので以後アクセスできない？
        // 本来はインスタンスとして実行時永続的なものではなく生成から終端までの寿命なのでこういう使い方はすべきではない？
        // -> たぶん、IntStream生成後に中間処理を一度でも行うとStreamを閉じる仕組みになっている？
        //    なので、処理を一つだけ行って出力で終端処理してしまうとStreamは閉じて破棄されるのでもうアクセスできなくなる？
        //    -> Streamインスタンス、プリミティブ型のSreamインスタンスも普通は一度作成したら必ず消費してしまい、
        //       再利用しない前提の1liner式で使う方がよさそうか？
        // intMergeStream1.forEach(System.out::println);
        // System.out.println(intMergeStream1.count());
        // System.out.println(intMergeStream1.min().getAsInt());
        // System.out.println(intMergeStream1.max().getAsInt());
        System.out.println(intMergeStream1.sum());
        // forEachでなくても最後が消費型のprintlnとかの場合はStreamがcloseされるっぽい。
        // 一回だけ処理実行可能、という制限がつくならインスタンス生成してconcatとかはやるだけ無駄が多いし危険な気がする。

    }
}
