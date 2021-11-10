package localtest.fileTest;

import java.io.File;

class FilelistingCheck {
    public static void main(String[] args) {

        String dirPath1 = "C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src" +
            "\\localtest\\fileTest";
        // Fileクラスを使ってファイルの一覧やディレクトリ一覧を取得するテスト。
        // FilesクラスのlistFiles()メソッドで一覧情報を取得できる。
        // isFile()でファイルであるか、isDirectory()でディレクトリかを判定できる。
        // ただし対象のフラットな階層のみでディレクトリ内のディレクトリなどを再帰的に追跡して表示はしてくれない。
        // 本当に単純な一覧のみになる。
        // また、シンボリックリンクやハードリンクはどうなるのか、少し興味がある。
        File file1 = new File(dirPath1);
        File[] fileArray1 = file1.listFiles();

        for (File fileElement:fileArray1) {
            if (fileElement.isFile()) {
                System.out.println("ファイル："+ fileElement.toString());
            } else if (fileElement.isDirectory()) {
                System.out.println("ディレクトリ："+ fileElement.toString());
            } else {
                System.out.println("予想しないエラーが発生しました。");
            }
        }
    }
}