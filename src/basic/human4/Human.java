package basic.human4;

abstract class Human {
    // class field
    protected String name;
    // constructor
    public Human(String name) {
        this.name = name;
    }
    //
    public abstract void sayHello();
}
