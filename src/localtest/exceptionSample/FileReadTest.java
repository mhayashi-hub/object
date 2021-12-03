package localtest.exceptionSample;

import java.io.IOException;

class FileReadTest {
    public static void main(String[] args) {
        try {
            FileRead.read();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        } finally {
            System.out.println("finallyブロックの実行");
        }
    }
}
