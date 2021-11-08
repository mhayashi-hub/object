package localtest.stringsTest;

class AppendCheck {
    public static void main(String[] args) {
        // StringBuilderクラスで文字列を作成するとappend()メソッドで文字列を追加して連結できる。
        StringBuilder strings = new StringBuilder("あいうえおか");
        System.out.println(strings);
        strings.append("kikukeko");
        strings.append("さしすせそ");
        System.out.println(strings);
        // StringBufferクラスでも可能、StringBuilderとの違いはスレッドセーフであること。
        // つまりマルチスレッドプログラムではStringBuilderは使用しない(非推奨で危険)。
        StringBuffer strings2 = new StringBuffer("たちつてと");
        System.out.println(strings2);
        strings2.append("naninu");
        strings2.append("ねのはひふへほ");
        System.out.println(strings2);
        // StringBuilderを使わず"+"演算子で結合する場合、文字列インスタンスを再生成するため効率が悪い。
        // 消費型インスタンスなら影響は少ないが、変数や文字列を結合して新しい文字列にする場合、
        // 最初から可変長文字列型として作られるStringBuilder/StringBufferの方が扱いやすいし効率が良い。
        String sampleString = "aaaa";
        System.out.println(sampleString);
        String sample2 = sampleString + "bbcc";
        System.out.println(sample2);
    }
}
