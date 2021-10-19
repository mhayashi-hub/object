package basic.inspection;



import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ViewResult {
    public static void main(String[] args) {
        // array list pattern
        List<Result> patients = new ArrayList<>();
        patients.addAll(Arrays.asList(
                new Result("202010110910", "山田太郎", "2021-10-19T13:45:30", 36.4, 85, 122, 84)
        ));
        // outoput table title
        System.out.println("ID 名前 検査日時 体温 脈拍 血圧(上) 血圧(下)  平均血圧");
        // data output
        for (Result patient:patients) {
            System.out.println(patient);
        };
    }
}
