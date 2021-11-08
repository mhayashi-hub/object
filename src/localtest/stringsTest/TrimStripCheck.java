package localtest.stringsTest;

class TrimStripCheck {
    public static void main(String[] args) {
        // trim()のテスト。文字列の先頭、末尾にある半角スペースを削除する。空白文字が連続してる場合、まとめて取り除く。
        String message = " あなた わたし かれ ";
        System.out.println(message);
        System.out.println(message.trim());
        String messageAddSpace = "   You I he    ";
        System.out.println(messageAddSpace);
        System.out.println(messageAddSpace.trim());
        // trim()対象がすべて空白文字の場合は何が返る？
        String messageSpace ="     ";
        System.out.println(messageSpace);
        // trim()で空白文字のみの文字列を処理すると何も残らない。(println()による改行文字のみになる。)
        System.out.println(messageSpace.trim());
        // trim()では全角スペースは削除できない。
        String messageJP = "　あなた　わたし　かれ　";
        System.out.println(messageJP);
        System.out.println(messageJP.trim());
        // strip()のテスト。trim同様に複数の空白文字が連続で先頭末尾についていた場合、まとめて取り除く。
        System.out.println(message);
        System.out.println(message.strip());
        // trim()と違って全角空白も取り除ける。
        System.out.println(messageJP);
        System.out.println(messageJP.strip());

        // replace()を使うと文中の空白文字もまとめて取り除ける。(要は空白文字を””=無文字に置き換える。)
        System.out.println(messageAddSpace);
        System.out.println(messageAddSpace.replace(" ",""));
    }
}
