package localtest.fileTest;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

class FileIoSample {
    public static void main(String[] args) {
        String dirPath1 = "C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src" +
                "\\localtest\\fileTest";
        Path filePath1 = Paths.get(dirPath1,"\\","trial.txt");
        Charset fileCharset = Charset.forName("UTF-8");
        // readAllLinesはファイルがあらかじめ存在しないと例外を出す。
        try { List<String> readlines = Files.readAllLines(filePath1,fileCharset);
                for (String line:readlines) {
                    System.out.println(line);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path filePath2 = Paths.get(dirPath1,"\\","tryout.txt");
        List<String> writeLine = new ArrayList<>();
        writeLine.add("赤");
        writeLine.add("青");
        writeLine.add("黄");
        writeLine.add("白");
        writeLine.add("black");
        System.out.println(writeLine);
        // writeもファイルがあらかじめないと例外を出す。ファイルに書き出すのにない場合に新規作成できない方法はちょっと変。
        try {Files.write(filePath2,writeLine,fileCharset, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
