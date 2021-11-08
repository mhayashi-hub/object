package localtest.stringsTest;

class StartsEndsWithCheck {
    public static void main(String[] args) {
        String url = "http://www.examples.com/index.php";
        // startsWith()で「～～」で始まる、というキーワードで開始する文字列かの判定が可能。
        System.out.println(url.startsWith("http://"));
        System.out.println(url.startsWith("https://"));
        // endsWith()で「～～」で終わる、というキーワードで終了する文字列かどうかの判定が可能。
        System.out.println(url.endsWith(".php"));
        System.out.println(url.endsWith(".html"));
    }
}
