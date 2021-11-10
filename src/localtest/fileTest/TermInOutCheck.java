package localtest.fileTest;

import java.util.Scanner;

class TermInOutCheck {
    public static void main(String[] args) {
        System.out.println("文字を入力してください。リターンキーで入力完了します。：");
        Scanner scanTermIn = new Scanner(System.in);
        String line1 = scanTermIn.nextLine();
        System.out.println("入力した文字:"+ line1);
    }
}
