package localtest.fileTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TermInOutBufferedSample {
    public static void main(String[] args) {
        String inString;
        System.out.println("文字を入力してください。リターンキー入力で入力完了します。：");
        /*
        try (InputStreamReader inStreamRead = new InputStreamReader(System.in);
             BufferedReader inBufReader = new BufferedReader(inStreamRead);
             ) {
            inString = inBufReader.readLine();
            System.out.println("入力した文字："+ inString);
        } catch (IOException e) {
            e.printStackTrace();
        }
         */
        // インスタンス生成を減らし、BufferedReaderに直接InputStreamReaderでSystem.inの入力を読んだものを渡す方式。
        // 記述的にはnewが複数あるが名前の付いたインスタンスを作成する数は減る、のかもしれない。可読性とのトレードオフか？
        try (BufferedReader inBufReader = new BufferedReader(new InputStreamReader(System.in))) {
            inString = inBufReader.readLine();
            System.out.println("入力した文字:"+ inString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
