package localtest.exampleTest;

import java.time.LocalDateTime;

class sampleLoopTest {
    public static void main(String[] args) {
        int second = LocalDateTime.now().getSecond();

        if (second % 2 == 0) {
            System.out.println(second +" は偶数です。");
        } else {
            System.out.println(second +" は奇数です。");
            // if文の中でcontinueを書くとコンパイルエラーになる。
            // continue;
            // breakもswitchやloopの中でしか書けない？
            // if文中でそのまま書くとコンパイルエラーが出る。
            // break;
        }

        int sum = 0;
        for (int i = 1; i<= 10; i++) {
            if (i == 3) {
                // しかしloop構造内でif文などを書いてその中にある場合はコンパイルエラーにはならない。
                // 処理としてはloop文の条件式にすぐ飛ぶ。(if文の処理を抜けてfor文の条件式に飛ぶ。)
                continue;
            }
            sum += i;
            System.out.println(i +" 回目：" + sum);
        }

        int sum2 = 0;
        int j = 10;
        while (j > 0) {
            sum2 += j;
            System.out.println("残り階数 "+ j +" 結果：" + sum2);
            j--;
            if (j == 5) {
                break;
            }
        }

        int test2 = 7;
        for (int i =0;i < 20;i++) {
            System.out.println(i + ":" + test2);
            if (i == test2) {
                // Javaプログラム中では一般的に条件判定でif文を使いプログラムを中断することはない？
                // for/whileやswitch文の処理を止めて次の処理に移るのにbreakを使うことはあるっぽい。
                // continueは途中の処理をスキップしてループ部分に再度入る形式になる。
                break;
            }
        }
    }
}
