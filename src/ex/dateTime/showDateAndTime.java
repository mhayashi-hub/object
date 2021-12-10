package ex.dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class showDateAndTime {
    public static void main(String[] args) {
    // 現在日時、1年後、2か月後、3週間前、4日前、5時間後、6分前、7秒前を計算。
    // 表示フォーマットは"yyyy年MM時dd日 hh時mm分ss秒"
    LocalDateTime nowDateTime = LocalDateTime.now();
    //System.out.println(nowDateTime);
    System.out.println(DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh時mm分ss秒").
            format(nowDateTime));
    System.out.println(DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh時mm分ss秒")
            .format(nowDateTime.plusYears(1)));
        System.out.println(DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh時mm分ss秒")
                .format(nowDateTime.plusMonths(2)));
        System.out.println(DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh時mm分ss秒")
                .format(nowDateTime.minusWeeks(3)));
        System.out.println(DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh時mm分ss秒")
                .format(nowDateTime.minusDays(4)));
        System.out.println(DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh時mm分ss秒")
                .format(nowDateTime.plusHours(5)));
        System.out.println(DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh時mm分ss秒")
                .format(nowDateTime.minusMinutes(6)));
        System.out.println(DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh時mm分ss秒")
                .format(nowDateTime.minusSeconds(7)));
    }
}

