package localtest.streamAPITest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class IntStreamSample {

    public static void main(String[] args) {
        // IntStreamは要素がintの場合に使える。
        // IntStreamでインスタンスを作るテスト。
        // IntStreamで配列？リスト的なものを作ってその合計を生成して変数aに代入しているので変数は配列でなくてよい。
        // IntStreamで生成したものは数値のストリームと呼ぶらしい。(配列でもリストでもマップでもないから？)
        // ↑Streamインスタンスとして生成してるからストリームでいいらしい。インスタンスなのでその中のメソッドを呼ぶことが可能。
        // また、IntStreamは配列をofで読み込ませても、Arrays.streamに数字の配列を読み込ませても
        // 数字のストリームとして処理できる。
        int a = IntStream.of(3,1,4,5,6).sum();
        System.out.println(a);
        System.out.println();
        IntStream ab = IntStream.of(3,1,4,5,6);
        ab.forEach(System.out::println);
        System.out.println();
        int[] bb = {1,2,4,5,6};
        System.out.println(IntStream.of(bb).sum());
        System.out.println();
        IntStream.of(bb).forEach(System.out::println);
        System.out.println(Arrays.stream(bb).sum());
        System.out.println();
        // rangeClosedで指定した始点から終点までの数値のストリームを生成するテスト。
        int b = IntStream.rangeClosed(1,10).sum();
        System.out.println(b);
        IntStream.rangeClosed(2,8).forEach(System.out::println);
        System.out.println();
        // rangeとrangeClosedとの比較テスト。
        // rangeだと指定した最終値に到達しない値までを順序数として取り出す。
        // rangeClosedだと指定した最終地をとる値まで取り出す。
        IntStream.range(2,9).forEach(System.out::println);
        System.out.println();
        IntStream.rangeClosed(2,9).forEach(System.out::println);
        System.out.println();
        // iterateは始点、繰り返し実行内容を指定してループ的な繰り返し処理を生成する仕組み。
        // ただし繰り返し処理を止める指定がないので延々生成しまくる。limit等で生成条件に
        // あらかじめ上限制限をかけておくほうが良い。
        // また、sumメソッドも準備されている。
        System.out.println(IntStream.iterate(2, bi -> bi+2).limit(5).sum());
        System.out.println();
        IntStream.iterate(2, c -> c+3).limit(4).forEach(System.out::println);
        // また英字一文字はメソッドなどで予約されている場合があり得るのでIDEなどのメッセージを確認すること。
        IntStream.iterate(1, c -> c+1).limit(20).forEach(System.out::println);
        // 平均、最大最小をとる手法のテスト。average(),max(),min()はOptional型になるので扱いにくい。
        // averageはgetAsDouble、max/minはgetAsIntがきちんと用意されている。
        System.out.println(IntStream.iterate(1, c -> c + 2).limit(20).average().getAsDouble());
        System.out.println(IntStream.iterate(1, c -> c + 2).limit(20).max().getAsInt());
        System.out.println(IntStream.iterate(1, c -> c + 2).limit(20).min().getAsInt());
        IntStream.iterate(1,c -> c+2).limit(20).forEach(System.out::println);
        System.out.println();
        // IntStream自体がインスタンス生成できるクラスなので、IntStreamインスタンスをconcatで結合できる。
        // ただし結合したストリームは値ではなくストリームインスタンス同士で、フラットなストリームではないので
        // 扱いが難しい。(両方のストリームが開いたまま、二つのIntのストリームを持ったインスタンスになるため？)
        // 一度フラットなストリームにマッピングしなおした方がいい？
        // ↑マッピング方法がわからない、というか結合しただけでも例外が発生したりする。
        // Streamって生成後は結合もできるがそういう機能を使わない方がいい？扱いが何かおかしい感じ？
        // 下記はなぜかconcatで結合しただけで例外が発生する。わけがわからない。
        // IntStream c1 = IntStream.concat(ab,IntStream.of(bb));
        // 下記の記述(どちらもIntStream.ofで単一の数値or数値の複数要素からIntStreamを作成)では例外は出ない。なぜ？
        IntStream c1 = IntStream.concat(IntStream.of(a,a),IntStream.of(bb));
        System.out.println(c1.sum());
        // ただし結合済みのc1 IntStreamインスタンスの要素を列挙して出力させようとすると例外になる。意味不明。
        // c1.forEach(System.out::println);
        // IntStreamを結合したはずなのだけどなぜかforEachで要素表示させようとすると例外を出す。なぜか？
        // 結合の際に一つが要素一つのみのIntStreamだと問題になるのか？
        // ↑ちがうっぽい。IntStreamとIntStreamをconcatで結合するとどうも普通のIntStreamとして
        // 個別要素を扱うことが難しくなる？連結は即時ではなく遅延結合っぽいので一度フラット化してきれいな
        // IntStreamに変換した方が良い？
        // c1.forEach(System.out::println);
        // StreamからIntStreamへのマップによる変換のテスト。
        // Integerのリスト作成
        List<Integer> numlist1 = new ArrayList<>();
        numlist1.add(1);
        numlist1.add(2);
        numlist1.add(1);
        numlist1.add(3);
        numlist1.add(6);
        // Integerのストリーム作成。.stream()で生成できる。
        Stream<Integer> stream1 = numlist1.stream();
        // StreamからIntStreamへのマッピング。
        IntStream intStream1 = stream1.mapToInt(i -> i);
        intStream1.forEach(System.out::println);
        // StreamからマッピングしたIntStreamインスタンスでsumを取得しようとしたら例外。意味不明。
        // System.out.println(intStream1.sum());
        System.out.println();

        // IntStreamの結合のテストやり直し。
        IntStream is1 = IntStream.of(1,2,3);
        IntStream is2 = IntStream.of(4,5,6);
        IntStream is3 = IntStream.concat(is1, is2);
        is3.forEach(System.out::println);
        System.out.println();
        // どうもIntStreamを連結した後にsumとかを行うと例外発生するようだ。
        // 扱いが変になっている？フラットなIntStreamにしてないから？いずれにしても仕様不明だし結果が不安定すぎて怖い。
        // IntStreamを結合したIntStreamではsumメソッドは例外を出し続けている。意味不明。
        // int ia3 = is3.sum();
        System.out.println(is3.sum());
        // System.out.println(ia3);

        // IntStreamからStreamへの変換テスト。
        // IntStreamをboxedメソッドでStreamインスタンスに変換する場合も例外が発生。わけがわからない。
        // Stream<Integer> stream2 = is1.boxed();
        // stream2.forEach(System.out::println);
        // Streamでのconcatは必要？concatした後のメソッド処理やconcat自体で問題が発生する可能性がある。
        // Streamで二つ以上の入力を与えるくらいならListやMapにまとめた後に単体でStream処理した方がよさそう。
    }
}
