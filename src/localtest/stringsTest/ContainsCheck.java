package localtest.stringsTest;

class ContainsCheck {
    public static void main(String[] args) {
        String Sentence1 = "123456";
        // Stringクラスのcontains()メソッドで大使用文字列内にキーワードがあるかの判定が可能。
        System.out.println(Sentence1.contains("3"));
        System.out.println(Sentence1.contains("7"));
        System.out.println();

        String Sentence2 = "あいうえお";
        System.out.println(Sentence2.contains("うえ"));
        System.out.println(Sentence2.contains("うお"));
        System.out.println();

        // 正規表現での検索をする場合はmatches()メソッドを使う。
        System.out.println("AA".matches("A."));
        System.out.println("BB".matches("A."));
        // 文字列型である直値""でくくったものもString型に相当する？
        // そのためmatches()メソッドを使うことができる？
        // また、matches()メソッド内の正規表現パターンはString型インスタンスでもいいし直値""でくくったものでもよさそう。
    }
}
