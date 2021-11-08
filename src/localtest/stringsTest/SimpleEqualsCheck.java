package localtest.stringsTest;

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
    }
}
