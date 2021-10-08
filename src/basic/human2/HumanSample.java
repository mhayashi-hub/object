package basic.human2;

//フィールドがプライベートではないときの違い
class HumanSample {
    public static void main(String[] args) {
        Human human21 = new Human("Tom",28);

        //フィールドに直接アクセスできてしまう
        System.out.println(human21.name);
        System.out.println(human21.age);
        human21.name = "Jack";
        human21.age = 35;
        System.out.println(human21.name);
        System.out.println(human21.age);

        //Human2クラスはカプセル化できていない
    }
}
