package basic.human3;

class Human {
    // class field
    protected String name;
    // constructor
    public Human(String name) {
        this.name = name;
    }
    //
    public void sayHello() {
        System.out.println("Hello. I'm " + name);
    }
}
