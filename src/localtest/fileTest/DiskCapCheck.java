package localtest.fileTest;

import java.io.File;


class DiskCapCheck {
    public static void main(String[] args) {
        // 使用可能なシステムのストレージ容量を取得する機能のテスト。
        // Cドライブを指定。
        String driveName = "C:\\";
        // 対象のストレージを扱うためのアンカー？としてFileクラスのインスタンスを作成しておく。
        File file = new File(driveName);
        // FileクラスのインスタンスのメソッドgetTotalSpace()でストレージの容量を取得する。
        // 取得できる情報はByte単位のため、ストレージのサイズによってはかなり大きな値になるのでlongで渡される。
        // GB単位にするのにMath.pow()のべき乗計算とMath.floorの小数点以下切り上げの機能を使っている。
        long totalStorageCap =  file.getTotalSpace();
        double totalGCap = Math.floor(totalStorageCap / Math.pow(1024,3));
        System.out.println("ストレージ："+ driveName +" 総容量："+ totalGCap +"GB");

        // getFreeSpace()で空き容量を取得して表示するテスト。
        long freeStorageCap = file.getFreeSpace();
        double freeGCap = Math.floor(freeStorageCap / Math.pow(1024,3));
        System.out.println("ストレージ空き容量："+ driveName +" 空き容量："+ freeGCap +"GB");

        // FIlesのlength()メソッドではファイルのByte単位のサイズを取得できる。
        // size()でも取得可能だが一般的なファイル以外のサイズ結果が正しいか保証されない。

        String dirPath1 = "C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src" +
                "\\localtest\\fileTest";
        File checkFile = new File(dirPath1+"\\"+"trial.txt");
        long fileSize = checkFile.length();
        System.out.println("ファイル名："+ checkFile.getAbsolutePath() +"  ファイルサイズ："+ fileSize + "Byte");
    }
}
