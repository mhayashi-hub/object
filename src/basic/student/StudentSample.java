package basic.student;

class StudentSample {
    public static void main(String[] args) {
        Student student1 = new Student("Takayama","male",1);
        Student student2 = new Student("Kamioka", "female", 3);
        Student student4 = new Student("","",0);

        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(student1.getGender());
        System.out.println(student2.getGender());
        System.out.println(student1.getGrade());
        System.out.println(student2.getGrade());
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student4);

        student4.setName("Takeoka");
        student4.setGender("female");
        student4.setGrade(3);
        student2.setGrade(2);

        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(student1.getGender());
        System.out.println(student2.getGender());
        System.out.println(student1.getGrade());
        System.out.println(student2.getGrade());
        System.out.println(student1);
        System.out.println(student2);
        // System.out.println(student3);

        Student student3 = new Student("Kayama", "male", 2);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
    }
}
