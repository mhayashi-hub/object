package localtest.tryWithResource;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

class FileInOutSample {
    public static void main(String[] args) {
        String dir = "C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src\\localtest\\tryWithResource\\";
        String fileIn = "testsample1.txt";
        String fineOut = "testsample2.txt";
        try (FileInputStream reader = new FileInputStream(dir + fileIn);
             FileOutputStream writer = new FileOutputStream(dir + fineOut)) {
                int data;
                while ((data = reader.read()) != -1) {
                    writer.write(data);
                }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finallyブロックの実行");
        }
    }
}
