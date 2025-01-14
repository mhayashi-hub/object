package basic.human5a;

abstract class Human implements IfSayHello, IfGetName {
    // class field
    protected String name;
    // constructor
    public Human(String name) {
        this.name = name;
    }
    // getter method
    @Override
    public String getName() {
        return name;
    }
}
