package basic.sample.map.student;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentMapSample {
    public static void main(String[] args) {
        // ListをvalueにとったMap構造を生成
        Map<String,List<Student>> studentGroupMap = new HashMap<>();
        // 15人、1クラス3人の成績リストを作成
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("1-1","やまだ", Gender.MEN,84,90,40));
        studentList.add(new Student("1-1","かねだ", Gender.MEN,40,50,43));
        studentList.add(new Student("1-1","さとう", Gender.MEN,65,72,89));
        studentList.add(new Student("1-2","すずき", Gender.MEN,88,63,80));
        studentList.add(new Student("1-2","たかだ", Gender.MEN,54,60,12));
        studentList.add(new Student("1-2","たかはし", Gender.MEN,42,88,90));
        studentList.add(new Student("1-3","もとやま", Gender.MEN,24,30,100));
        studentList.add(new Student("1-3","いいだ", Gender.MEN,67,23,79));
        studentList.add(new Student("1-3","はしの", Gender.MEN,93,72,32));
        studentList.add(new Student("1-4","えもと", Gender.MEN,55,40,60));
        studentList.add(new Student("1-4","おの", Gender.MEN,74,90,86));
        studentList.add(new Student("1-4","いいじま", Gender.MEN,92,94,19));
        studentList.add(new Student("1-5","さはら", Gender.MEN,40,39,70));
        studentList.add(new Student("1-5","かなもと", Gender.MEN,64,81,40));
        studentList.add(new Student("1-5","きの", Gender.MEN,48,93,77));
        // forE文でstudentの情報をstudentListから取り出して処理するのを繰り返す
        for (Student student:studentList) {
            // student変数に入ったインスタンスのGroupを取り出して、マップstudentGroupMapのkeyの値にその値があるか
            // 判定がtrue/falseで出るのでif-else分岐に乗せられる。
            // keyの値がすでにある(true)場合には、そのkeyに対応するvalueをstudentGroupMapに追加する。
            // マップ構造の場合、keyやValueが共通でも双方が一致しない場合は別のペアとして格納できる？
            //  -> key:valueのペアでkey側が一致している場合はvalue側が更新される。
            // containsKeyでマップ内のkeyが設定されているかを判定しtrueならifの中身を実行
            if (studentGroupMap.containsKey(student.getGroup())) {
                // マップでgetしたのがArrayList形式のため、ArrayListインスタンスとして扱える
                // = ArrayList自体の操作がこの時点で可能、getした後のインスタンスのメソッド操作が可能
                //  = なので、ArrayListにあるadd()メソッドが使える(IDEの自動補完もできる)
                studentGroupMap.get(student.getGroup()).add(student);
            } else {
                // elseの処理で個別のリストlistを生成、変数オブジェクトstudentをlistに追加
                // 追加済みのlistをマップstudentGroupMapにkey:student.getGroup()、value:listリストで追加
                List<Student> list = new ArrayList<>();
                list.add(student);
                studentGroupMap.put(student.getGroup(),list);
            }
        }
        // for文でマップstudentGroupMapからentryにマップのSet形式の表示結果を取り出す。
        for (Map.Entry entry:studentGroupMap.entrySet()) {
            // 変数オブジェクトentryにkey,valueの組み合わせをひとつづつ取り出す。
            // System.out.println(entry);
            // getValue()メソッドでvalueの部分を取り出す。
            // System.out.println(entry.getValue());
            // set形式のデータのためList形式にキャストしてListの処理に合わせやすくする。
            int japSum = 0;
            int mathSum = 0;
            int engSum = 0;
            double japAve = 0.0;
            double mathAve = 0.0;
            double engAve = 0.0;
            List<Student> list = (List<Student>) entry.getValue();
            // for文で繰り返しつつListの個別要素を表示する。
            for (Student student:list) {
                System.out.println(student);
                // グループごとの各教科の合計点、平均点を出す。
                japSum += student.getJap();
                mathSum += student.getMath();
                engSum += student.getEng();
            }
            // キャスト処理の場合にList構造なら何でもいいという場合、ワイルドカード?をダイヤモンド演算子中に使用できる。
            // (List<?>) キャストする対象のオブジェクト、この場合はsetオブジェクトのはず。
            // 今回はListインターフェースのsizeメソッドが使えるならよいのでSetをListの形式にあてはめている。
            japAve = Math.round((double) japSum / ((List<Student>) entry.getValue()).size() *100.0) /100.0;
            mathAve = Math.round((double) mathSum / ((List<Student>) entry.getValue()).size() *100.0) /100.0;
            engAve = Math.round((double) engSum / ((List<Student>) entry.getValue()).size() *100.0) /100.0;
            System.out.println(entry.getKey()+" クラス毎教科合計点 国語："+japSum+" 数学："+mathSum+" 英語："+engSum);
            System.out.println(entry.getKey()+" クラス毎教科平均点 国語："+japAve+" 数学："+mathAve+" 英語："+engAve);
        }
        // System.out.println(studentGroupMap);
    }
}
