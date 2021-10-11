package basic.figure1;

class FigureSample {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5,41);
        Rectangle r2 = new Rectangle(3.5,2.4);
        Rectangle r3 = r1;
        // r1 = null;
        // objectにnullを代入すると値はnullになる。
        // 最初に生成したobjectはnullを代入したobject(実際はobjectのポインタを指す変数)からは参照されない。
        // 他のobjectから参照されている可能性があるので、object自体は消去されない。
        // 参照されなくなったobjectはGCによって回収されメモリ開放される。(タイミングは選べない。)
        Circle c1 = new Circle(4);
        Triangle t1 = new Triangle(3,4);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(c1);
        System.out.println(t1);

    }
}
