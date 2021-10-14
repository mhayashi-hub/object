package basic.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class ArrayListSample {
    public static void main(String[] args) {
        //宣言と初期化
        List<Integer> list = new ArrayList<>();

        //初期化
        list.addAll(Arrays.asList(20, 10, 40, 30, 50));

        //表示
        System.out.println(list);

        //要素の追加
        list.add(60);
        System.out.println(list);
        list.add(2, 70);
        System.out.println(list);

        //要素の上書き
        list.set(0, 80);
        System.out.println(list);

        //要素の削除
        list.remove(2);
        System.out.println(list);

        list.removeAll(Arrays.asList(30, 60));
        System.out.println(list);

        // 指定したキー(ただしコレクション形式)に合致しない要素を削る
        // リストを突き合わせて一致した要素のみを残す処理。
        List<Integer> list2 = new ArrayList<>(Arrays.asList(80,10,45,40,5,50,65,22,34));
        list.add(21);
        list.add(51);
        System.out.println(list);
        list.retainAll(list2);
        System.out.println(list);

        //インデックスを指定して要素を取得
        System.out.println(list.get(3));

        //サイズ
        System.out.println(list.size());

        //一部の要素の取得
        System.out.println(list.subList(1, 3));

        //要素の消去
        list.clear();
        System.out.println(list);

        System.out.println(list.isEmpty());//true

        // 空にしたリストへ再追加
        list.addAll(Arrays.asList(2,6,1,4,5,0));
        System.out.println(list);

        // 値の検索
        // Listに6があるのでtrueを返す。
        System.out.println(list.contains(6));
        // Listには10を入れてないのでfalseを返す。List内に指定したキーがないことをbooleanで判定可能。
        System.out.println(list.contains(10));
        // 値(リストっぽいもの)と全部要素が合致するかの検索
        // 1,2,4はすべて含まれているのでtrueを返す。
        System.out.println(list.containsAll(Arrays.asList(1,2,4)));
        // 1,2は含まれるが3がないのでfalseを返す。(指定した要素全部が一致しない場合、false)
        System.out.println(list.containsAll(Arrays.asList(1,2,3)));
        //　要素内でキーとした値の検索
        // 仮に値を追加
        list.addAll(Arrays.asList(3,2,45,5,4,6));
        System.out.println(list);
        int num = 4;
        if (list.contains(num)) {
            // 値と一致する、最初から検索して最初に見つかった要素のindex
            System.out.println(list.indexOf(num));
            // 値と一致する、最後から検索して最初に見つかった要素のindex
            System.out.println(list.lastIndexOf(num));
        }
        // sort
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
