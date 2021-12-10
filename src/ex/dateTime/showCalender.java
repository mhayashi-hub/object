package ex.dateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class showCalender {
    public static void main(String[] args) {
        // Calendarクラスを使用。
        // nowと１年後、２カ月後、３週間前、４日前、５時間後、６分前、７秒前を表示。
        // yyyy年MM時dd日 hh時mm分ss秒 で表示。
        // nowの表示。Calendarクラスを利用しDateFormatに変更して表示してみた。
        Calendar nowCalendar = Calendar.getInstance();
        Date nowDate = nowCalendar.getTime();
        DateFormat calFormat = new SimpleDateFormat("yyyy年MM月dd日 hh時mm分ss秒");
        System.out.println(calFormat.format(nowDate));

        // 一年後などはCalendarクラスで加算(演算)する。Dateクラスで変更することは非推奨。
        nowCalendar.add(Calendar.YEAR,1);
        Date add1yDate = nowCalendar.getTime();
        System.out.println(calFormat.format(add1yDate));
        // nowCalendarインスタンスの設定時刻リセット。
        nowCalendar.add(Calendar.YEAR,-1);
        // 2カ月後、前に使用したインスタンスはそのまま値を保持しているので、別のインスタンスを確保した方が良いようだ。
        nowCalendar.add(Calendar.MONTH,2);
        Date add2mDate = nowCalendar.getTime();
        System.out.println(calFormat.format(add2mDate));
        nowCalendar.add(Calendar.MONTH,-2);
        // 三週間前
        nowCalendar.add(Calendar.WEEK_OF_MONTH,-3);
        Date del3wDate = nowCalendar.getTime();
        System.out.println(calFormat.format(del3wDate));
        nowCalendar.add(Calendar.WEEK_OF_MONTH,3);
        // 四日前
        nowCalendar.add(Calendar.DAY_OF_MONTH,-4);
        Date del4dDate = nowCalendar.getTime();
        System.out.println(calFormat.format(del4dDate));
        nowCalendar.add(Calendar.DAY_OF_MONTH,4);
        // 五時間後
        nowCalendar.add(Calendar.HOUR_OF_DAY,5);
        Date add5hDate = nowCalendar.getTime();
        System.out.println(calFormat.format(add5hDate));
        nowCalendar.add(Calendar.HOUR_OF_DAY,-5);
        // 六分前
        nowCalendar.add(Calendar.MINUTE,-6);
        Date del6minDate = nowCalendar.getTime();
        System.out.println(calFormat.format(del6minDate));
        nowCalendar.add(Calendar.MINUTE,6);
        // 七秒前
        nowCalendar.add(Calendar.SECOND,-7);
        Date del7secDate = nowCalendar.getTime();
        System.out.println(calFormat.format(del7secDate));
        nowCalendar.add(Calendar.SECOND,7);
    }
}
