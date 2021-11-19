package localtest.lambdaTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

class InterfaceFunctionSample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<> ();
        list1.add(20);
        list1.add(10);
        list1.add(1000);
        list1.add(100);
        list1.add(50);
        for (Integer num:list1) {
            System.out.println(num);
        }

        List<Integer> list2 = new Function<List<Integer>,List<Integer>>(){
            @Override
            public List<Integer> apply(List<Integer> list2){
                Collections.sort(list2);
                return list2;
            }
        }.apply(list1);

        for (Integer num:list2) {
            System.out.println(num +" を出力します。");
        }

        // listの内容をソートする部分をFunctionインターフェースでのlamda式に書き直し。
        /*
        List<Integer> list2 = (List<Integer> list2) -> {
            Collections.sort(list2);
            return list2;
        };
         */
        // streamのmapでメソッド参照可能にして、 + lambdaで書きなおした場合。
        list1.stream().sorted().map(s -> s +" を出力します。").forEach(System.out::println);
    }
}
