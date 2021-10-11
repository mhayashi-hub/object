package basic.human3a;

abstract class Human {
    // class field
    protected String name;
    // constructor
    public Human(String name) {
        this.name = name;
    }
    //
    abstract void sayHello();
}
