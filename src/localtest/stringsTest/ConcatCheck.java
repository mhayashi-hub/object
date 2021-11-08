package localtest.stringsTest;

class ConcatCheck {
    public static void main(String[] args) {
        String str1 = "あいう";
        String str2 = "えおか";
        // concat()メソッドを使った文字列連結方法、これも文字列インスタンスを新規生成する。
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
