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
        personStreamList.stream().sorted((s1,s2) -> s2.getAge() - s1.getAge()).forEach(System.out::println);
        System.out.println("課題４別記述");
        personStreamList.stream().sorted(Comparator.comparing(Person::getAge).reversed())
                .forEach(System.out::println);
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
