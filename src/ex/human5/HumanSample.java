package ex.human5;

import basic.human5.IfSayHello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HumanSample {
    public static void main(String[] args) {
        List<IfSayHello> humans = new ArrayList<>();
        humans.addAll(Arrays.asList(
                new Chinese("宗"),
                new English("Jack"),
                new French("Paul"),
                new Japanese("まさのり"),
                new Deutsch("Martin")
                ));

        // show array by forE loop
        // hは配列要素の変数を自動で入れるための枠でしかなく、名称規則などはない。(forEループで自動でindexを入れてくれる。)
        for (IfSayHello human:humans) {
            human.sayHello();
        }
    }
}
