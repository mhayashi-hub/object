package localtest.stringsTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class FormatSample {
    public static void main(String[] args) {
        // 指定した書式、形式で文字列を成型することができる。
        // Cなどのprintfでの書式指定と類似している。
        // 文字列の場合
        String str = "samples";
        // 数値+シンボルだと右詰めで残った部分は空白で表示。
        System.out.println(String.format("値は「%10s」です。",str));
        // -数値+シンボルだと左詰めで残った部分は空白で表示。
        System.out.println(String.format("値は「%-10s」です。",str));
        // .数値+シンボルだと出力する最小表示文字数を指定できる。数値のみを指定した場合は最大表示文字数。
        System.out.println(String.format("値は「%.2s」です。",str));
        // 数値の場合
        Double number = 1.234567;
        // %e指定の場合は指数表記がe+数値になる。
        System.out.println(String.format("数値は「%e」です。",number));
        // %E指定の場合は指数表記がE+数値になる。
        System.out.println(String.format("数値は「%E」です。",number));
        // %f指定の場合はfloat形式の表示になる。
        System.out.println(String.format("数値は「%f」です。",number));
        // %.数値fの場合はfloat形式だが小数点以下の桁数を数値の分まで表示し、かつ表示されない最初の桁で四捨五入する。
        // この場合は小数点以下の桁が表示桁より多い場合。
        System.out.println(String.format("数値は「%.3f」です。",number));
        // %.数値fで小数点以下の桁が表示桁より少ない場合、0埋めして表示する。
        System.out.println(String.format("数値は「%.7f」です。",number));
        // 日付や時刻の場合(LocalDateTimeを使う方法、Dateとかは非推奨になっているため。)
        LocalDateTime cDay = LocalDateTime.now();
        // %tで時刻日付の出力表示として機能する。そのあとのY,m,dは年月日、HMSは時分秒を表示することを指定している。
        System.out.println(String.format("%tY年 %tm月 %td日",cDay,cDay,cDay));
        System.out.println(String.format("%tH時 %tM分 %tS秒",cDay,cDay,cDay));
    }
}
