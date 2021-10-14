package ex.figure2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FigureSample {
    public static void main(String[] args) {
        /*
        // 配列形式
        Figure[] figures = {
                new Circle(4),
                new Rectangle(5,41),
                new Rectangle(4,2),
                new Triangle(3,4),
                new Circle(2.5)
        };
        */
        /*
        // Figure配列をArrayListに書き換え
        // 空ArrayList作成しadd()で個別に追加
        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(4));
        figures.add(new Rectangle(5,41));
        figures.add(new Rectangle(4,2));
        figures.add(new Triangle(3,4));
        figures.add(new Circle(2.5));
        */
        /*
        // 空ArrayList作成しaddAll()で一気に追加
        List<Figure> figures = new ArrayList<>();
        figures.addAll(Arrays.asList(
                new Circle(4),
                new Rectangle(5,41),
                new Rectangle(4,2),
                new Triangle(3,4),
                new Circle(2.5)
        ));
        */
        /*
        // ArrayList作成時にインスタンスも追加
        List<Figure> figures = new ArrayList<>(
                Arrays.asList(
                        new Circle(4),
                        new Rectangle(5,41),
                        new Rectangle(4,2),
                        new Triangle(3,4),
                        new Circle(2.5)
                ));
        */
        // 先にオブジェクトをFigure型でインスタンス宣言しておく。
        // 実はFigureがスーパークラスでCircleなどの個別のサブクラスに継承しているので、Circleの宣言でも
        // Figureクラスとしてまとめて扱える？
        // ↑ サブクラスとスーパークラスでメンバが同一ならサブクラスでもスーパークラスでもどちらで宣言しても
        //   同じに扱える。ただしメンバを変更した場合はその限りでないので、メンバ構成の違いに注意する必要がある。
        Circle figCir1 = new Circle(4);
        Figure figRct1 = new Rectangle(5,41);
        Figure figRct2 = new Rectangle(4,2);
        Figure figTri1 = new Triangle(3,4);
        Figure figCir2 = new Circle(2.5);
        // 宣言済みインスタンスをArrays.asListにまとめて指定して与える。
        // 事前にFigure型インスタンスとしてnewしてあるので、もうインスタンスを並べるだけでよい。
        List<Figure> figures = new ArrayList<>(
                Arrays.asList(figCir1,figRct1,figRct2,figTri1,figCir2)
        );
        // forE loop
        for (Figure figure:figures) {
            System.out.println(figure);
        }

        /*
        Rectangle r1 = new Rectangle(5,41);
        Rectangle r2 = new Rectangle(3.5,2.4);
        Rectangle r3 = r1;
        r1 = null;
        // objectにnullを代入すると値はnullになる。
        // 最初に生成したobjectはnullを代入したobject(実際はobjectのポインタを指す変数)からは参照されない。
        // 他のobjectから参照されている可能性があるので、object自体は消去されない。
        // 参照されなくなったobjectはGCによって回収されメモリ開放される。(タイミングは選べない。)
        // nullが代入されている変数もGCで回収されるはず。
        // Javas言語上では、objectも変数も、確保したメモリ領域上の枠(変数やオブジェクトのハコ)を
        // プログラム上でタイミングを明確に指定して消す方法がない。
        // (アクセスするタイミングによっては、クラスかパッケージ内、もしくはpublicクラス内だったら参照できてしまう。)
        Rectangle r4 = new Rectangle(4,6);
        Circle c1 = new Circle(4);
        Triangle t1 = new Triangle(3,4);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(c1);
        System.out.println(t1);
        System.out.println(r4);
        System.out.println(Math.PI);
        */
    }
}
