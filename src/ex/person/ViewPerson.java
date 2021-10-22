package ex.person;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class ViewPerson {
    public static void main(String[] args) {
        // ArrayList作成、５名のデータでpersonインスタンスを作成して追加
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("しむら", Gender.MEN, 28);
        Person person2 = new Person("すどう", Gender.WOMEN, 34);
        Person person3 = new Person("そのだ", Gender.WOMEN, 21);
        Person person4 = new Person("さの", Gender.MEN, 42);
        Person person5 = new Person("せがわ", Gender.WOMEN, 55);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        // display result
        // task 1
        System.out.println("課題１");
        /*
        for (Person person:personList) {
            System.out.println(person);
        }
        */
        personList.forEach(System.out::println);
        // task 2
        System.out.println("課題２");
        personList.sort(Comparator.comparing(Person::getAge, Comparator.reverseOrder()));
        personList.forEach(System.out::println);
        // task 3
        System.out.println("課題３");
        /*
        List<Person> personListMen = new ArrayList<>();
        int i = 0;
        for (Person person:personList) {
            if (personList.get(i).getGender() == Gender.MEN) {
                personListMen.add(person);
            }
            i++;
        }
        personListMen.sort(Comparator.comparing(Person::getAge));
        personListMen.forEach(System.out::println);
         */
        //
        int countMen = 0;
        personList.sort(Comparator.comparing(Person::getAge));
        for (Person person : personList) {
            if (person.getGender() == Gender.MEN) {
                System.out.println(person);
                countMen++;
            }
        }
        if (countMen <= 0) {
            System.out.println("Error: 男性はリストに含まれていません。");
        }
        // task 4
        // 一度表示して終わりなど、作成直後に消費しつくして再利用しないものは変数格納しない方がよい。
        // 変数確保して置くとその分だけメモリ確保、メモリ占有で効率が落ちる。
        System.out.println("課題４");
        double sumMenAge = 0.0;
        double sumWomenAge = 0.0;
        int countWomen = 0;
        // countMenを念のため再初期化
        countMen = 0;
        for (Person person: personList) {
            if (person.getGender() == Gender.MEN) {
                sumMenAge += person.getAge();
                countMen++;
            } else if (person.getGender() == Gender.WOMEN) {
                sumWomenAge += person.getAge();
                countWomen++;
            } else {
                System.out.println("Error: 計算不能、性別が男女以外です。");
            }
        }
        if (countMen <= 0 ) {
            System.out.println("男性の平均年齢：　男性はリストに含まれていません。");
        } else {
            System.out.println("男性の平均年齢："+(Math.round(sumMenAge * 10.0 / countMen) / 10.0));
        }
        if (countWomen <= 0) {
            System.out.println("女性の平均年齢：　女性はリストに含まれていません。");
        } else {
            System.out.println("女性の平均年齢："+(Math.round(sumWomenAge * 10.0 / countWomen) / 10.0));
        }
        // task 5
        System.out.println("課題５");
        /*
        personList.sort(Comparator.comparing(Person::getAge,Comparator.reverseOrder()));
        for (Person person:personList) {
            if (person.getGender() == Gender.MEN) {
                System.out.println("男性の最年長：" + person);
                break;
            }
        }
        for (Person person:personList) {
            if (person.getGender() == Gender.WOMEN) {
                System.out.println("女性の最年長：" + person);
                break;
            }
        }
         */
        int index = 0;
        List<Integer> menPos = new ArrayList<>();
        List<Integer> womenPos = new ArrayList<>();
        for (Person person:personList) {
            if (person.getGender().equals(Gender.MEN)) {
                menPos.add(index);
            } else if (person.getGender().equals(Gender.WOMEN)) {
                womenPos.add(index);
            }
            index++;
        }
        // size()は要素数のため1から数えるが、indexは0始まりなので単純にsize()をとると最大値はindexの範囲を超える。
        // そのためindexの最大値はsize()-1として生成する必要がある。
        System.out.println("男性の最年長：" + personList.get(menPos.get(menPos.size()-1)));
        System.out.println("女性の最年長：" + personList.get(womenPos.get(womenPos.size()-1)));
        System.out.println("男性の最年少：" + personList.get(menPos.get(0)));
        System.out.println("女性の最年少：" + personList.get(womenPos.get(0)));
    }
}
