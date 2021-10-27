package localtest.MapInMap;

import basic.sample.enumsample.Gender;
import ex.person2.BirthPlace;

import java.util.ArrayList;
import java.util.List;

class ViewMemberInfo {
    public static void main(String[] args) {
    // generate List for Member
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member("かねだ", Gender.MEN,25));
        memberList.add(new Member("はまたに", Gender.MEN,42));
        memberList.add(new Member("やまだ", Gender.MEN,32));
        memberList.add(new Member("ささもと", Gender.MEN,35));
        memberList.add(new Member("ささき", Gender.WOMEN,44));
        memberList.add(new Member("すずき", Gender.WOMEN,29));
        memberList.add(new Member("しろた", Gender.MEN,33));
        memberList.add(new Member("かわもと", Gender.WOMEN,37));
        memberList.add(new Member("かまた", Gender.MEN,22));
        memberList.add(new Member("さとう", Gender.WOMEN,21));
        memberList.add(new Member("たかはし", Gender.MEN,57));
        memberList.add(new Member("きたに", Gender.MEN,41));
        memberList.add(new Member("なかの", Gender.WOMEN,46));
        memberList.add(new Member("のだ", Gender.WOMEN,61));
        memberList.add(new Member("ひらもと", Gender.MEN,19));
        memberList.add(new Member("はざき", Gender.MEN,28));
        memberList.add(new Member("すもと", Gender.WOMEN,45));
        memberList.add(new Member("あかい", Gender.MEN,35));
        memberList.add(new Member("きりや", Gender.MEN,33));
        memberList.add(new Member("しぶや", Gender.WOMEN,49));
        memberList.add(new Member("たまい", Gender.MEN,50));
        memberList.add(new Member("さかい", Gender.WOMEN,20));

        List<MemberArea> memberAreaList = new ArrayList<> ();
        memberAreaList.add(new MemberArea("かねだ", BirthPlace.TOKYO,CurrentPlace.TOKYO));
        memberAreaList.add(new MemberArea("はまたに", BirthPlace.HOKKAIDO,CurrentPlace.TOKYO));
        memberAreaList.add(new MemberArea("やまだ", BirthPlace.OSAKA,CurrentPlace.OSAKA));
        memberAreaList.add(new MemberArea("ささもと", BirthPlace.TOKYO,CurrentPlace.OSAKA));
        memberAreaList.add(new MemberArea("ささき", BirthPlace.TOKYO,CurrentPlace.HOKKAIDO));
        memberAreaList.add(new MemberArea("すずき", BirthPlace.TOKYO,CurrentPlace.FUKUOKA));
        memberAreaList.add(new MemberArea("しろた", BirthPlace.FUKUOKA,CurrentPlace.TOKYO));
        memberAreaList.add(new MemberArea("かわもと", BirthPlace.OSAKA,CurrentPlace.HOKKAIDO));
        memberAreaList.add(new MemberArea("かまた", BirthPlace.HOKKAIDO,CurrentPlace.OSAKA));
        memberAreaList.add(new MemberArea("さとう", BirthPlace.FUKUOKA,CurrentPlace.OSAKA));
        memberAreaList.add(new MemberArea("たかはし", BirthPlace.HOKKAIDO,CurrentPlace.HOKKAIDO));
        memberAreaList.add(new MemberArea("きたに", BirthPlace.HOKKAIDO,CurrentPlace.FUKUOKA));
        memberAreaList.add(new MemberArea("なかの", BirthPlace.FUKUOKA,CurrentPlace.FUKUOKA));
        memberAreaList.add(new MemberArea("のだ", BirthPlace.OSAKA,CurrentPlace.TOKYO));
        memberAreaList.add(new MemberArea("ひらもと", BirthPlace.HOKKAIDO,CurrentPlace.FUKUOKA));
        memberAreaList.add(new MemberArea("はざき", BirthPlace.OSAKA,CurrentPlace.TOKYO));
        memberAreaList.add(new MemberArea("すもと", BirthPlace.FUKUOKA,CurrentPlace.TOKYO));
        memberAreaList.add(new MemberArea("あかい", BirthPlace.OSAKA,CurrentPlace.TOKYO));
        memberAreaList.add(new MemberArea("きりや", BirthPlace.FUKUOKA,CurrentPlace.OSAKA));
        memberAreaList.add(new MemberArea("しぶや", BirthPlace.FUKUOKA,CurrentPlace.HOKKAIDO));
        memberAreaList.add(new MemberArea("たまい", BirthPlace.TOKYO,CurrentPlace.FUKUOKA));
        memberAreaList.add(new MemberArea("さかい", BirthPlace.OSAKA,CurrentPlace.HOKKAIDO));

        List<MemberTestResult> memberTestList = new ArrayList<> ();
        memberTestList.add(new MemberTestResult("かねだ", TestPeriod.P1,65,45,68));
        memberTestList.add(new MemberTestResult("はまたに", TestPeriod.P1,78,90,46));
        memberTestList.add(new MemberTestResult("やまだ", TestPeriod.P1,46,34,22));
        memberTestList.add(new MemberTestResult("ささもと", TestPeriod.P1,57,55,42));
        memberTestList.add(new MemberTestResult("ささき", TestPeriod.P1,75,68,94));
        memberTestList.add(new MemberTestResult("すずき", TestPeriod.P1,19,60,74);
        memberTestList.add(new MemberTestResult("しろた", TestPeriod.P1,73,80,76));
        memberTestList.add(new MemberTestResult("かわもと", TestPeriod.P1,68,49,35));
        memberTestList.add(new MemberTestResult("かまた", Gender.MEN,22));
        memberTestList.add(new MemberTestResult("さとう", Gender.WOMEN,21));
        memberTestList.add(new MemberTestResult("たかはし", Gender.MEN,57));
        memberTestList.add(new MemberTestResult("きたに", Gender.MEN,41));
        memberTestList.add(new MemberTestResult("なかの", Gender.WOMEN,46));
        memberTestList.add(new MemberTestResult("のだ", Gender.WOMEN,61));
        memberTestList.add(new MemberTestResult("ひらもと", Gender.MEN,19));
        memberTestList.add(new MemberTestResult("はざき", Gender.MEN,28));
        memberTestList.add(new MemberTestResult("すもと", Gender.WOMEN,45));
        memberTestList.add(new MemberTestResult("あかい", Gender.MEN,35));
        memberTestList.add(new MemberTestResult("きりや", TestPeriod.P1,33));
        memberTestList.add(new MemberTestResult("しぶや", TestPeriod.P1,49));
        memberTestList.add(new MemberTestResult("たまい", TestPeriod.P1,50));
        memberTestList.add(new MemberTestResult("さかい", TestPeriod.P1,20));

        for (Member member:memberList) {
            System.out.println(member);
        }

        for (MemberArea memberArea:memberAreaList) {
            System.out.println(memberArea);
        }
    }
}
