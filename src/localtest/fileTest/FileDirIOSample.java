package localtest.fileTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;

class FileDirIOSample {
    public static void main(String[] args) {
        // NIO2でファイルの存在確認を実施するにはFiles.existsやnotExistsを使う。
        // ディレクトリはFilesがDirectryに代わるだけでほぼ同じ処理。
        // ただし再帰的な削除はできそうにないので自前で処理してディレクトリ内のファイルを掃除してから削除の必要がありそう。
        // ちなみにJava環境ではカレントディレクトリ相当の情報は存在しないし規定されていない。
        // (ソース作成やプロジェクト作成ディレクトリなどを相対パスとして取得できないし、システムに持っていく際に
        //  そのような手法は危険なのでやらない方がいい、ということかもしれない。)
        // 必ずファイル操作の際には実行パスを絶対パスのフルパス形式で取得し指定しなければならない。
        String dirPath1 = "C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src" +
                "\\localtest\\fileTest";
        Path filePath1 = Paths.get(dirPath1,"\\","trial.txt");
        Path filenoPath1 = Paths.get(dirPath1,"\\","triallow.txt");
        if (Files.exists(filePath1)) {
            System.out.println("trial.txt は存在します。");
        } else if (Files.notExists(filePath1)) {
            System.out.println("trial.txt は存在しません。");
        } else {
            System.out.println("予想外のエラーが出ました。");
        }
        if (Files.notExists(filenoPath1)) {
            System.out.println("triallow.txt は存在しません。");
        } else if (Files.notExists(filenoPath1)) {
            System.out.println("triallow.txt は存在します。");
        } else {
            System.out.println("予想外のエラーが出ました。");
        }
        // ファイルのコピー実施のテスト。コピー元やコピー先のファイルの存在チェックはしていない。
        // copy()メソッド側にも存在チェックの機能はなさそう、ファイルが存在してると例外を出す。
        Path fromPath1 = Paths.get(dirPath1,"\\","trial.txt");
        Path toPath1 = Paths.get(dirPath1,"\\","trialcopy.txt");
        try { Files.copy(fromPath1,toPath1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ファイルの移動のテスト。この場合は移動というよりリネームか？パス指定を変えれば移動にもなる。
        // 上の処理で例外発生するがそこで処理が完結していて連続の処理ではないので、こちらも問題なく実行される。
        Path toPath2 = Paths.get(dirPath1,"\\","trialmove.txt");
        try { Files.move(toPath1,toPath2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 空ファイルの作成のテスト。ファイルが存在していた場合はこちらも例外を出す。
        Path createPath1 = Paths.get(dirPath1,"\\","newfile.txt");
        try { Files.createFile(createPath1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ファイルを削除するテスト。
        Path deletePath1 = Paths.get(dirPath1,"\\","lostfile.txt");
        // Files.delete()メソッドのテスト。ファイルがないと例外を出す。
        try { Files.delete(deletePath1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Files.deleteIfExists()のテスト、ファイルがないとそのまま終了する。
        try { Files.deleteIfExists(deletePath1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ファイルサイズを取得する機能のテスト。これもファイルがなければたぶん例外を出すか？
        try { System.out.println(Files.size(filePath1));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ファイルの作成、更新日時などの属性情報を取得する機能のテスト。
        // try catchブロックで値を代入するやり方なので初期化漏れが発生する。このやり方ではまずエラーが消せない。
        // 元からNIO2のファイル操作はあまりよろしくないのでサンプル作成と試行だけにとどめておくべきか。
        BasicFileAttributes baseAttribute1;
        try { baseAttribute1 = Files.readAttributes(filePath1,BasicFileAttributes.class);
            System.out.println(baseAttribute1.creationTime());
            System.out.println(baseAttribute1.lastAccessTime());
            System.out.println(baseAttribute1.lastModifiedTime());
            System.out.println(baseAttribute1.isDirectory());
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileTime time1 = baseAttribute1.creationTime();
        FileTime time2 = baseAttribute1.lastAccessTime();
        FileTime time3 = baseAttribute1.lastModifiedTime();
        SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
        System.out.println("作成日時："+ format1.format(new Date(time1.toMillis())));
        System.out.println("最終アクセス日時："+ format1.format(new Date(time2.toMillis())));
        System.out.println("最終更新日時："+ format1.format(new Date(time3.toMillis())));

    }
}
