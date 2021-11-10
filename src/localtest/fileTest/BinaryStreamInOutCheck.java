package localtest.fileTest;

import java.io.*;

class BinaryStreamInOutCheck {
    public static void main(String[] args) {
        String dirPath1 = "C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src" +
                "\\localtest\\fileTest";
        String pngPath1 = "test01.png";
        String pngPath2 = "test02.png";

        // 対象のファイルが探せないとまず例外が出る。
        try (
            FileInputStream fileIn = new FileInputStream(dirPath1 +"\\"+ pngPath1);
            BufferedInputStream fileReader = new BufferedInputStream(fileIn);

            FileOutputStream fileOut = new FileOutputStream(dirPath1 +"\\"+ pngPath2);
            BufferedOutputStream fileWriter = new BufferedOutputStream(fileOut);
        ) { int data;
            while ((data = fileReader.read() ) != -1) {
                fileWriter.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
