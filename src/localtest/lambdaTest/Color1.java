package localtest.lambdaTest;

// インターフェースが関数型として使えるかをコンパイル時にチェックしてくれるアノテーションキーワード @FunctionalInterface
// なくてもインターフェースの定義が関数型として動くならコードは動くが、動くまでは未チェックなので
// コードに問題がある場合に実行時例外を出す場合がある。
// これをつけておけばコンパイル時に関数型インターフェースとして妥当かチェックしてくれるので、
// コンパイルエラーで問題を検出できる。いわば関数型インターフェースであることの宣言or目印。
@FunctionalInterface
public interface Color1 {
    String write1(String a);
}
