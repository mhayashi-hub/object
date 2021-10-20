package ex.item;

import java.util.HashMap;
import java.util.Map;

class ItemSearch {
    public static void main(String[] args) {
    // 商品はid、名前、価格を持つ。
    // HashMapにはkey,valueどちらにもオブジェクトを関連付けることも可能。ただ、たいていkeyにオブジェクトは使わない。
    // 表示する数値はvalueのみ、Keyを使わない。
    // 一覧表示でid順に並べ、id、商品名、価格をそろえて表示する。
    // テーブル構造として、HashMapの基本構造はkey,value一組のみ。
    // ペアの情報としてindexであるkeyを任意設定して、生成したItemクラスオブジェクトを値とすればよい。
        // HashMap生成
        Map<Integer, Item> itemList = new HashMap<>();
        // 個別商品のオブジェクト生成
        Item item1 = new Item(1, "消しゴム", 100);
        Item item2 = new Item(2, "ボールペン", 120);
        Item item3 = new Item(3, "コンパス", 400);
        Item item4 = new Item(4, "定規", 200);
        Item item5 = new Item(5, "ノート", 140);
        Item item6 = new Item(6, "付箋", 480);
        Item item7 = new Item(7, "えんぴつ", 500);
        // HashMapへのitemオブジェクト格納
        itemList.put(1,item1);
        itemList.put(2,item2);
        itemList.put(3,item3);
        itemList.put(4,item4);
        itemList.put(5,item5);
        itemList.put(6,item6);
        itemList.put(7,item7);
        // Mapへのputとitemオブジェクトのnewは一度にできる。
        // 今回はサンプルとして、idとキーを一致させキーをidとして扱う実装。
        // HashMapに追加する際にidとキーに合わせないとうまく検索ができなくなる。
        /*
        itemList.put(10,new Item(8,"赤鉛筆",600));　// 検索不能な例
        itemList.put(9,new Item(9,"色鉛筆",1600));  // 検索はできるがキーが飛んでいるのでID 8は見つからない。
        itemList.put(0,new Item(12,"サインペン",200));  // 許容範囲内なら既存の値より小さなキーを入れることも可能。
                                                      // でもIDを間違えてるのでこれもまともな検索は不能。
        // HashMapなどに入れたオブジェクトの中のフィールドを取得する方法はシステムやライブラリでは準備されていない。
        // オブジェクトの中から値を取り出したいなら一度オブジェクトを取り出して値を取り出し、テーブルのキーとして
        // 設定して新たなテーブルに作り直す必要がある。このような処理は自分で独自実装する必要がある。
         */

        // HashMapから一覧表の表示
        /*
        Integer i = 0;
        for (i= 1;i<=itemList.size();i++) {
            System.out.println(itemList.get(i));
        }
        */
        for (Item item:itemList.values()) {
            System.out.println(item);
        }
        // 一覧表との境界の改行(装飾用)
        // System.out.println("");
        // entrySet()では"[]"でくくってKey,Valueのペアをまとめて並べる。改行文字が入っていたら改行される。
        // System.out.println(itemList.entrySet());
        // HashMapそのものを出力すると"{}"でくくってKey,Valueのペアをまとめて並べる。
        // System.out.println(itemList);

        // 一覧表との境界の改行(装飾用)
        System.out.println("");

        // init search value
        int searchNo = 0;
        // set search value
        searchNo = 3;
        // System.out.println(itemList.containsValue(searchNo));
        System.out.println("商品ID" + searchNo + "による検索");
        if (itemList.isEmpty()) {
            System.out.println("Error: テーブルは空です。");
        // } else if (itemList.containsValue(searchNo) != true) {
        //     System.out.println("Error: IDがテーブルに含まれていません。");
        } else {
            if (searchNo > itemList.size()) {
                System.out.println("該当商品はありません");
            } else {
                System.out.println(itemList.get(searchNo));
            }
        }

        // 一覧表との境界の改行(装飾用)
        System.out.println("");

        if (itemList.containsKey(searchNo)) {
            System.out.println(String.format("商品ID%dによる検索",searchNo));
            System.out.println(itemList.get(searchNo));
        } else {
            System.out.println(String.format("商品ID%dによる検索",searchNo));
            System.out.println("該当商品はありません");
        }
    }
}

