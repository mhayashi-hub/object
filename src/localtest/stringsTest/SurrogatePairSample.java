package localtest.stringsTest;

class SurrogatePairSample {
    // surrogate pairはUnicodeの中に定義されていない複合文字を2つの文字コードで表現する手法。
    public static void main(String[] args) {
        String str = "叱る"; // 叱るはサロゲートペアの代表として定義。
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.codePointCount(0, str.length()));
        // サロゲートペアの有無によって特に結果が変わらないので、何のチェックをどうやってるのか不明。
        // そもそもサロゲートペアを使っているのか？utf-8でサロゲートペアがある？
        // -> Javaの文字列表現の定義としてsurrogate pairが出てくる。
        //    charを16bit分に定義した後でUnicodeが一文字21bitまで拡張されたための対策。
        // あと、str.length()で返される値が正しく換算されないのにそれを与える時点で矛盾を感じる。
        // -> この記述部分は参考サイト自体の知識が怪しいため無視しておく。
    }
}
