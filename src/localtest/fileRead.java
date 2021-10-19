package localtest;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class fileRead {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src\\localtest\\test01.txt");
        try (BufferedReader reader = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)) {
            /*
            for (String line; (line = reader.readLine()) != null; ) {
                System.out.println(line);
            }
            */
            int i;
            for (i=5 ; i > 0 ;i--) {
                String line = reader.readLine();
                System.out.println(line);
            }
        } catch (IOException ex) {
                System.err.println(ex);
            }
    }
}
