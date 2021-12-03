package ex.exception;

import java.io.IOException;

class ThrowsException {
    // throwで例外を呼び出し元に処理させる方法のテスト。
    // 呼び出しメソッド側で例外のエラー処理を書かないでよい(呼び出し元に押し付けることができる)書き方。
    static void readFile(String filePath) throws IOException {
        // throw new 例外の型名() で指定した例外を発生させることができる。
            // throw new IOException();
            throw new IOException("ファイル" + filePath +"を読み込むことができませんでした。");
            // throw new EOFException();
            // throw new ArrayIndexOutOfBoundsException();
        }
}

