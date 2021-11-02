package localtest.exceptionSample;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class FileRead {
    static void read() throws IOException {
        Path path = Paths.get("C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src\\localtest\\exceptionSample\\testfile.txt");
        Files.exists(Path.of("C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src\\localtest\\exceptionSample\\testfile.txt"));
        BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            for (String line; (line = reader.readLine()) != null;) {
                System.out.println(line);
            }
    }
}
