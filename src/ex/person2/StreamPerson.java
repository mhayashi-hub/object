package ex.person2;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StreamPerson {
    public static void main(String[] args) {
        // stream API演習課題
        // ArrayListでのList作成
        // 課題１
        List<Person> personStreamList = new ArrayList<>(15);
        personStreamList.add(new Person("やまだ", BirthPlace.HOKKAIDO, Gender.MEN, 35));
        personStreamList.add(new Person("いけだ", BirthPlace.HOKKAIDO, Gender.WOMEN, 26));
        personStreamList.add(new Person("いのうえ", BirthPlace.FUKUOKA, Gender.MEN, 32));
        personStreamList.add(new Person("たむら", BirthPlace.FUKUOKA, Gender.WOMEN, 22));
        personStreamList.add(new Person("わだ", BirthPlace.TOKYO, Gender.MEN, 42));
        personStreamList.add(new Person("くどう", BirthPlace.TOKYO, Gender.WOMEN, 55));
        personStreamList.add(new Person("さらど", BirthPlace.OSAKA, Gender.MEN, 31));
        personStreamList.add(new Person("あいざわ", BirthPlace.OSAKA, Gender.WOMEN, 44));
        // List内容確認
        System.out.println("課題１");
        for (Person element : personStreamList) {
            System.out.println(element);
        }

        System.out.println("練習１");
        personStreamList.stream().filter(s -> s.getAge() >= 35).forEach(System.out::println);
        // 課題２
        System.out.println("課題２");
        personStreamList.stream().map(p -> p.getName()).forEach(System.out::println);
        // 課題３
        System.out.println("課題３");
        personStreamList.stream().filter(n -> n.getGender() == Gender.MEN).forEach(System.out::println);
        // 課題３－１ 女性のみをリストから抽出して表示
        System.out.println("課題３－１");
        personStreamList.stream().filter(n -> n.getGender().equals(Gender.WOMEN)).forEach(System.out::println);
        // 課題４
        System.out.println("課題４");
        // 数値比較を行う場合、sortedメソッド内でlambda式を指定してソートすることができるがわかりにくい。
        // 下記記述のs1は前に出現する要素、s2は後に出現する要素(そしてそれらのgetAgeでとれる値のintを比較できるという意味合いの記述)で、
        // 後に出現する要素が前より大きいようにする、つまり降順、数字が小さくなる並びにするにはs2を先に指定してs2.** - s1.++ とする。
        // 非常に分かりにくいが昇順なら s1.** - s2.**、降順ならs2.** - s1.** となると一律で覚えられる。
        personStreamList.stream().sorted((s1,s2) -> s2.getAge() - s1.getAge()).forEach(System.out::println);
        System.out.println("課題４別記述");
        // Java8的に本来推奨されるべきはこちらの記述らしい。Comparator.comparingを使った方がわかりやすいか。
        // Person::getAgeはクラスのメソッドを参照するための記述で、Stream APIでよく使われる。System.out::printlnと同じ。
        personStreamList.stream().sorted(Comparator.comparing(Person::getAge).reversed())
                .forEach(System.out::println);
        // 課題４－１ 年齢の昇順で並べて出力
        System.out.println("課題４－１");
        personStreamList.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
        // 課題５
        System.out.println("課題５");
        personStreamList.stream().filter(s -> s.getGender().equals(Gender.MEN))
                .sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
        // 課題５－a　女性のみを抽出して降順で表示
        System.out.println("課題５-a");
        personStreamList.stream().filter(s -> s.getGender().equals(Gender.WOMEN))
                .sorted(Comparator.comparing(Person::getName).reversed())
                .forEach(System.out::println);
    }
}
