package ex.bmi;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.List;

class ViewMember {
    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member("やまだ",Gender.MEN,28,1.734,78.2));
        memberList.add(new Member("あきやま",Gender.WOMEN,18,1.533,46.2));
        memberList.add(new Member("かまた",Gender.WOMEN,36,1.648,49.8));
        memberList.add(new Member("なかの",Gender.MEN,56,1.616,62.1));
        memberList.add(new Member("おおた",Gender.MEN,33,1.822,89.2));
        memberList.add(new Member("はまなか",Gender.MEN,46,1.611,92.5));

        for (Member member:memberList) {
            System.out.println(member);
        }
    }
}
