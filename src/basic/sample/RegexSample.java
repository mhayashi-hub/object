package basic.sample;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexSample {
    public static void main(String[] args) {
        // 正規表現でのパターンマッチ
        // 量演算子は{}でくくる、繰り返し回数固定なら{3},指定回数以上なら{4,}でカンマで終わり、
        // 範囲指定なら{4,6}で4回から6回の範囲として指定できる。
        // ()での指定はパターンの区切り？パターンのor判定に使う？
        // -> パターンの区切りのブロック指定をするためのものらしい？
        // String regex = "^((0|[2-4])|[6-9]){3}-[0-9]{4}$";
        String regex="^[0-9]{3}-[0-9]{4}$";
        // String regex="^[0-9]{3,}-[0-9]{4,}$";
        // メタキャラクタ\dで半角数字を指定可能、\Dでは半角数字以外を指定可能
        // String regex="^\\d{3}-\\d{4}$";
        String zip1 = "064-0809";
        System.out.println(zip1.matches(regex));
        String zip2 = "0000-888";
        System.out.println(zip2.matches(regex));
        String zip3 = "051-2764";
        System.out.println(zip3.matches(regex));

        // 正規表現パターンオブジェクトの準備
        Pattern pattern = Pattern.compile("^[0-9]{3}-[0-9]{4}$");
        // 比較する処理を指定したパターンで行う処理、実際の処理はここでは行わず仕組みを作る部分
        Matcher matcher = pattern.matcher(zip1);
        //
        List<String> zipList = List.of("064-0809","0000-888");

        for (String zip:zipList) {
            matcher = pattern.matcher(zip);
            if (matcher.matches()) {
                System.out.println(zip + ":OK");
            } else {
                System.out.println(zip + ":NG");
            }
        }
    }
}
