package basic.sample;

class SuperClass {}

interface Interface1 {}

class SubClass1 extends SuperClass {}

class SubClass2 extends SuperClass implements Interface1 {}

class InstanceOfSample {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass ();
        SubClass1 subClass1 = new SubClass1 ();
        SubClass2 subClass2 = new SubClass2 ();

        System.out.println("SuperClassで作ったインスタンスのinstanceofの結果");
        System.out.println("クラスSuperClassとインスタンスsuperClassの関係：" +(superClass instanceof SuperClass));

        System.out.println("SuperClassから継承したSubClass1,SubClass2で作ったインスタンスのinstanceofの結果");
        System.out.println("SuperClassから継承したSubClass1で作ったインスタンスsubClass1の関係："+(subClass1 instanceof SuperClass));
        System.out.println("SuperClassから継承したSubClass2で作ったインスタンスsubClass2の関係："+(subClass2 instanceof SuperClass));

        System.out.println("SubClass1で作ったインスタンスのinstanceofの結果");
        System.out.println("SubClass1で作ったインスタンスsubClass1とSuperClassの関係："+(subClass1 instanceof SuperClass));
        System.out.println("インスタンスsubClass1とSubClass1の関係："+(subClass1 instanceof SubClass1));
        // System.out.println(subClass2 instanceof SubClass1);
        // SubClass1とSubClass2は同じ親から作られているだけで双方に継承関係がないので、記述時点でIDEに無関係と指摘される。

        System.out.println("SubClass2で作ったインスタンスのinstanceofの結果：");
        System.out.println((subClass2 instanceof SuperClass));
        System.out.println((subClass2 instanceof SubClass2));
        // System.out.println(subClass1 instanceof SubClass2);
        // 上記のコメント部と同様の記述、双方に継承関係がないので、記述時点でIDEに無関係と指摘される。

        System.out.println("各クラスのインスタンスとInterface1との関係をinstanceofでチェックした結果：");
        System.out.println((subClass1 instanceof Interface1));
        System.out.println((subClass2 instanceof Interface1));
        System.out.println((superClass instanceof Interface1));

    }
}
