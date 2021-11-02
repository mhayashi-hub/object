package localtest.exceptionSample2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class FileRead {
    static void read() {
        String dir = "C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src\\localtest\\exceptionSample2";
        String filename = "testfile2.txt";
        try {
            List<String> line = Files.readAllLines(Paths.get(dir,filename), Charset.forName("UTF-8"));
            System.out.println(line);
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
