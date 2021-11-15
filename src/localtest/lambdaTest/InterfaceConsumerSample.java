package localtest.lambdaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class InterfaceConsumerSample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<> ();
        list1.add("赤");
        list1.add("青");
        list1.add("緑");
        // クラス化してConsumerを実装するのは別途クラスファイルを書くのが冗長すぎるので省略。
        // 書き方は基礎的なクラスにinterfaceをimpelementsで紐づけて実装を書く形式。
        // 匿名クラス化してConsumerを利用する。
        new Consumer<List<String>> () {
            @Override
            public void accept(List<String> list1) {
                for (String element:list1) {
                    System.out.println(element +" です。");
                }
            }
        }.accept(list1);
    }
}
