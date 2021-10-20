package ex.item;

import java.util.HashMap;
import java.util.Map;

class ItemSearch {
    public static void main(String[] args) {
        // 商品はid、名前、価格を持つ。
        // HashMapにはオブジェクトを関連付けることも可能。
        // 表示する数値はvalueのみ、Keyを使わない。
        // 一覧表示でid順に並べ、id、商品名、価格をそろえて表示する。
        // テーブル構造として、HashMapの基本構造はkey,value一組のみ。
        // ペアの情報としてindexであるkeyを任意設定して、生成したItemクラスオブジェクトを値とすればよいか。
        //
        int searchNo = 0;
        // HashMap生成
        Map<Integer,Item> itemList = new HashMap<>();
        // 個別商品のオブジェクト生成
        Item item1 = new Item(1,"消しゴム",100);
        Item item2 = new Item(2,"ボールペン",120);
        Item item3 = new Item(3,"コンパス",400);
        Item item4 = new Item(4,"定規",200);
        Item item5 = new Item(5,"ノート",140);
        Item item6 = new Item(6,"付箋",480);
        Item item7 = new Item(7,"えんぴつ",500);
        // HashMapへのオブジェクト格納
        itemList.put(1,item1);
        itemList.put(2,item2);
        itemList.put(3,item3);
        itemList.put(4,item4);
        itemList.put(5,item5);
        itemList.put(6,item6);
        itemList.put(7,item7);
        // HashMap表示
        if (itemList.isEmpty() != true) {
            System.out.println(itemList.get(searchNo));
        } else {
            System.out.println("List is empty.");
        }
    }
}
