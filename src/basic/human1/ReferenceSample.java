package basic.human1;

class ReferenceSample {
    public static void main(String[] args) {
        Human human1 = new Human("Tom",28);
        Human human2 = human1; // pointer copy only(value changed and reflected from human1 change)
        Human human3 = new Human(human1); // new copied(created) object with human1 current value

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        human1.setName("john");
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        human3.setName("Ken");
        human2.setAge(24);
        human1.setName("Paul");
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

    }
}
