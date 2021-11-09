package localtest.stringsTest;

class RegexSample {
    public static void main(String[] args) {
        String pattern1 = ".BC";
        // パターン指定は三文字、BCが二三文字にあればよい。
        System.out.println("ABC".matches(pattern1));
        System.out.println("XBC".matches(pattern1));
        System.out.println("ACC".matches(pattern1));
        System.out.println("ACB".matches(pattern1));
        System.out.println("");

        String pattern2 = "A[BC]";
        // パターン指定は二文字、BかCが二文字目にあってAが一文字目にあればよい。
        System.out.println("AB".matches(pattern2));
        System.out.println("AC".matches(pattern2));
        System.out.println("ABC".matches(pattern2));
        System.out.println("ACB".matches(pattern2));
        System.out.println("ABD".matches(pattern2));
        System.out.println("ADB".matches(pattern2));
        System.out.println("");

        String pattern3 = "ZZ[^AB]";
        // パターン指定は三文字、ZZにつづけて一文字、A,B以外の文字があればよい。
        // この場合OR指定の[]は^AB全体にかかるっぽい。否定^は[]内部全部にかかるらしい。
        System.out.println("ZZ".matches(pattern3));
        System.out.println("ZA".matches(pattern3));
        System.out.println("ZB".matches(pattern3));
        System.out.println("ZZA".matches(pattern3));
        System.out.println("ZZC".matches(pattern3));
        System.out.println("");

        String pattern4 = "A[A-C]C";
        // パターン指定は三文字、[ - ]の場合は指定した範囲内の文字があればよい。
        System.out.println("ABC".matches(pattern4));
        System.out.println("ACC".matches(pattern4));
        System.out.println("AAC".matches(pattern4));
        System.out.println("ADC".matches(pattern4));
        System.out.println("AAAC".matches(pattern4));
        System.out.println("A-C".matches(pattern4));
        System.out.println("AXC".matches(pattern4));
        System.out.println("");

        String pattern5 = "A[^[A-C]]C";
        // パターン指定は三文字、二文字目がA-Cの範囲外ならなんでもよい。
        // 否定パターンは[^  ]でセットで使う、その対象に範囲指定の[]を含めてもよいっぽい。
        System.out.println("AAC".matches(pattern5));
        System.out.println("ADC".matches(pattern5));
        System.out.println("AVC".matches(pattern5));
        System.out.println("A-C".matches(pattern5));
        System.out.println("AXC".matches(pattern5));
        System.out.println("");

        String pattern6 = "A[A,X,C,2]C";
        // パターン指定は三文字、二文字目は[]内の候補に合致すればよい。
        System.out.println("AXC".matches(pattern6));
        System.out.println("AAC".matches(pattern6));
        System.out.println("ABC".matches(pattern6));
        System.out.println("A1C".matches(pattern6));
        System.out.println("A2C".matches(pattern6));
        System.out.println("");

        String pattern7 = "^AA.";
        // パターン指定は三文字、先頭がAAであればよい。
        System.out.println("AAB".matches(pattern7));
        System.out.println("ABB".matches(pattern7));
        System.out.println("AAC".matches(pattern7));
        System.out.println("AA2".matches(pattern7));
        System.out.println("");

        String pattern8 = ".BC$";
        // パターン指定は三文字、末尾がBCで終わっていればよい。
        System.out.println("XBC".matches(pattern8));
        System.out.println("ABC".matches(pattern8));
        System.out.println("1BC".matches(pattern8));
        System.out.println("AAC".matches(pattern8));
        System.out.println("XXX".matches(pattern8));
        System.out.println("");

        String pattern9 = "ac{3}b";
        // パターン指定は四文字、{ }で前の文字の繰り返し回数を指定。
        System.out.println("acccb".matches(pattern9));
        System.out.println("accb".matches(pattern9));
        System.out.println("acb".matches(pattern9));
        System.out.println("acccbb".matches(pattern9));
        System.out.println("acccccb".matches(pattern9));
        System.out.println("");

        String pattern10 = "[0-9]{1,}-";
        // パターンは１文字以上、末尾に-、数字[0-9]を{1,}で一回以上繰り返す指定としている。
        // matchesさせる場合はリテラルでの数値(intとかになる)ではなく文字列としないといけない。
        System.out.println("121-".matches(pattern10));
        System.out.println("ABB-".matches(pattern10));
        System.out.println("56-".matches(pattern10));
        System.out.println("3O-".matches(pattern10));
        // 直接の数値はオブジェクトではないため、matches()メソッドを呼ぶことはできない。
        // System.out.println(121-.matches(pattern10));
        System.out.println("");

        String pattern11 = "^[0-9]{5}$";
        // 数字五桁、先頭から末尾までの指定。
        System.out.println("32432".matches(pattern11));
        System.out.println("0000A".matches(pattern11));
        System.out.println("345609".matches(pattern11));
        System.out.println("243".matches(pattern11));
        System.out.println("11199".matches(pattern11));
        System.out.println("");

        String pattern12 = "^[0-9a-z]{5}$";
        // 数字と英字五桁、先頭から末尾までの指定。
        System.out.println("32432".matches(pattern12));
        System.out.println("324d3".matches(pattern12));
        System.out.println("3ed32".matches(pattern12));
        System.out.println("32432a".matches(pattern12));
        System.out.println("a32432".matches(pattern12));
        System.out.println("abdcs".matches(pattern12));
        System.out.println("");

        String pattern13 = "^[0-9]{3}-[0-9]{4}$";
        // 先頭から末尾までの数字のみ、三桁+ハイフン"-"+四桁(郵便番号方式)での指定。
        System.out.println("324-3242".matches(pattern13));
        System.out.println("000-1210".matches(pattern13));
        System.out.println("93121-12".matches(pattern13));
        System.out.println("9903-10".matches(pattern13));
        System.out.println("0O0-1B90".matches(pattern13));
        System.out.println("");

        String pattern14 = "a\\.";
        // 先頭から末尾までの二文字、ドット"."を正規表現パターンではなく文字として検索する場合の(エスケープ)指定。
        System.out.println("ab".matches(pattern14));
        System.out.println("a.".matches(pattern14));
        System.out.println("a,".matches(pattern14));
        System.out.println("a:".matches(pattern14));
        System.out.println("b.".matches(pattern14));
        System.out.println("");

    }
}
