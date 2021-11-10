package localtest.fileTest;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.Consumer;

class StreamFileDirCheck {
    public static void main(String[] args) {

        Path dirPath1 = Paths.get("C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src" +
                "\\localtest\\fileTest");
        // Stream記述でのファイル、ディレクトリチェック処理のテスト。
        try {
            Files.list(dirPath1).forEach(new Consumer<Path>() {
                @Override
                public void accept(Path target) {
                    if (Files.isDirectory(target)) {
                        System.out.println("ディレクトリ：" + target);
                    } else if (! Files.isDirectory(target)) {
                        System.out.println("ファイル：" + target);
                    } else {
                        System.out.println("予期しないエラーが発生しました。");
                    }
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        // いきなりwalkFikeTreeメソッドやSimpleFileVisitorクラス、その中のFileVisitResultなどが出てきて
        // 混乱する。機能も書き方も冗長でめんどくさい。これもNIO2のファイル操作の仕組みの一つらしい。
        try { Files.walkFileTree(dirPath1, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attr)
                    throws IOException {
                System.out.println(file);
                return FileVisitResult.CONTINUE;
            }
        });
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
