package basic.human1;

//Humanクラスをデータとして利用するクラス
class HumanSample {
    public static void main(String[] args) {
        //変数の宣言（インスタンスの作成）
        Human human1 = new Human("Tom",28);
        Human human2 = new Human("Nancy",16);

        //インスタンスの利用
        //値の取得
        System.out.println(human1.getName());//Tom
        System.out.println(human1.getAge());//28
        System.out.println(human1);//Human{name='Tom', age=28}
        System.out.println(human2.getName());//Nancy
        System.out.println(human2.getAge());//16
        System.out.println(human2);//Human{name='Nancy', age=16}

        //値のセット
        human1.setName("Jack");
        human1.setAge(35);
        System.out.println(human1.getName());//Jack
        System.out.println(human1.getAge());//35
    }
}
