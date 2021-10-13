package basic.human5c;

class HumanSample {
    public static void main(String[] args) {
        /*
        Human tom = new Human("Tom");
        tom.sayHello();

        Human nancy = new Human("Nancy");
        nancy.sayHello();

        Japanese takashi = new Japanese("たかし");
        takashi.sayHello();

        Chinese wang = new Chinese("王");
        wang.sayHello();

        French abel = new French("Abel");
        abel.sayHello();

        Deutsch edwin = new Deutsch("Edwin");
        edwin.sayHello();
         */
        // make Human type array as human extended classes
        Human[] humans = {
                new English("Tom"),
                new Japanese("ひろし"),
                new Chinese("王"),
                new French("Abel"),
                new Deutsch("Edwin")
        };
        // show array by fore loop
        // interfaceのimplementsでの関連付け、実装はサブクラススーパークラスどちらでも可、
        // ただし配列としてスーパークラスを使う際にスーパークラスでinterfaceのimplementsがないと、
        // interfaceの実装を用いて配列要素にアクセスできないのでNG、
        // interfaceの継承というかimplementsでの関連付けはスーパークラスに必須、
        // @Overrideでの実装自体はスーパークラスになくても問題はない。
        // 実際のサブクラス側に個別でinterface実装がしてあればOK
        for (Human human:humans) {
            System.out.println("発言者："+human.getName());
            human.sayHello();
        }
    }
}
