package basic.human5c;

abstract class Human implements IfGetName, IfSayHello {
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
