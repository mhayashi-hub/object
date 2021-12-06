package localtest.pathTest;

import java.io.File;
import java.nio.file.Paths;

class RelativePathTest {
    public static void main(String[] args) {
        String filePath = "files/record.txt";
        File file = new File(filePath);
        String path = file.getPath();
        System.out.println(path);

        String currentPath = String.valueOf(Paths.get("."));
        System.out.println(currentPath);
    }
}
