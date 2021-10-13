package basic.human5b;

abstract class Human implements IfSayHello {
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
