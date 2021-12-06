package ex.exception;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class ExceptionObs {
    public static void main(String[] args) {
        Path filePath = Paths.get("./src/ex/exception/test.txt");
        byte[] contents = new byte[1000];
        InputStream is = null;
        try {
            is = Files.newInputStream(filePath);
            is.read(contents);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
