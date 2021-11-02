package localtest.mapInListInMap;

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

        //  当初の仕様想定と実際に実装してみた構造が異なる？ 一度設計仕様を再検証した方が良いかも？
        //  各人のテスト結果のまとめで作りたい構造、特性はなにか？
        //  -> 名前をキーにすること、各人ごとにテスト期間をキーとして成績を取り出せること。それだけでよい。
        //     つまりは検索のキーとして使えるものに各人名前＋テスト期間の組み合わせで検索できれば良い。
        //     -> 検索だけなら、各人の成績でcontainsで対象期間の有無をチェックし、対象期間の見つかった位置から
        //        indexOfで4値(Period、国語、数学、英語)を取り出せば終わるか？
        //  -> 整理結果：TestPeriodで分けたマップを作る必要性は薄い。テスト期間と成績をセットで並べてリストに格納して、
        //     indexOfでテスト期間を検索させ、そこから4個のデータを取得するので結果をテスト期間ごとに取り出せる。
        //     オブジェクトインスタンスごと取り出すかキャストすることでクラスメソッドで個別成績を取得するのも可能。

        //  データをまとめるマップを準備
        Map <String, List<Member>> memberInfoMap = new HashMap<> ();

        // memberListの情報を追加
        for (Member member:memberList) {
            if (! memberInfoMap.containsKey(member.getName())) {
                List<Member> list = new ArrayList<> ();
                list.add(member);
                memberInfoMap.put(member.getName(), list);
            } else if (memberInfoMap.containsKey(member.getName())) {
                memberInfoMap.get(member.getName()).add(member);
            } else {
                System.out.println("Error : メンバー情報の追加できませんでした。");
            }
        }
        // memberAreaListの情報を追加
        for (Member memberArea:memberAreaList) {
            if (! memberInfoMap.containsKey(memberArea.getName())) {
                List<Member> listArea = new ArrayList<> ();
                listArea.add(memberArea);
                memberInfoMap.put(memberArea.getName(), listArea);
            } else if (memberInfoMap.containsKey(memberArea.getName())) {
                memberInfoMap.get(memberArea.getName()).add(memberArea);
            } else {
                System.out.println("Error : メンバーの地域情報の追加ができませんでした。");
            }
        }
        // memberTestListの情報を追加
        for (Member memberTest:memberTestList) {
            if (! memberInfoMap.containsKey(memberTest.getName())) {
                List<Member> listTest = new ArrayList<> ();
                listTest.add(memberTest);
                memberInfoMap.put(memberTest.getName(), listTest);
            } else if (memberInfoMap.containsKey(memberTest.getName())) {
                memberInfoMap.get(memberTest.getName()).add(memberTest);
            } else {
                System.out.println("Error : メンバーの成績情報の追加ができませんでした。");
            }
        }
        // 出力テスト
        // System.out.println(memberInfoMap);
        for (String member:memberInfoMap.keySet()) {
            System.out.println(member+": ");
            for (Member memberContent:memberInfoMap.get(member)) {
                System.out.println(" " + (memberContent.getInfo()));
            }
        }
        // 処理パターンメモ：
        // 性別で分類してデータをまとめる。
        // 出身地、所在地で聞る指定データをまとめる。
        // テスト時期でデータをまとめる。テスト時期ごとでの点数の合計、個人の平均点、科目ごと平均点を出す。
        // テスト時期を通しての平均点を科目ごとに出す。

    }
}

