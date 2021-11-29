package ex.inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ViewStock {
    // 在庫情報、表示を扱うクラス
    public static void main(String[] args) {
        List<PersonalComputer> tableList = new ArrayList<>() {
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
        for (PersonalComputer element:tableList) {
            System.out.println(element);
        }
         */
        Map<Integer,List<PersonalComputer>> stockMap = new HashMap<> ();
        for (PersonalComputer personPc:tableList) {
            if (! stockMap.containsKey(personPc.getPcNo())) {
                    List <PersonalComputer> list = new ArrayList<> ();
                    list.add(personPc);
                    stockMap.put(personPc.getPcNo(),list);
            } else if (stockMap.containsKey(personPc.getPcNo())) {
                    stockMap.get(personPc.getPcNo()).add(personPc);
            } else {
                System.out.println("Error：stockMapに項目を追加できません。");
                break;
            }
        }
        for (Map.Entry entry:stockMap.entrySet()) {
            List<PersonalComputer> extList = (List<PersonalComputer>) entry.getValue();
            for (PersonalComputer extobj:extList) {
                // System.out.println(extobj);
                System.out.println(
                        "使用者名 "+ extobj.userName
                                +" :PC管理番号 "+ extobj.pcNo
                                +" :ストレージ管理番号 "+ extobj.storageNo
                                +" OStype: "+ extobj.Os +" : "
                                + extobj.bit +" bit: "
                                +"メモリ "+ extobj.memory +" GB");
            }
        }
    }
}
