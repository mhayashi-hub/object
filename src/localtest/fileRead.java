package localtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class fileRead {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src\\localtest\\test01.txt");
        try (BufferedReader reader = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)) {
            for (String line; (line = reader.readLine()) != null; ) {
                System.out.println(line);
            }
            /*
            int i;
            for (i=5 ; i > 0 ;i--) {
                String line = reader.readLine();
                System.out.println(line);
            }
            */
        } catch (IOException ex) {
                System.err.println(ex);
        }

        Path outPath = Paths.get("C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src\\localtest\\testout01.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(outPath, StandardCharsets.UTF_8)) {
            writer.append("test output to file");
            writer.newLine();
            writer.newLine();
            writer.append("test output to file-2 write to file");
            writer.newLine();
            writer.append("これはテスト出力toTextです。");

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
