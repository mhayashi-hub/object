package localtest.localDateTimeTest;

import java.time.LocalDateTime;
import java.time.chrono.JapaneseEra;
import java.time.format.DateTimeFormatter;

class localDateTimeCheck {
    public static void main(String[] args) {
        // LocalDateTimeで日付と時刻の取得
        LocalDateTime date1 = LocalDateTime.now();
        System.out.println(date1);
        // DateTimeFormatterを使った表示形式の加工、ここで作ったのはあくまでも日付時刻を加工する専用のインスタンスで
        // 上で作った日付のインスタンスではない、いわば日付表示のための鋳型のようなものだけで中身はない。
        DateTimeFormatter dateTimeForm1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS E");
        System.out.println(dateTimeForm1);
        // 加工処理を通してから文字列に変換して文字列型インスタンスに代入
        String dtout1 = dateTimeForm1.format(date1);
        System.out.println(dtout1);
        // 鋳型としての日付時刻表示形式指定は日本語を入れるのも可能
        DateTimeFormatter dateTimeJap1 = DateTimeFormatter.ofPattern("GGG yyyy年MM月dd日 HH時mm分ss秒SSSミリ秒 E曜日");
        String dtout2 = dateTimeJap1.format(date1);
        System.out.println(dtout2);
        // 和暦表示も(システムが対応してる分までだが)できるはずだが、対応状況や機能はあまり信用できなさそう。
        JapaneseEra dtoutJp1 = JapaneseEra.MEIJI;
        System.out.println(dtoutJp1);
        DateTimeFormatter dateTimeJap2 = DateTimeFormatter.ofPattern("GGG");
        System.out.println(dateTimeJap2.format(dtoutJp1));
    }
}
