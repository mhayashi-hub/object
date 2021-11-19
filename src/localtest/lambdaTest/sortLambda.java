package localtest.lambdaTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class sortLambda {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Murata", 100));
        studentList.add(new Student("Okada", 70));
        studentList.add(new Student("Tanimoto", 80));
        studentList.add(new Student("Tabata", 55));

        System.out.println(studentList);
        // streamで書き直してみる。これはStreamにしてその中でソートして出力まで終わらせて閉じるので、元のリストは変更しない。
        studentList.stream().sorted(Comparator.comparing(Student::getScore)).forEach(System.out::println);
        // studentListの中身再確認。
        System.out.println(studentList);
        /*
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
           public int compare(Student student1, Student student2) {
                return Integer.compare(student1.getScore(), student2.getScore());
            }
        });
         */
        // lambdaで上記のOverride部分を->で入力とreturnで書く出力をつなげて書くことで@Overrideで書かなくてもよくなる。
        // @Overrideを書かずに済むのは関数型インターフェースの部分をlambda式に書き直しているため。
        // そのため、lambda式で書けるのは関数型インターフェースの処理だけになる。
        // lambda式で処理が一つしかない場合はreturnは省略可能、複数の処理を描く場合は->の後に{}でくくって複数行の処理を
        // セミコロンでステートメント終了を指定しつつ、最後にreturnでその処理を通しての結果を出力する処理を書く必要がある。
        Collections.sort(studentList, (student1, student2) -> Integer.compare(student1.getScore(), student2.getScore()));
        System.out.println(studentList);
        // また、lambda式ではメソッドの中身の処理の型と、別途呼び出すメソッドの型が一致していれば、メソッド実行の中で
        // メソッドを呼び出して処理結果を実行メソッドに渡して処理させるようにもできる。
        // 例：list.forEach(System.out::println);
        // 　　の処理を
        // list.forEach(str -> System.out.println(str));と書くことができる。
        // streamと違ってリストを書き直しているので結果はリスト側に再度保管される。
    }
}

