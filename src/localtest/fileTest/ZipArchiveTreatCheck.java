package localtest.fileTest;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

class ZipArchiveTreatCheck {
    public static void main(String[] args) {
        String dirPath1 = "C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src" +
                "\\localtest\\fileTest";
        Path filePath1 = Paths.get(dirPath1, "\\", "trial.txt");
        Charset fileCharset = Charset.forName("UTF-8");
        String outZip = dirPath1 + "\\" + "pack01.zip";
        // BufferedOutputStreamインスタンスを作り、それをZipOutputStreamに流し込む。ファイルのCharsetを指定する必要あり。
        try (BufferedOutputStream outStream = new BufferedOutputStream(new FileOutputStream(outZip));
             ZipOutputStream outZipStream = new ZipOutputStream(outStream, fileCharset);)
                // byte型配列を生成してファイルの全バイトデータを読み込み、zipファイル内のファイルエントリを作成、
                // zipファイル内のファイル名は任意で付けられるらしいがあんまり意味がなさそう。とりあえず入力ファイルと同じにする。
                // 最後にzipファイルのエントリ情報と読んだバイトデータをzipOutputStreamインスタンスに書き込む。
        { byte[] data1 = Files.readAllBytes(filePath1);
            ZipEntry zipEntry1 = new ZipEntry("trial.txt");
            outZipStream.putNextEntry(zipEntry1);
            outZipStream.write(data1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
