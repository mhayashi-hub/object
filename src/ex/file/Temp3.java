package ex.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Temp3 {
    public static void main(String[] args) {
        Path readFilePath =
                Paths.get("C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src\\ex\\file\\temp.txt");
        try (BufferedReader reader = Files.newBufferedReader(readFilePath, StandardCharsets.UTF_8)) {
                for (String line; (line = reader.readLine()) != null;) {
                    System.out.println(line);
                }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if (Files.exists(readFilePath)) {
            try {
                // try-catch形式だがJava7以降のClosableクラスを使っているので処理が終わればAutoCloseするはず(？)。
                // でもtry with resource構文でないと自動でcloseしないのでは？
                // Filesクラスのメソッドで処理するのはやっぱりJava7以降のメソッドでJava6で未実装のはず。
                Files.readAllLines(readFilePath, StandardCharsets.UTF_8).forEach(System.out::println);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
