package localtest.localDateTimeTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class localDateTimeOperation {
    public static void main(String[] args) {
        // 2016.12.30 22:30:10をセット
        LocalDateTime ldt1 = LocalDateTime.of(2016,12,30,22,30,10);
        // 2年加算
        LocalDateTime date1 = ldt1.plusYears(2);
        System.out.println(date1);
        // 2カ月加算
        LocalDateTime date2 = ldt1.plusMonths(2);
        System.out.println(date2);
        // 2日減算
        LocalDateTime date3 = ldt1.minusDays(2);
        System.out.println(date3);
        // 1時間20分15秒を加算
        LocalDateTime data4 = ldt1.plusHours(1).plusMinutes(20).plusSeconds(15);
        System.out.println(data4);
        // 表示形式をyyyy/MM/dd HH:mm:ssに指定
        DateTimeFormatter dtform1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        // 日時インスタンスをString型に変換
        String dateFormatted1 = dtform1.format(date1);
        System.out.println(dateFormatted1);
    }
}
