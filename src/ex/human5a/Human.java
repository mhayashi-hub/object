package ex.human5a;

abstract class Human implements IfSayHello {
    // class field
    protected String name;
    // constructor
    public Human(String name) {
        this.name = name;
    }
}
