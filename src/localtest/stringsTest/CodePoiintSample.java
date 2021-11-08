package localtest.stringsTest;

class CodePoiintSample {
    public static void main(String[] args) {
        String keyword = "ABあい";
        // JavaのUnicode codepointを取得する。サロゲートペアなどの処理で使う。
        System.out.println(keyword.codePointAt(0));
        System.out.println(keyword.codePointAt(1));
        System.out.println(keyword.codePointAt(2));
        System.out.println(keyword.codePointAt(3));
        // indexの幅を超えると例外が発生する。配列処理時の普通の挙動。
        // System.out.println(keyword.codePointAt(4));
        System.out.println(keyword.codePointAt(keyword.length()-1));

    }
}
