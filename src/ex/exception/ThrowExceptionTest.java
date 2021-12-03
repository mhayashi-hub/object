package ex.exception;

import java.io.IOException;

class ThrowExceptionTest {
    public static void main(String[] args) {
        try {
            ThrowsException.readFile("test");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("ファイルの読み込みに失敗しました。");
        }

        // 呼び出し先のメソッドが例外をthrowで呼び出し元にわたす処理をしているので、かならず呼び出し元で実行する部分では
        // 例外処理をする必要がある(さらに呼び出している上の階層があれば、そちらにthrowしてもよいがたらい回ししすぎるとダメ)。
        // 例外処理をするか可能なら上に例外をthrowするのをやらないと、IDEでコンパイルエラーとなりコードは実行できない。
        // 今回の処理ではmainが一番上の呼び出し元なので、ここで例外処理する以外に手がない。
        // ThrowsException.readFile("test");
    }
}
