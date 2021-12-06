package ex.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Temp2 {
    public static void main(String[] args) {
        Path filePath =
                Paths.get("C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src\\ex\\file\\temp.txt");
        byte[] byteString = new byte[]{0x41, 0x42, 0x43, 0x64};
        OutputStream writer = null;
        if (Files.notExists(filePath)) {
            try {
                writer = new FileOutputStream(String.valueOf(filePath), true);
                writer.write(byteString);
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("ファイルが既に存在します。：" + filePath);
            System.out.println("ファイルにデータを追記します。");
            byte[] byteString2 = new byte[]{0x74, 0x79, 0x64};
            try {
                writer = new FileOutputStream(String.valueOf(filePath), true);
                writer.write(byteString2);
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        /*
        if (Files.exists(filePath)) {
            try {

            } catch (IOExceptions ex) {
                ex.printStackTrace();

        }

         */
    }
}
