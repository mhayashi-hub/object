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
                add(new PersonalComputer("やまだ", 1, 1, 40000, Constants.OS64, Constants.WIN10));
                add(new PersonalComputer("いけだ", 2, 1, 90000, Constants.OS64, Constants.WIN11));
                add(new PersonalComputer("いのうえ", 3, 1, 80000, Constants.OS64, Constants.WIN11));
                add(new PersonalComputer("たむら", 4, 2, 120000, Constants.OS32, Constants.MAC));
                add(new PersonalComputer("わだ", 5, 2, 30000, Constants.OS32, Constants.WIN10));
                add(new PersonalComputer("くどう", 6, 2, 150000, Constants.OS64, Constants.MAC));
                add(new PersonalComputer("さらど", 7, 3, 40000, Constants.OS32, Constants.WIN10));
                add(new PersonalComputer("あいざわ", 8, 3, 70000, Constants.OS32, Constants.MAC));
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
                                +" :在庫収納倉庫番号 "+ extobj.storageNo
                                +" OStype: "+ extobj.Os +" : "
                                + extobj.bit +" bit: "
                                +"価格 "+ extobj.price +" 円");
            }
        }
        Map<Integer,List<PersonalComputer>> storagePriceMap = new HashMap<> ();
        for (PersonalComputer pcPart:tableList) {
            if (! storagePriceMap.containsKey(pcPart.getStorageNo())) {
                List<PersonalComputer> list = new ArrayList<> ();
                list.add(pcPart);
                storagePriceMap.put(pcPart.getStorageNo(),list);
            } else if (storagePriceMap.containsKey(pcPart.getStorageNo())) {
                storagePriceMap.get(pcPart.getStorageNo()).add(pcPart);
            } else {
                System.out.println("Error : マップに情報を追加できませんでした。");
            }
        }
        // System.out.println(storagePriceMap);
        for (Map.Entry<Integer, List<PersonalComputer>> entry:storagePriceMap.entrySet()) {
            List<PersonalComputer> extPcList = (List<PersonalComputer>) entry.getValue();
            System.out.println("在庫収納倉庫番号："+ entry.getKey());
            for (PersonalComputer outList:extPcList) {
                System.out.println("PC管理番号："+ outList.getPcNo()
                        +" OS: "+ outList.getOS() +" "+ outList.getBit() +"bit"
                        +" 在庫価格："+ outList.getPrice() +"円");
                }
            }

        Map<Integer,List<Integer>> priceMap = new HashMap<> ();
        for (PersonalComputer part:tableList) {
            if (! priceMap.containsKey(part.getStorageNo())) {
                List<Integer> priceList = new ArrayList<>();
                priceList.add(part.getPrice());
                priceMap.put(part.getStorageNo(), priceList);
            } else if (priceMap.containsKey(part.getStorageNo())) {
                priceMap.get(part.getStorageNo()).add(part.getPrice());
            } else {
                System.out.println("Error : マップに情報を追加できませんでした。");
            }
        }
        //    System.out.println(priceMap);
        for (Map.Entry pcEntry:priceMap.entrySet()) {
            List<Integer> outPriceList = (List<Integer>) pcEntry.getValue();
            System.out.println("在庫収納倉庫番号："+ pcEntry.getKey());
            for (Integer partPrice:outPriceList) {
                System.out.println("在庫品価格："+ partPrice +"円");
            }
        }
    }
}