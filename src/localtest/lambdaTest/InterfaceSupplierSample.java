package localtest.lambdaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class InterfaceSupplierSample {
    public static void main(String[] args) {
        // リストを返すインタフェースで作ったリストインスタンスとして定義している。
        List<String> list2 = new Supplier<List<String>>() {
            @Override
            public List<String> get() {
                List<String> list1 = new ArrayList<>();
                // 入力がないので内部で値を設定する、もしくは出力する値を保持していないといけない。
                // なので内部でlist構築後に値を入力しておく必要がある。
                list1.add("赤");
                list1.add("緑");
                list1.add("黄");
                // 戻り値として出す必要があるので、保持している値をreturnで出すよう定義する。
                return list1;
            }
        }.get();
        // 最後に.get()として内部でオーバーライドした実装でリストの値を取り出して渡しているので、
        // 受け取った値は定義はSupplierインタフェースではあるが内部で定義したStringのリストを
        // 出力してそれをリストにしていることになる。ちょっと冗長な仕組み？
        // Override部分を無視して書くと、List<String> list2 = new Supplier<List<String>>.get();となるはず。
        // list2に渡させるのはList<String>を構成する値そのものになるのでList<String>に合致して処理できる。
        // 元からSupplierの中に値が設定されていればそのままでてくるはずだが何もないはずなので実装しないと値が取り出せない。

        for (String element:list2) {
            System.out.println(element +" でした。");
        }

    }
}
