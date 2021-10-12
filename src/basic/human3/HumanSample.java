package basic.human3;

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
                new Human("Tom"),
                new Japanese("ひろし"),
                new Chinese("王"),
                new French("Abel"),
                new Deutsch("Edwin")
        };
        // show array by fore loop
        for (Human human:humans) {
            human.sayHello();
        }
    }
}
