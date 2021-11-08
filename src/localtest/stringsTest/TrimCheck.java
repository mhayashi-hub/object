package localtest.stringsTest;

class TrimCheck {
    public static void main(String[] args) {
        // trim()のテスト。文字列の先頭、末尾にある半角スペースを削除する。
        String message = " あなた わたし かれ ";
        System.out.println(message);
        System.out.println(message.trim());
        // trim()対象がすべて空白文字の場合は何が返る？
        String messageSpace ="     ";
        System.out.println(messageSpace);
        // trim()で空白文字のみの文字列を処理すると何も残らない。(println()による改行文字のみになる。)
        System.out.println(messageSpace.trim());
        // trim()では全角スペースは削除できない。
        String messageJP = "　あなた　わたし　かれ　";
        System.out.println(messageJP);
        System.out.println(messageJP.trim());
    }
}
