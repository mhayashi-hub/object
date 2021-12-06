package ex.exception;

class ExceptionSample {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int i = 0;
        System.out.println("配列のサイズ："+ array1.length);
        try { for(i = 0; i<=3 ; i++) {
                System.out.println("配列のindex：" + i + " 配列の値：" + array1[i]);
                }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列のindexに存在しない番号を指定しています。配列のindex："+ i);
            // StackTraceを出すと例外名も出てしまうので出力を抑制しておく。
            // e.printStackTrace();
        } finally {
            // finallyブロックは特になくてもよいが、実行時例外が出ても出なくても実行できる。
            // プログラムの終了状態を示すのに使えるかもしれないが、あんまりいらないかも。(冗長になる？)
            // Java7以前の書式らしいがJava7以降ではfinallyなしでも問題ないはず？
            // -> 本来はtry with resource構文を使うべき。
            System.out.println("処理終了しました。");
        }
    }
}
