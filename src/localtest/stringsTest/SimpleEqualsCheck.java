package localtest.stringsTest;

import java.util.Objects;

class SimpleEqualsCheck {
    public static void main(String[] args) {
        String message = "Hello!";
        // equalsによる文字列比較、大文字小文字を比較してチェックできる。ので、下記の結果はfalseになる。
        System.out.println(message.equals("hello!"));
        // equalsIgnoreCaseでは大文字小文字の差異を無視して同じ文字として判定する。下記の結果はtrue。
        System.out.println(message.equalsIgnoreCase("hello!"));
        // ==演算子についての注意：オブジェクト全体を比較するため、インスタンスの参照の場合は等価と判定するが、
        //                     文字列そのものの比較にはならない。ので文字列の比較に使うべきではない。
        // 特に結合で作った文字列などとの比較は==演算子では、文字列の比較として処理できない。
        // 例外的に、Stringで生成した同じ文字列をもつ別々のインスタンスは同じオブジェクトを参照していることになるらしい。
        // テキストデータとして重複を避けるため同一インスタンスの参照にしている？
        String jMessage1 = "いろは";
        String jMessage2 = "いろ";
        System.out.println(jMessage1.equals(jMessage2+"は"));
        System.out.println(jMessage1 == (jMessage2 +"は"));
        System.out.println(jMessage1);
        System.out.println(jMessage2 +"は");

        // compareTo()メソッドも使える。こちらの返り値は文字列が一致するなら0を返す。
        // 0以外の場合は辞書的な順番での並びの違いなどがもどるが、詳細な差異をチェックするには向かない？
        // つまりオブジェクトではなく文字列の文字単位で比較して一致を判定している。
        System.out.println(jMessage1.compareTo(jMessage2));
        System.out.println(jMessage1.compareTo(jMessage2 + "は"));

        // 空文字列""とnullの比較
        // nullオブジェクトとequalsで比較する場合、環境によりnullPointerExceptionが発生する場合があるので注意する。
        String mes = "aaa";
        String naobj = null;
        // この場合は調査対象が一般オブジェクトでそのメソッドを使うので比較対象がnullオブジェクトでもfalseがでるだけ。
        System.out.println(mes.equals(naobj));
        // 調査対象がnullオブジェクトの場合、比較対象が一般のオブジェクトでもnullPointerExceptionが発生する。
        // System.out.println(naobj.equals(mes));
        // Objects.equals()メソッドで比較してみる。
        String naobj2 = null;
        // Objects.equals()の場合、どちらがnullオブジェクトでもnullPointerExceptionは出ない。
        System.out.println(Objects.equals(mes,naobj));
        System.out.println(Objects.equals(naobj,mes));
        // nullオブジェクト同士を比較した場合、きちんとtrueが出る。
        System.out.println(Objects.equals(naobj,naobj2));

        // nullオブジェクトであるかのチェックは==演算子でnullとの比較チェックで可能。
        if (mes == null) {
            System.out.println("チェック対象はnullオブジェクトです。");
        } else {
            System.out.println("チェック対象はnullではありません。");
        }
        if (naobj2 == null) {
            System.out.println("チェック対象はnullオブジェクトです。");
        } else {
            System.out.println("チェック対象はnullではありません。");
        }
        // ""空文字列のテスト。
        String mes2 = "abdcb";
        String space2 = "";
        // 調査対象が一般オブジェクト、比較対象が空文字列のオブジェクトの場合のequalsの挙動はfalseが出る。
        System.out.println(mes2.equals(space2));
        // 調査対象が空文字列、比較対象が一般文字列の場合、やっぱりfalseになる。順当な結果。
        System.out.println(space2.equals(mes2));
        // 調査、比較対象がどちらも空文字列の場合は、trueが出る。
        String space3 = "";
        System.out.println(space2.equals(space3));
        // Objects.equals()を使った場合の挙動。どれも不一致ならfalse、空文字列でも一致ならtrueを返す。
        System.out.println(Objects.equals(mes2,space2));
        System.out.println(Objects.equals(space2,mes2));
        System.out.println(Objects.equals(space2,space3));
    }
}
