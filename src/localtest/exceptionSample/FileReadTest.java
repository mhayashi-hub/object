package localtest.exceptionSample;

import java.io.IOException;
import java.nio.file.Files;

class FileReadTest {
    public static void main(String[] args) {
        try {
            FileRead.read();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("finallyブロックの実行");
        }
    }


}
