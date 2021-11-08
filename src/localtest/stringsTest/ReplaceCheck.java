package localtest.stringsTest;

class ReplaceCheck {
    public static void main(String[] args) {
        // 文字列内の指定キーワードを置き換える。
        String message1 = "Good Morning Everyone!";
        System.out.println(message1);
        System.out.println(message1.replace("Morning", "Bye"));
        // 置き換え発生は一度？キーワードに複数合致したら全部置き換える？-> 全部置き換える動作になる。
        String message3 = "Good, Good Evening, My Good Friends.";
        System.out.println(message3);
        System.out.println(message3.replace("Good","Bad"));
        // 日本語でも試す。
        String message2 = "こんにちわ、みなさん";
        System.out.println(message2);
        System.out.println(message2.replace("こんにちわ","おはようございます"));
    }
}
