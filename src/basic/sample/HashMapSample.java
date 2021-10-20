package basic.sample;

import java.util.HashMap;
import java.util.Map;

class HashMapSample {
    public static void main(String[] args) {
        // declaration of HashMap with 32 capa
        Map<String,String> map = new HashMap<>(32);
        // add element of map
        map.put("apple","りんご");
        // display test of map contents
        System.out.println(map);
        // get element of map
        System.out.println(map.get("apple"));
        // check value of key with empty value
        // System.out.println(map.get("pearl"));
        // check map contents is empty or not
        // System.out.println(map.isEmpty());
        // map.putAllは作成済みのMapの内容をまるごとコピーする機能っぽい？
        // 複数の値とキーのペアを一度に設定する機能ではなさそう？
        map.put("orange","オレンジ");
        map.put("pineapple","パイナップル");
        map.put("grape","ぶどう");
        System.out.println(map);
        // check map is empty or not by if + contains method
        String mapKeyWord = "grape";
        if (map.containsKey(mapKeyWord) != false) {
            System.out.println(map.get(mapKeyWord));
        } else {
            System.out.println("key is not contained in map. key:"+mapKeyWord);
        }
        // value rewrite
        map.put("grape","ブドウ");
        // check rewrite value
        if (map.containsKey(mapKeyWord) != false) {
            System.out.println(map.get(mapKeyWord));
        } else {
            System.out.println("key is not contained in map. key:"+mapKeyWord);
        }
        // display map value
        System.out.println(map.values());
        // display map entry
        System.out.println(map.entrySet());
        // Mapはインデックスがないのでインデックスだよりで取り出せない。
        // 書き込んだ型などもMapの外から操作する場合はほぼ関係なくなる。
        // なのですべての要素を全部取り出して処理するforE構文との相性が良い、というかそれ以外はかなり面倒。
        for (Map.Entry entry:map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() );
        }
        // remove map entry
        map.remove("grape");
        System.out.println(map);
        // removeメソッドは削除したエントリの値を返すので、実行時に何を削除したかを確認はできる。
        // エントリの削除をするのと同時に値を出力するので、出力時点でエントリはなくなる。
        System.out.println(map.remove("orange"));
        // display size of map
        System.out.println(map.size());
        // search key in map 戻り値はboolean
        // mapはkey,valueどちらもオブジェクトをそのまま入れることが可能。
        System.out.println(map.containsKey("apple"));
        // search value in map
        System.out.println(map.containsValue("りんご"));
        // nullを返さない検索方法の例
        String searchWord = "apple";
        if (map.containsKey(searchWord)) {
            System.out.println(map.get(searchWord));
        } else {
            System.out.println("Not found in map: " + searchWord);
        }
    }
}
