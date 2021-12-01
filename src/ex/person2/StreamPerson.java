package ex.person2;

import basic.sample.enumsample.Gender;

import java.util.*;
import java.util.stream.Collectors;

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

        // 課題６
        System.out.println("課題６");
        personStreamList.stream().map(s -> s.getName()).forEach(System.out::println);
        // 課題７ Genderでグループ化したマップを生成する。
        // 期待するのはGender.MENとGender.WOMENの二通りのマップ生成だが、collect+groupingByだと出力結果は一つのマップ。
        System.out.println("課題７");
        Map<Gender,List<Person>> genderGroupListMap = personStreamList.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        // System.out.println(genderGroupListMap);
        // GenderでGroupingした一つのマップを加工して出力して課題の回答と同じ形式で出力。
        genderGroupListMap.entrySet().stream().map(s -> s.getKey().getJpName() +":"+ s.getValue())
                .forEach(System.out::println);
        // GroupingByでグループ化した後で別のマップに分割してみる。
        // toMapとか使わずにcollectでマップオブジェクトとして渡して生成、生成前の時点でGroupingするが、その前に
        // Genderでfilterをかけておけば、性別ごとのマップとしてまとめることができる。
        // ただやり方としては一つのマップでGroupingByでグループ化したものと特に変わらないので、二つのマップに
        // 分割する時点で手間が増えている。
        Map<Gender,List<Person>> menGroupListMap = personStreamList.stream()
                .filter(s -> s.getGender().equals(Gender.MEN)).collect(Collectors.groupingBy(Person::getGender));
        // System.out.println(menGroupListMap);
        menGroupListMap.entrySet().stream().map(s -> s.getKey().getJpName() +":"+ s.getValue())
                .forEach(System.out::println);
        Map<Gender,List<Person>> womenGroupListMap = personStreamList.stream()
                .filter(s -> s.getGender().equals(Gender.WOMEN)).collect(Collectors.groupingBy(Person::getGender));
        womenGroupListMap.entrySet().stream().map(s -> s.getKey().getJpName() +":"+ s.getValue())
                .forEach(System.out::println);

        // 課題８ 最初に考え付いたのはGenderでフィルタして分けてAgeでソートしてから最初に出てくる値をとる方法。
        System.out.println("課題８");
        System.out.println(personStreamList.stream().filter(p -> p.getGender().equals(Gender.MEN))
                        .sorted(Comparator.comparing(Person::getAge).reversed()).findFirst().get());
        // 課題８別解 Genderでふるい分けした後、単純にmaxを使ってageの最大値をとる方法で書きなおし。
        // Optional型をget()メソッドで値に変換、nullオブジェクトの場合はnullがそのまま出てしまう危険あり。
        System.out.println(personStreamList.stream().filter(p -> p.getGender().equals(Gender.MEN))
                            .max(Comparator.comparing(Person::getAge)).get());
        // 課題８別解　ifPresentを使ってnullオブジェクトを扱わせないようにする方法。
        // ifPresent()を使うと、nullでない場合にメソッドの()内の処理を実行して、その処理にOptional型から
        // 値を取り出して引き渡せるので、get()いらずでnullの例外を出さずに処理ができる。
        // つまりget()で値に変換するとprintlnに渡す処理をさらに上にかぶせる必要があるが、ifPresent()だと
        // ()内の処理にprintlnを入れて値として渡せるので、上にprintlnをかぶせる必要がなくなる。
        personStreamList.stream().filter(p -> p.getGender().equals(Gender.MEN))
                .max(Comparator.comparing(Person::getAge)).ifPresent(s -> System.out.println(s));

        // 課題９
        System.out.println("課題９");
        System.out.println(personStreamList.stream().filter(p -> p.getGender().equals(Gender.WOMEN))
                            .sorted(Comparator.comparing(Person::getAge)).findFirst().get());
        // 課題９別解
        System.out.println(personStreamList.stream().filter(p -> p.getGender().equals(Gender.WOMEN))
                            .min(Comparator.comparing(Person::getAge)).get());
        // 課題９別解 ifPresent()を使って書き直し。
        personStreamList.stream().filter(p -> p.getGender().equals(Gender.WOMEN))
                .min(Comparator.comparing(Person::getAge)).ifPresent(s -> System.out.println(s));

        // 課題１０
        System.out.println("課題１０");
        OptionalDouble womenAgeAverage = personStreamList.stream().filter(p -> p.getGender().equals(Gender.WOMEN))
                .mapToInt(s -> s.getAge()).average();
        // averageの結果でOptionalDoubleが出てくるため、上記ではOptionalDoubleの変数に格納してから下でgetAsDoubleで
        // Doubleに変換している。この場合もnullが出る可能性があるが、この処理(get**())では特に対処していないので、
        // 仮にnullが発生していた場合は実行時例外が起きてしまう。
        System.out.println("女性の平均年齢：" + womenAgeAverage.getAsDouble());
        // 課題１０別解 ifPresent()でIntStreamのgetAsDouble()も置き換え可能らしい。多態性の利点か？
        personStreamList.stream().filter(p -> p.getGender().equals(Gender.WOMEN))
                .mapToInt(s -> s.getAge()).average()
                .ifPresent(s -> System.out.println("女性の平均年齢；" + s));

        // 課題１１
        System.out.println("課題１１");
        OptionalDouble menAgeAverage = personStreamList.stream().filter(p -> p.getGender().equals(Gender.MEN))
                .mapToInt(s -> s.getAge()).average();
        System.out.println("男性の平均年齢：" + menAgeAverage.getAsDouble());
        // 課題１１別解 ifPresent()内でprintln使って出力。
        // 間違ってnullが入った場合の例外処理についても、事前にifPresentで発生しないようにしてるので対処済。
        personStreamList.stream().filter(p -> p.getGender().equals(Gender.MEN))
                .mapToInt(s -> s.getAge()).average()
                .ifPresent(s -> System.out.println("男性の平均年齢：" + s));

    }
}
