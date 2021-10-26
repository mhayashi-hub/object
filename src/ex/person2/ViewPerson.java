package ex.person2;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ViewPerson {
    // 課題内容：
    // 地域別に各性別の名前、年齢の人間を数人作成し、地域ごとのグループに分けてリストに作る。
    // 作ったリストから各地域ごとで集計し、地域ごとの平均年齢を計算して出力する。
    // 地域ごとに性別ごとの平均年齢を計算して出力する。
    public static void main(String[] args) {
        // initial list declaration
        List<Person> personList = new ArrayList<>();
        // initial list member add
        personList.add(new Person("しんかわ",BirthPlace.HOKKAIDO,Gender.MEN,44));
        personList.add(new Person("あらた",BirthPlace.HOKKAIDO,Gender.MEN,66));
        personList.add(new Person("しらかわ",BirthPlace.HOKKAIDO,Gender.MEN,37));
        personList.add(new Person("やの",BirthPlace.HOKKAIDO,Gender.WOMEN,44));
        personList.add(new Person("のざき",BirthPlace.HOKKAIDO,Gender.WOMEN,51));
        personList.add(new Person("いがわ",BirthPlace.HOKKAIDO,Gender.WOMEN,19));
        personList.add(new Person("すずき",BirthPlace.TOKYO,Gender.MEN,22));
        personList.add(new Person("はしもと",BirthPlace.TOKYO,Gender.MEN,58));
        personList.add(new Person("はしだ",BirthPlace.TOKYO,Gender.MEN,41));
        personList.add(new Person("てらもと",BirthPlace.TOKYO,Gender.MEN,43));
        personList.add(new Person("ささき",BirthPlace.TOKYO,Gender.MEN,32));
        personList.add(new Person("はしもと",BirthPlace.TOKYO,Gender.WOMEN,58));
        personList.add(new Person("さとう",BirthPlace.TOKYO,Gender.WOMEN,21));
        personList.add(new Person("かたおか",BirthPlace.TOKYO,Gender.WOMEN,26));
        personList.add(new Person("くすのき",BirthPlace.OSAKA,Gender.MEN,68));
        personList.add(new Person("やまざき",BirthPlace.OSAKA,Gender.MEN,81));
        personList.add(new Person("しげやま",BirthPlace.OSAKA,Gender.MEN,45));
        personList.add(new Person("にしかわ",BirthPlace.OSAKA,Gender.WOMEN,41));
        personList.add(new Person("かわしも",BirthPlace.OSAKA,Gender.WOMEN,25));
        personList.add(new Person("やがみ",BirthPlace.OSAKA,Gender.WOMEN,51));
        personList.add(new Person("かがわ",BirthPlace.OSAKA,Gender.WOMEN,39));
        personList.add(new Person("はやた",BirthPlace.FUKUOKA,Gender.MEN,33));
        personList.add(new Person("さの",BirthPlace.FUKUOKA,Gender.MEN,56));
        personList.add(new Person("てしがわら",BirthPlace.FUKUOKA,Gender.MEN,22));
        personList.add(new Person("ちの",BirthPlace.FUKUOKA,Gender.WOMEN,21));
        personList.add(new Person("かやざき",BirthPlace.FUKUOKA,Gender.WOMEN,43));
        personList.add(new Person("おかもと",BirthPlace.FUKUOKA,Gender.WOMEN,31));
        // map with list declaration
        Map<BirthPlace,List<Person>> personAreaMap = new HashMap<>();
        // add list to map
        // handle each person list object
        for (Person person:personList) {
                // containskey is false, add birthPlace and person list to map
            if (! personAreaMap.containsKey(person.getBirthPlace())) {
                List<Person> list = new ArrayList<>();
                list.add(person);
                personAreaMap.put(person.getBirthPlace(),list);
                // containskey is true, select containskey and add person list to containskey's list to map
            } else if (personAreaMap.containsKey(person.getBirthPlace())) {
                personAreaMap.get(person.getBirthPlace()).add(person);
                // if other error case, output error message
            } else {
                System.out.println("Error: マップのキーが不整合です。");
                break;
            }
        }
        int ageSum = 0;
        int ageSumMen = 0;
        int MenCountPerArea = 0;
        double ageAve = 0.0;
        double ageAveMen = 0.0;
        double ageAveWomen = 0.0;

        // Mapのエントリを取り出す。エントリはkeyの追加数になるので、今回の場合は地域の区分数になる。
        // つまり4が出てくる。これはkey:valueのペアの数であるため。
        // ここでvalueの要素数を取り出すなら、keyごとにvalueを取り出してListとして扱いそのリストサイズをとる必要がある。
        System.out.println("地域区分数: "+personAreaMap.entrySet().size());
        // 下記のようにkeyを指定することで、取り出した要素がリストになりそのリストの要素についての操作ができる。
        System.out.println("大阪の登録人数: "+personAreaMap.get(BirthPlace.OSAKA).size());

        for (Map.Entry entry:personAreaMap.entrySet()) {
            ageSum = 0;
            ageSumMen = 0;
            MenCountPerArea = 0;

            List<Person> extList = (List<Person>) entry.getValue();
            for (Person extobj:extList) {
                System.out.println(extobj);
                ageSum += extobj.getAge();
                if (extobj.getGender().equals(Gender.MEN)) {
                    ageSumMen += extobj.getAge();
                    MenCountPerArea++;
                }
            }
            ageAve = Math.round(10.0 * ageSum / (((List<Person>) entry.getValue()).size())) /10.0;
            System.out.println("地域名："+((BirthPlace) entry.getKey()).getName()+" 地域ごとの平均年齢："+ageAve);

            ageAveMen = Math.round(10.0 * ageSumMen / MenCountPerArea) / 10.0;
            ageAveWomen = Math.round(10.0 *
                    (ageSum - ageSumMen) / (((List<Person>) entry.getValue()).size() - MenCountPerArea))
                    / 10.0;

            System.out.println(
                    "地域名："+((BirthPlace) entry.getKey()).getName()+" 地域ごとの男性の平均年齢："+ageAveMen);
            System.out.println(
                    "地域名："+((BirthPlace) entry.getKey()).getName()+" 地域ごとの女性の平均年齢："+ageAveWomen);
        }

    }
}
