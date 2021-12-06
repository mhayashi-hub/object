package ex.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Temp1 {
    public static void main(String[] args) {
        // Path currentPath = Paths.get(".\\temp.txt");
        String firstFile = "temp.txt";
        // Javaのパス区切りは"/"でいけるがWindows上では"\\"も使える。
        // String directoryPath = "./src/ex/file";
        String directoryPath = ".\\src\\ex\\file";
        // ファイル名とパスの結合の際にパス区切りを追加して、全体として参照可能なパス指定にしないといけない。
        // パス区切りがない場合は階層、ファイル名を間違えた場所にファイルを作ってしまうが警告などは一切出ない。
        // firstFileとdirectoryPathを単純に結合(区切り文字なし)の場合は、./src/ex/filetemp.txtになるので、
        // 期待したより一つ上の階層に期待したファイル名とは別のファイル名でファイルが作成される。
        // ファイル作成完了しても警告などは一切でない。
        // String fullPath = directoryPath +"/"+ firstFile;
        String fullPath = directoryPath +"\\"+ firstFile;
        if (Files.notExists(Path.of(fullPath))) {
            try {
                 Files.createFile(Path.of(fullPath));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("ファイルが既に存在します。：" + fullPath);
        }

        Path filePath = Paths.get("./src/ex/file/temp2.txt");
        if (Files.notExists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            // Pathオブジェクトはそのままprintlnに入れるとリンク付きの表示としてコンソールに出力される。
            // toString()を付けると文字列表現になるがなくてもよい？IDEは不要な呼び出しと判断している。
            System.out.println("ファイルが既に存在します。:" + filePath);
        }
        Path file2Path =
                Paths.get("C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src\\ex\\file\\test2.txt");
        if (Files.notExists(file2Path)) {
            try {
                Files.createFile(file2Path);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("ファイルが既に存在します。：" + file2Path.toString());
        }
    }
}
