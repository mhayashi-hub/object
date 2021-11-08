package localtest.stringsTest;

class SimpleStringCheck {
    public static void main(String[] args) {
        String str = "";
        // isEmpty()のテスト
        if (str.isEmpty()) {
            System.out.println("文字列は空です。");
        } else {
            System.out.println(str);
        }
        // length()を使う書き方、ちょっと冗長になる。
        if (str.length() == 0) {
            System.out.println("文字列の長さは0なので、空です。");
        } else {
            System.out.println("文字列の長さは"+ str.length() +"です。");
        }
        // charAt()のテスト
        String str2 = "こんにちわ、世界。";
        System.out.println(str2.charAt(3));//charAtで取り出す位置はStringの配列のindexなので、0開始であるのに注意。
        // indexOf(), lastIndexOf()のテスト
        String str3 = "にわにはにわにわとりがいるにわ";
        // indexOf()で指定した文字列の出現位置を文字数カウントで探せる。
        System.out.println(str3.indexOf("にわ"));
        // indexOf()に文字列以外に検索の開始位置を文字列カウントで指定できる。ここで指定するのはindex番号ではなく文字列の位置。
        System.out.println(str3.indexOf("にわ",1));
        // 文字列として上で1文字目から、ここでは3文字目から検索開始したので、同じ結果が戻る。
        System.out.println(str3.indexOf("にわ",3));
        //　lastIndexOf()では文字列の末尾から指定した文字列を探していく。
        System.out.println(str3.lastIndexOf("にわ"));
        // 指定した数値は検索開始するポイント、文字列の先頭からの位置(そこを末尾と仮定)で、そこから最後に出てくる文字列の位置を返す。
        System.out.println(str3.lastIndexOf("にわ",6));
    }
}
