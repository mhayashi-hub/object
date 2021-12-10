package ex.dateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class showCalender {
    public static void main(String[] args) {
        // Calendarクラスを使用。
        // nowと１年、２カ月、３週間、４日前、５時間後、６分前、７秒前を表示。
        // yyyy年MM時dd日 hh時mm分ss秒 で表示。
        Calendar nowCalendar = Calendar.getInstance();
        Date nowDate = nowCalendar.getTime();
        DateFormat calFormat = new SimpleDateFormat("yyyy年MM月dd日 hh時mm分ss秒");
        System.out.println(calFormat.format(nowDate));
        
    }
}
