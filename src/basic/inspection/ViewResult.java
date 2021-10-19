package basic.inspection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ViewResult {
    public static void main(String[] args) {
        // array list pattern
        List<Result> patients = new ArrayList<>();
        patients.addAll(Arrays.asList(
                new Result("202010110910",
                        "山田太郎",
                        "2021-10-19T13:45:30",
                        36.4, 85,
                        122, 84),
                new Result("201901120408",
                        "川本輝夫",
                        "2021-10-18T16:15:20",
                        36.2,96,
                        133,109),
                new Result("201806051214",
                        "酒井正太郎",
                        "2021-09-29T09:39:01",
                        37.2,102,
                        145,120)
        ));
        // outoput table title
        // System.out.println(" ID           名前      検査日時             体温  脈拍 血圧(上) 血圧(下) 平均血圧");
        System.out.printf(" %2s %11s %10s %15s %3s %3s %s %s\n","ID","名前","検査日時","体温","脈拍","血圧(上)","血圧(下)","平均血圧");
        // data output
        for (Result patient:patients) {
            System.out.println(patient);
        };
    }
}