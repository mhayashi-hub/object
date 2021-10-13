package ex.student1;

public class StudentSample {
    public static void main(String[] args) {
        Student[] students = {
                new Student("あいざわ", "男", 60, 50, 70),
                new Student("いのうえ", "女", 90, 80, 100),
                new Student("うえの", "男", 40, 50, 60),
                new Student("えんどう", "女", 80, 20, 60),
                new Student("おおた", "男", 70, 100, 40)
        };
        /*
        for (Student student:students) {
            System.out.println(student);
        }
         */
        for (Student student:students) {
            System.out.println(student.q1Answer());
        }
        System.out.println("");

        for (Student student:students) {
            System.out.println(student.q2Answer());
        }
        System.out.println("");

        for (Student student:students) {
            System.out.println(student.q3Answer());
        }
        System.out.println("");

        int i = 0;
        double japsum = 0.00, mathsum = 0.00, engsum =0.00;
        for (Student student:students) {
            japsum += student.getJap();
            mathsum += student.getMath();
            engsum += student.getEng();
            i++;
        }
        double japave = Math.round(japsum * 100.00) / i /100.00;
        double mathave = Math.round(mathsum * 100.00) / i /100.00;
        double engave = Math.round(engsum * 100.00) / i / 100.00;
        System.out.println("クラス平均点：国語 "+japave+" 数学 "+mathave+" 英語 "+engave);
        int j = 2;
        System.out.println(students[j].getName()+":合計点 "+ students[j].sum()+" 平均点 "+ students[j].ave());
    }
}
