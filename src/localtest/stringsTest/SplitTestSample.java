package localtest.stringsTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SplitTestSample {
    public static void main(String[] args) {
        // 区切り文字として指定してその文字で配列に分ける。
        String testSentence1 = "a,b,c,d";
        String[] splitResult1 = testSentence1.split(",");
        for (String result:splitResult1) {
            System.out.println(result);
        }
        System.out.println(splitResult1.length);
        System.out.println();

        // 区切り文字を入れないで配列に分割すると、一文字ごとに分割した配列になる。
        String[] splitResult2 = testSentence1.split("");
        for (String res:splitResult2) {
            System.out.println(res);
        }
        System.out.println(splitResult2.length);
        System.out.println();
        // 区切り文字の指定に正規表現パターンも指定できる。
        String testSentence2 = "a,b:C.d;E,F.G,F";
        String[] splitResult3 = testSentence2.split("[,:;.]");
        for (String reply:splitResult3) {
            System.out.println(reply);
        }
        System.out.println(splitResult3.length);
        System.out.println();
        // 区切り文字で配列に切り出す際に、切り出す上限数を指定できる。
        // 上限数を設定すると上限-1までは普通に切り出し、残りを最後の配列に入れる。
        String[] splitResult4 = testSentence2.split("[,:;.]",4);
        for (String ret:splitResult4) {
            System.out.println(ret);
        }
        System.out.println(splitResult4.length);
        System.out.println();
        // 文字列の末尾が空白の場合も要素として分割する方法。
        String testSentence3 = "a,b,,c,d,,";
        String[] splitResult5a = testSentence3.split(",");
        for (String result:splitResult5a) {
            System.out.println(result);
        }
        System.out.println(splitResult5a.length);
        System.out.println();
        // 末尾に区切り文字のみで内容が空白(,,など)の場合に、その空白を要素として取り込んで配列に設定する方法。
        // 要素制限数に-1を設定する。メソッド側の定義の場合は負数を設定すると配列にパターンに合致するものを
        // 極力分割して割り当てるようにするらしい。一番有用な事例が文字列末尾の区切り文字連続部分か？
        // 中間の空白で区切り文字だけ連続した部分は負数の制限値を設定しなくてもきちんと要素として分割されてる。
        String[] splitResult5b = testSentence3.split(",",-1);
        for (String result:splitResult5b) {
            System.out.println(result);
        }
        System.out.println(splitResult5b.length);
        System.out.println();

        // 配列だけでなくリスト化もできる。
        List<String> list = new ArrayList<>();
        // 配列に一度分割するのは必須？
        // String[] alist1 = testSentence3.split(",",-1);
        // CollectionsクラスのaddAllだとリストに対して配列を要素ごとで追加処理できるっぽい。
        // リスト 配列の順で指定して配列をリスト化できる。
        // Collections.addAll(list,alist1);
        // Collections.addAllを使えば、配列指定する場所で直接splitで配列に分割する処理を書けるので配列宣言不要か？
        Collections.addAll(list,testSentence3.split(",",-1));
        // 分割時にasListで受けてArrayList化することができるらしいという説明もあるがこの方法はダメ。
        // asListで処理したものは配列形式のリストではないものになるため要素削除や追加のできない固定長配列になるため、
        // リストにする意義が半分くらい失われてしまう。
        // List<String> list = Arrays.asList(testSentence3.split(",",-1));
        for (String al:list) {
            System.out.println(al);
        }
        System.out.println(list.size());
        System.out.println();

        list.add("g");
        for (String al:list) {
            System.out.println(al);
        }
        System.out.println(list.size());
        System.out.println();

    }
}
