package ex.human5a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HumanSample {
    public static void main(String[] args) {
        /*
        Human[] humans = {
                new English("Tom"),
                new Japanese("ひろし"),
                new Chinese("王"),
                new French("Abel"),
                new Deutsch("Edwin")
        };
        // show array by fore loop
        for (Human human:humans) {
            human.sayHello();
        }
         */
        /*
        IfSayHello[] hellohumans = {
                new Chinese("宗"),
                new English("Jack"),
                new French("Paul"),
                new Japanese("まさのり"),
                new Deutsch("Martin")
        };
        */
        // ArrayList version
        List<Human> humans = new ArrayList<>();
        humans.addAll(
                Arrays.asList(
                        new Chinese("秦"),
                        new English("Jack"),
                        new French("Macron"),
                        new Japanese("たかはる"),
                        new Deutsch("Martin")
                )
        );
        /*
        // show array by forE loop
        // hは配列要素の変数を自動で入れるための枠でしかなく、名称規則などはない。(forEループで自動でindexを入れてくれる。)
        for (IfSayHello h:hellohumans) {
            h.sayHello();
        }
         */
        for (Human human:humans) {
            human.sayHello();
        }
    }
}
