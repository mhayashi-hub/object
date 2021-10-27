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
        /*
        // member情報をMapにまとめる。
        Map<String,List<MemberProperty>> memberListMap = new HashMap<>();
        for (MemberProperty member:memberList) {
            if (! memberListMap.containsKey(member.getName())) {
                List<MemberProperty> list = new ArrayList<> ();
                list.add(member);
                memberListMap.put(member.getName(),list);
            } else if (memberListMap.containsKey(member.getName())) {
                memberListMap.get(member.getName()).add(member);
            } else {
                System.out.println("Error : マップ処理に失敗しました。");
            }
        }
        */
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
        /*
        // Area情報をマップにまとめる
        Map<String,List<MemberArea>> memberAreaListMap = new HashMap<>();
        for (MemberArea memberArea:memberAreaList) {
            if (! memberAreaListMap.containsKey(memberArea.getName())) {
                List<MemberArea> list = new ArrayList<> ();
                list.add(memberArea);
                memberAreaListMap.put(memberArea.getName(),list);
            } else if(memberAreaListMap.containsKey(memberArea.getName())) {
                memberAreaListMap.get(memberArea.getName()).add(memberArea);
            } else {
                System.out.println("Error : Mapへの追加に失敗しました。");
            }
        }
        */

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
        memberTestList.add(new MemberTestResult("すずき", TestPeriod.P1, 19, 60, 74));
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
        memberTestList.add(new MemberTestResult("さかい", TestPeriod.P1, 20, 90, 56));
        /*
        // テスト結果のリストをマップにまとめる
        Map<String,List<MemberTestResult>> memberTestListMap = new HashMap<>();
        for (MemberTestResult member:memberTestList) {
            if (! memberTestListMap.containsKey(member.getName())) {
                List<MemberTestResult> list = new ArrayList<> ();
                list.add(member);
                memberTestListMap.put(member.getName(),list);
            } else if (memberTestListMap.containsKey(member.getName())) {
                memberTestListMap.get(member.getName()).add(member);
            } else {
                System.out.println("Error ; Mapに追加できません。");
            }
        }
        */
        // superClass MemberくくりでMapにListの情報をまとめる。
        Map<String, List<Member>> memberListMap = new HashMap<>();
        for (MemberProperty member : memberList) {
            if (!memberListMap.containsKey(member.getName())) {
                List<Member> list = new ArrayList<>();
                list.add(member);
                memberListMap.put(member.getName(), list);
            } else if (memberListMap.containsKey(member.getName())) {
                memberListMap.get(member.getName()).add(member);
            } else {
                System.out.println("Error : Mapに属性情報を追加できません。");
            }
        }
        for (MemberArea memberArea : memberAreaList) {
            if (!memberListMap.containsKey(memberArea.getName())) {
                List<Member> listArea = new ArrayList<>();
                listArea.add(memberArea);
                memberListMap.put(memberArea.getName(), listArea);
            } else if (memberListMap.containsKey(memberArea.getName())) {
                memberListMap.get(memberArea.getName()).add(memberArea);
            } else {
                System.out.println("Error : Mapに地域情報を追加できません。");
            }
        }
        for (MemberTestResult memberScore : memberTestList) {
            if (!memberListMap.containsKey(memberScore.getName())) {
                List<Member> listScore = new ArrayList<>();
                listScore.add(memberScore);
                memberListMap.put(memberScore.getName(), listScore);
            } else if (memberListMap.containsKey(memberScore.getName())) {
                memberListMap.get(memberScore.getName()).add(memberScore);
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
        int i;
        for (Map.Entry entry : memberListMap.entrySet()) {
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

