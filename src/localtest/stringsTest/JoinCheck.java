package localtest.stringsTest;

import java.util.ArrayList;
import java.util.List;

class JoinCheck {
    public static void main(String[] args) {
        // join()の最初の引数がデリミタ、区切り文字になり、そのあとに続けて書いた文字列が要素として区切り文字を挟んで結合される。
        String count1 = String.join("/","One","Two","Three","Four");
        System.out.println(count1);
        // elementの処理はイテレータを持つクラス使って繰り返し処理が可能。
        List<String> strList = new ArrayList<>();
        strList.add("One");
        strList.add("Two");
        strList.add("Three");
        strList.add("Four");
        strList.add("Five");
        // 下の記述でIteratorを持つListクラスから全要素を取り出して区切り文字で連結し文字列とする操作となる。
        String count2 = String.join("/",strList);
        System.out.println(count2);
    }
}
