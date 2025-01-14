package ex.exception;

import java.io.IOException;

class ThrowExceptionTest {
    public static void main(String[] args) {
        try {
            // 作成した、呼び出すと必ず例外を投げるメソッドを呼び出し。
            // 例外を投げることがIDEにはわかっているので、try/catch構文を使って書かないとコンパイルエラーが出て実行できない。
            ThrowsException.readFile("test");
        } catch (IOException ex) {
            // IOExceptionのメソッドにメッセージを出させる場合、IOExceptionクラスのインスタンスのメソッドを実行する必要がある。
            // 実行しない場合はIOExceptionのメソッドは実行されないので自分が書いたメッセージは出ない。
            ex.printStackTrace();
            System.out.println("ファイルの読み込みに失敗しました。");
        }

        // 呼び出し先のメソッドが例外をthrowで呼び出し元にわたす処理をしているので、かならず呼び出し元で実行する部分では
        // 例外処理をする必要がある(さらに呼び出している上の階層があれば、そちらにthrowしてもよいがたらい回ししすぎるとダメ)。
        // 例外処理をするか可能なら上に例外をthrowするのをやらないと、IDEでコンパイルエラーとなりコードは実行できない。
        // 今回の処理ではmainが一番上の呼び出し元なので、ここで例外処理する以外に手がない。
        // ThrowsException.readFile("test");

        // Exceptionが発生している場合、他の例外が同時に発生していても指定した例外がスーパークラスだったら
        // 発生した例外をまとめて処理してしまうためエラーを個別に識別できなくなる？
        // プログラムのバグとして発生した実行時例外をスーパークラスの例外として補足してしまうと、実際に発生しているバグによる
        // 問題を解析するのに情報が欠落したり錯誤するような形式になったりして問題の原因追及が困難になる場合がある？
        // あとはKISSの原則に従わなくなる、モジュール間の疎結合の邪魔になるという問題があるか？
    }
}
