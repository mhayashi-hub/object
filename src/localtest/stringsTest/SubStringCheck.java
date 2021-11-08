package localtest.stringsTest;

class SubStringCheck {
    public static void main(String[] args) {
        String message1 = "Good Morning EveryOne!";
        String message2 = "みなさん　おはようございます。";
        System.out.println(message1);
        System.out.println(message2);
        // 引数一つの場合、指定した位置の文字列+1から以後の文字列を出力
        System.out.println(message1.substring(5));
        // 指定位置がずれると文字列は途切れたり文字列の先頭がなくなったりする。
        System.out.println(message1.substring(6));
        // 引数二つの場合は、最初の引数で指定した位置+1から次の引数の位置までの文字列を出力
        System.out.println(message1.substring(5,12));
        // マルチバイト文字、日本語も対応
        System.out.println(message2.substring(4));
        System.out.println(message2.substring(5,14));
        System.out.println(message2.substring(5));
    }
}
