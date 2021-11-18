package localtest.simpleLogicTest;

class AddTest {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        double b = 0.05;
        System.out.println(b);
        double c = b + a;
        System.out.println(c);
        // double型をint型と演算してint型にそのまま代入しようとすると、普通にIDEに怒られる。
        // 小数点以下の情報欠落が発生するのでIDEではまず記述できない。int型にキャストして欠落を無視してintとして扱えばできる。
        // castしなければコンパイルエラーになるはず。shorteningすることになるので情報欠落。
        // wideningの方は欠落はしないはず。それ以外に丸め誤差や桁落ち、桁あふれなどに注意すべし。
        int d = a + (int) b;
        System.out.println(d);
        System.out.println();

        // for文とwhile文の変換確認。
        for (int i=0;i<=10;i++) {
            System.out.println(i);
        }
        System.out.println();
        // for文は条件を満たすことをチェックして、条件を満たす限り繰り返し実行する。
        // for文はforEach形式でない限りは指定されたfor文の中で繰り返しによる増減要素を指定する。
        int wi = 0;
        while (wi <= 10) {
            System.out.println(wi);
            wi++;
        }
        System.out.println();
        // whileの場合条件を満たす限り繰り返し実行する。
        // for文とは異なって繰り返した回数の増減処理は自分で実装しないといけない。
        int wk = -1;
        while (wk < 10) {
            wk++;
            System.out.println(wk);
        }
        System.out.println();
        // あまりよくない実装の例、条件式と初期値の指定と実行内容での繰り返し管理の見直しをすればもっと良くなる。
        int wj = 0;
        do {
            System.out.println(wj);
            wj++;
        }
        while (wj <=10);
        // do whileの場合は条件判定までに必ず一回は指定した繰り返し内容の処理を実行することに注意。
        // while文だと条件を満たさない場合は一回も処理を行わずに終わるが、do whileだと条件判定は
        // 処理を一度実行した後に行うので一回だけは確実に行う。

    }
}
