package localtest.mapInMap;

import basic.sample.enumsample.Gender;
import ex.person2.BirthPlace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ViewMemberInfo {
    public static void main(String[] args) {
        // generate List for Member
        List<MemberProperty> memberList = new ArrayList<>();
        memberList.add(new MemberProperty("かねだ", Gender.MEN, 25));
        memberList.add(new MemberProperty("はまたに", Gender.MEN, 42));
        memberList.add(new MemberProperty("やまだ", Gender.MEN, 32));
        memberList.add(new MemberProperty("ささもと", Gender.MEN, 35));
        memberList.add(new MemberProperty("ささき", Gender.WOMEN, 44));
        memberList.add(new MemberProperty("すずき", Gender.WOMEN, 29));
        memberList.add(new MemberProperty("しろた", Gender.MEN, 33));
        memberList.add(new MemberProperty("かわもと", Gender.WOMEN, 37));
        memberList.add(new MemberProperty("かまた", Gender.MEN, 22));
        memberList.add(new MemberProperty("さとう", Gender.WOMEN, 21));
        memberList.add(new MemberProperty("たかはし", Gender.MEN, 57));
        memberList.add(new MemberProperty("きたに", Gender.MEN, 41));
        memberList.add(new MemberProperty("なかの", Gender.WOMEN, 46));
        memberList.add(new MemberProperty("のだ", Gender.WOMEN, 61));
        memberList.add(new MemberProperty("ひらもと", Gender.MEN, 19));
        memberList.add(new MemberProperty("はざき", Gender.MEN, 28));
        memberList.add(new MemberProperty("すもと", Gender.WOMEN, 45));
        memberList.add(new MemberProperty("あかい", Gender.MEN, 35));
        memberList.add(new MemberProperty("きりや", Gender.MEN, 33));
        memberList.add(new MemberProperty("しぶや", Gender.WOMEN, 49));
        memberList.add(new MemberProperty("たまい", Gender.MEN, 50));
        memberList.add(new MemberProperty("さかい", Gender.WOMEN, 20));

        // member情報をMapにまとめる。
        // MapにListオブジェクトを入れる。Mapのためエントリ新設の場合puで追加。
        Map<String,List<Member>> memberListMap = new HashMap<>();
        for (Member member:memberList) {
            if (! memberListMap.containsKey(member.getName())) {
                List<Member> list = new ArrayList<> ();
                list.add(member);
                memberListMap.put(member.getName(),list);
            } else if (memberListMap.containsKey(member.getName())) {
                memberListMap.get(member.getName()).add(member);
            } else {
                System.out.println("Error : マップ処理に失敗しました。");
            }
        }

        List<MemberArea> memberAreaList = new ArrayList<>();
        memberAreaList.add(new MemberArea("かねだ", BirthPlace.TOKYO, CurrentPlace.TOKYO));
        memberAreaList.add(new MemberArea("はまたに", BirthPlace.HOKKAIDO, CurrentPlace.TOKYO));
        memberAreaList.add(new MemberArea("やまだ", BirthPlace.OSAKA, CurrentPlace.OSAKA));
        memberAreaList.add(new MemberArea("ささもと", BirthPlace.TOKYO, CurrentPlace.OSAKA));
        memberAreaList.add(new MemberArea("ささき", BirthPlace.TOKYO, CurrentPlace.HOKKAIDO));
        memberAreaList.add(new MemberArea("すずき", BirthPlace.TOKYO, CurrentPlace.FUKUOKA));
        memberAreaList.add(new MemberArea("しろた", BirthPlace.FUKUOKA, CurrentPlace.TOKYO));
        memberAreaList.add(new MemberArea("かわもと", BirthPlace.OSAKA, CurrentPlace.HOKKAIDO));
        memberAreaList.add(new MemberArea("かまた", BirthPlace.HOKKAIDO, CurrentPlace.OSAKA));
        memberAreaList.add(new MemberArea("さとう", BirthPlace.FUKUOKA, CurrentPlace.OSAKA));
        memberAreaList.add(new MemberArea("たかはし", BirthPlace.HOKKAIDO, CurrentPlace.HOKKAIDO));
        memberAreaList.add(new MemberArea("きたに", BirthPlace.HOKKAIDO, CurrentPlace.FUKUOKA));
        memberAreaList.add(new MemberArea("なかの", BirthPlace.FUKUOKA, CurrentPlace.FUKUOKA));
        memberAreaList.add(new MemberArea("のだ", BirthPlace.OSAKA, CurrentPlace.TOKYO));
        memberAreaList.add(new MemberArea("ひらもと", BirthPlace.HOKKAIDO, CurrentPlace.FUKUOKA));
        memberAreaList.add(new MemberArea("はざき", BirthPlace.OSAKA, CurrentPlace.TOKYO));
        memberAreaList.add(new MemberArea("すもと", BirthPlace.FUKUOKA, CurrentPlace.TOKYO));
        memberAreaList.add(new MemberArea("あかい", BirthPlace.OSAKA, CurrentPlace.TOKYO));
        memberAreaList.add(new MemberArea("きりや", BirthPlace.FUKUOKA, CurrentPlace.OSAKA));
        memberAreaList.add(new MemberArea("しぶや", BirthPlace.FUKUOKA, CurrentPlace.HOKKAIDO));
        memberAreaList.add(new MemberArea("たまい", BirthPlace.TOKYO, CurrentPlace.FUKUOKA));
        memberAreaList.add(new MemberArea("さかい", BirthPlace.OSAKA, CurrentPlace.HOKKAIDO));

        // Area情報をMapにまとめる
        Map<String,List<Member>> memberAreaListMap = new HashMap<>();
        for (Member memberArea:memberAreaList) {
            if (! memberAreaListMap.containsKey(memberArea.getName())) {
                List<Member> list = new ArrayList<> ();
                list.add(memberArea);
                memberAreaListMap.put(memberArea.getName(),list);
            } else if(memberAreaListMap.containsKey(memberArea.getName())) {
                memberAreaListMap.get(memberArea.getName()).add(memberArea);
            } else {
                System.out.println("Error : Mapへの追加に失敗しました。");
            }
        }

        List<MemberTestResult> memberTestList = new ArrayList<>();
        memberTestList.add(new MemberTestResult("かねだ", TestPeriod.P1, 65, 45, 68));
        memberTestList.add(new MemberTestResult("かねだ", TestPeriod.P2, 73, 52, 66));
        memberTestList.add(new MemberTestResult("かねだ", TestPeriod.P3, 81, 62, 72));
        memberTestList.add(new MemberTestResult("はまたに", TestPeriod.P1, 78, 90, 46));
        memberTestList.add(new MemberTestResult("はまたに", TestPeriod.P2, 89, 92, 66));
        memberTestList.add(new MemberTestResult("はまたに", TestPeriod.P4, 85, 91, 62));
        memberTestList.add(new MemberTestResult("やまだ", TestPeriod.P1, 46, 34, 22));
        memberTestList.add(new MemberTestResult("ささもと", TestPeriod.P1, 57, 55, 42));
        memberTestList.add(new MemberTestResult("ささき", TestPeriod.P1, 75, 68, 94));
        memberTestList.add(new MemberTestResult("ささき", TestPeriod.P2, 91, 70, 92));
        memberTestList.add(new MemberTestResult("すずき", TestPeriod.P1, 19, 60, 74));
        memberTestList.add(new MemberTestResult("すずき", TestPeriod.P4, 56, 64, 89));
        memberTestList.add(new MemberTestResult("しろた", TestPeriod.P1, 73, 80, 76));
        memberTestList.add(new MemberTestResult("かわもと", TestPeriod.P1, 68, 49, 35));
        memberTestList.add(new MemberTestResult("かまた", TestPeriod.P1, 62, 75, 89));
        memberTestList.add(new MemberTestResult("さとう", TestPeriod.P1, 81, 98, 100));
        memberTestList.add(new MemberTestResult("たかはし", TestPeriod.P1, 77, 64, 89));
        memberTestList.add(new MemberTestResult("きたに", TestPeriod.P1, 23, 56, 71));
        memberTestList.add(new MemberTestResult("なかの", TestPeriod.P1, 50, 52, 69));
        memberTestList.add(new MemberTestResult("のだ", TestPeriod.P1, 65, 78, 45));
        memberTestList.add(new MemberTestResult("ひらもと", TestPeriod.P1, 45, 60, 78));
        memberTestList.add(new MemberTestResult("はざき", TestPeriod.P1, 45, 50, 100));
        memberTestList.add(new MemberTestResult("すもと", TestPeriod.P1, 55, 67, 23));
        memberTestList.add(new MemberTestResult("あかい", TestPeriod.P1, 78, 77, 45));
        memberTestList.add(new MemberTestResult("きりや", TestPeriod.P1, 24, 57, 42));
        memberTestList.add(new MemberTestResult("しぶや", TestPeriod.P1, 79, 76, 88));
        memberTestList.add(new MemberTestResult("たまい", TestPeriod.P1, 58, 47, 92));
        memberTestList.add(new MemberTestResult("たまい", TestPeriod.P2, 65, 52, 90));
        memberTestList.add(new MemberTestResult("さかい", TestPeriod.P1, 20, 90, 56));
        memberTestList.add(new MemberTestResult("さかい", TestPeriod.P1, 48, 92, 64));

        // テスト結果のListをMapにまとめる
        Map<String,List<Member>> memberTestListMap = new HashMap<>();
        for (MemberTestResult memberTest:memberTestList) {
            if (! memberTestListMap.containsKey(memberTest.getName())) {
                List<Member> list = new ArrayList<> ();
                list.add(memberTest);
                memberTestListMap.put(memberTest.getName(),list);
            } else if (memberTestListMap.containsKey(memberTest.getName())) {
                memberTestListMap.get(memberTest.getName()).add(memberTest);
            } else {
                System.out.println("Error ; テスト特典情報のMapにテスト結果を追加できません。");
            }
        }

        // superClass MemberくくりでMapに各Mapの情報をまとめる。
        // Member型でmemberListMapの内容をmemberInfoMapに追加する。
        //  -> 企画倒れっぽい？
        //   ListをMapに入れるのは、個別のエントリに必要なだけList化して入れている。そのため、対象のエントリを
        //   MapからListオブジェクトにアクセスして取り出せる。ならばListオブジェクトのネストならいける？
        //   Mapの場合もオブジェクトとしてMapのValueに入れることは可能だが、上位階層のマップからは
        //   個別のkeyに結び付いたvalueとしてしか扱えない。いわばテーブルの管理テーブル的な使い方？
        //   テーブルを同値のkeyでまとめて検索しやすい形式にするのであればフラットなList構造をもった
        //   Map構造にした方がよさそうか？
        //   検索のやりやすさとしては、MapオブジェクトをMapのValueに入れた場合、個別にキーを持つことになる。
        //   上位のMapで持っているキーと下位のMapのキーを合わせる意味合いがあまりないのではないか？
        //   結びつきが分かればいいので、Map構造からvalueを引き出して書き込んだとしても、そのvalueを持つ
        //   部分に上位と同じキーを保持させる意味はあまりない。データの冗長という点と、マップのvalueのみを
        //   取得するならMapオブジェクトではなくListで十分役割を果たせそうな感じ。
        //   そもそもMapとしての全体オブジェクトを取得する方法はあるが、実はkey,valueのペアを一気にとってくる
        //   手法自体がJavaの標準の仕組みにはなさそう。keyはあらかじめ指定するので確かに必要性はないが、
        //   key:valueのペアをオブジェクトとして扱っていない、Mapの中の一要素＋keyとなるので、
        //   もともと扱わないのかもしれない。それともMap.entry(k,v)でとってくる？
        //   もう一つの問題として、Mapの場合valueに指定できるオブジェクト型が一つに統一される。
        //   そのため、valueにListもMapも同じネスト階層のオブジェクトとして書き込むことができない。
        //   書き込める型はMap宣言時点で決まるかワイルドカードで後で指定させるか？
        //   (普通のやり方では型チェックではじかれる。)
        // Map<String, Map<String,List<Member>>> memberInfoMap = new HashMap<>();
        Map<String,List<Map<String,List<Member>>>> memberInfoMap = new HashMap<>();
        for (String member: memberListMap.keySet()) {
            if (! memberInfoMap.containsKey(member)) {
                List<Map<String,List<Member>>> listInfo = new ArrayList<> ();
                listInfo.add((Map<String, List<Member>>) memberListMap.get(member));
                memberInfoMap.put(member, listInfo);
            } else if (memberInfoMap.containsKey(member)) {
                memberInfoMap.get(member).add((Map<String, List<Member>>) memberListMap.get(member));
            } else {
                System.out.println("Error : memberInfoMapに属性情報を追加できません。");
            }
        }
        for (String member:memberAreaListMap.keySet()) {
            if (! memberInfoMap.containsKey(member)) {
                List<Map<String,List<Member>>> listArea = new ArrayList<> ();
                listArea.add((Map<String, List<Member>>) memberAreaListMap.get(member));
                memberInfoMap.put(member, listArea);
            } else if (memberInfoMap.containsKey(member)) {
                memberInfoMap.get(member).add((Map<String, List<Member>>) memberAreaListMap.get(member));
            } else {
                System.out.println("Error : memberInfoMapに地域情報を追加できません。");
            }
        }
        for (String member:memberTestListMap.keySet()) {
            if (! memberInfoMap.containsKey(member)) {
                List<Map<String,List<Member>>> listTestResult = new ArrayList<> ();
                listTestResult.add((Map<String, List<Member>>) memberTestListMap.get(member));
                memberInfoMap.put(member, listTestResult);
            } else if (memberInfoMap.containsKey(member)) {
                memberInfoMap.get(member).add((Map<String, List<Member>>) memberTestListMap.get(member));
            } else {
                System.out.println("Error : memberInfoMapにテスト成績情報を追加できません。");
            }
        }
        /*
        //for (String member : memberListMap.keySet()) {
            if (!memberInfoMap.containsKey(member)) {
            //    System.out.println(memberListMap.get(member));
            //    memberInfoMap.put(member, new Map<String,List<Member>> (member, memberListMap.get(member)));
            //} else if () {
            //    memberInfoMap.get(member).;
            } else {
                System.out.println("Error : Mapに属性情報を追加できません。");
            }
        }
        /*
        // Member型でmemberAreaの内容をmemberInfoMapに追加する。
        for (MemberArea memberArea : memberAreaList) {
            if (!memberListMap.containsKey(memberArea.getName())) {
                List<Member> listArea = new ArrayList<>();
                listArea.add(memberArea);
                memberInfoMap.put(memberArea.getName(), listArea);
            } else if (memberListMap.containsKey(memberArea.getName())) {
                memberInfoMap.get(memberArea.getName()).add(memberArea);
            } else {
                System.out.println("Error : Mapに地域情報を追加できません。");
            }
        }

        // Member型になっているmemberListMapに、memberTestListMapの内容を追加したい。
        // keyはnameであわせて、Mapとしてまとめたテストの得点結果の内容をとってきて追加したい。
        // keyの値を取得する際にmemberListMapにあるかを判定する値を取得する際に、memberTestListMapから
        // 取得する必要があり、対象がMapなのでkeySetでkeyの塊を取得するようにした。
        for (String member : memberTestListMap.keySet()) {
            System.out.println(member);
            if (!memberListMap.containsKey(member)) {
                List<List<Member>> listTest = new ArrayList<> ();
                listTest.add(memberTestListMap.get(member));
                memberInfoMap.put(member,listTest);
            } else if (memberListMap.containsKey(member.getKey())) {
                memberInfoMap.get(member.getKey()).add(((List<List<Member>>) member.getValue()));
            } else {
                System.out.println("Error : Mapにテストの得点情報を追加できません。");
            }
        }

        // 共通キーnameを使って名前をkeyとしてvalueにListをさらにArrayListを作って書き込んでみた。
        // Valueで帰ってくるオブジェクトはArrayListなのは確認済み。
        // List内部のListの値をどうやって取得、検索、操作するのかを確認したい。

        // confirm contents of List
        /*
        for (MemberProperty member:memberList) {
            System.out.println(member);
        }
        for (MemberArea memberArea:memberAreaList) {
            System.out.println(memberArea);
        }
        for (MemberTestResult testResult:memberTestList) {
            System.out.println(testResult);
        }
         */
        // int i;
        for (Map.Entry entry : memberInfoMap.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            for (Member element : ((List<Member>) entry.getValue())) {
                System.out.println(element.getInfo());
                /*
                for (i=0;i <= ((List<MemberTestResult>) element).size()-1;i++){
                    if (((List<MemberTestResult>) element).get(i).getTestPeriod().equals(TestPeriod.P2)) {
                        System.out.println(((List<MemberTestResult>) element).get(i).getInfo());
                    } else {
                        System.out.println("テスト期間："+TestPeriod.P2.getJpName()+"の成績はありません。");
                    }
                }
                 */
            }
            System.out.println("");
        }


        /*
        for (Map.Entry entry : memberListMap.entrySet()) {
            String.format("%s ", entry.getKey());
            String.format("%s\n", entry);
        }
        */


        /*
        for (Map.Entry entry:memberTestListMap.entrySet()) {
            System.out.println(entry);
        }
        for (Map.Entry entry:memberAreaListMap.entrySet()) {
            System.out.println(entry);
        }
        */
    }
}

