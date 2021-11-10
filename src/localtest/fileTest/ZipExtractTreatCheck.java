package localtest.fileTest;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

class ZipExtractTreatCheck {
    public static void main(String[] args) {
        // zipファイルからの展開はうまく動かない。同一階層への展開はからファイルが出来上がる。
        // 別階層を作ろうとするとJavaではディレクトリを自動作成できないのでディレクトリ生成もなしで何が起こったかわからなくなる。
        // 展開先ディレクトリを準備しておいてもファイルは特に作成できない。←パス指定を間違えてファイル作成してしまっていた。
        // ディレクトリパスにきちんと階層区切り指定を追加して渡してやればzipアーカイブ内のファイル名で生成されるが中身は空のまま。
        // ↑データ読み取りカウントの処理を一部不完全にしていたためのバグでデータが読めていなかった。修正して問題解消。
        // 一応動いたところでソースの処理ステップを見ているがかなり冗長かつめんどくさい。
        // BufferedInput/OutputStreamなのでスレッドセーフではあるはずだが、ZipInput/OutputStreamは
        // スレッドセーフなのだろうか？　→スレッドセーフかはともかく、FileInputStreamからInputStream、
        // BufferedInputStreamを使うのはJava6以前の古いやり方らしい。
        String dirPath1 = "C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src" +
                "\\localtest\\fileTest";
        Charset fileCharset = Charset.forName("UTF-8");
        String inZip = dirPath1 + "\\" + "pack01.zip";
        String outPath = dirPath1 +"\\" + "extractDir\\";
        Path inZipPath = Paths.get(inZip);
        Path outFilePath = Paths.get(outPath);
        /*
        try (BufferedInputStream inStream = new BufferedInputStream(new FileInputStream(inZip));
             ZipInputStream inZipStream = new ZipInputStream(inStream, fileCharset);)
        {
            ZipEntry zipEntry ;
            while ((zipEntry = inZipStream.getNextEntry()) != null) {
                try (BufferedOutputStream outStream = new BufferedOutputStream(new FileOutputStream(outPath + zipEntry.getName()))) {
                    byte[] outData = new byte[1024];
                    int count = 0;
                    while ((count = inZipStream.read(outData)) != -1) {
                        outStream.write(outData, 0, count);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
         */
        try ( InputStream inStream = Files.newInputStream(inZipPath);
        ZipInputStream inZipStream = new ZipInputStream(inStream, fileCharset);) {
            ZipEntry entry;
            while ((entry = inZipStream.getNextEntry()) != null) {
                try (OutputStream outStream = Files.newOutputStream(Paths.get(outPath, entry.getName()))) {
                    byte[] zipData = new byte[1024];
                    int count = 0;
                    while ((count = inZipStream.read(zipData)) != -1) {
                        outStream.write(zipData, 0, count);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
