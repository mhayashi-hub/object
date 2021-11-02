package localtest.exceptionSample;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class FileRead {
    static void read() throws IOException {
        String dir = "./";
        String filename = "testfile.txt";
        List<String> line = Files.readAllLines(Paths.get(dir, filename), Charset.forName("UTF-8"));
    }
}
