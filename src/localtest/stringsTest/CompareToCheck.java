package localtest.stringsTest;

class CompareToCheck {
    public static void main(String[] args) {
        // 文字列の大小比較にもCompareToを使える。大小といっても辞書の出現順になるか？
        // 基準とした文字よりあとに出現する場合は正数、一致は0、前に出現する場合は負数を返す。
        // 数値はABCならalphabet順の出現位置の差分値(MNOについてABCならMNOのMの出現位置は12番目)をだす？
        String key1 = "MNO";
        System.out.println(key1.compareTo("ABC"));
        System.out.println(key1.compareTo("MNO"));
        System.out.println(key1.compareTo("OPQ"));
        System.out.println(key1.compareTo("XYZ"));
        System.out.println(key1.compareTo("abc"));
        System.out.println(key1.compareTo("mno"));
        // compareToIgnoreCase()もある。
        // 結果を見ると小文字の方が辞書出現順が先か？
        System.out.println(key1.compareToIgnoreCase("mno"));
    }
}
