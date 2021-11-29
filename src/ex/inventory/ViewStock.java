package ex.inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ViewStock {
    // 在庫情報、表示を扱うクラス
    public static void main(String[] args) {
        List<PersonalComputer> list = new ArrayList<>() {
            {
                add(new PersonalComputer("やまだ", 1, 1, 128, Constants.OS64, Constants.WIN10));
                add(new PersonalComputer("いけだ", 2, 1, 128, Constants.OS64, Constants.WIN11));
                add(new PersonalComputer("いのうえ", 3, 1, 500, Constants.OS64, Constants.WIN11));
                add(new PersonalComputer("たむら", 4, 2, 128, Constants.OS32, Constants.MAC));
                add(new PersonalComputer("わだ", 5, 2, 500, Constants.OS32, Constants.WIN10));
                add(new PersonalComputer("くどう", 6, 2, 256, Constants.OS64, Constants.MAC));
                add(new PersonalComputer("さらど", 7, 3, 256, Constants.OS32, Constants.WIN10));
                add(new PersonalComputer("あいざわ", 8, 3, 500, Constants.OS32, Constants.MAC));
            }
        };
        /*
        for (PersonalComputer element:list) {
            System.out.println(element);
        }
         */
        Map<,List<PersonalComputer>> stockMap = new HashMap<> ();
        int i = 0;
        for (PersonalComputer element:list) {
            if (! stockMap.containsKey((Integer) PersonalComputer.getPcNo())) {

            } else if () {

            }
            i++;
        }

    }
}
