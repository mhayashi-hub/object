package ex.human5a;

class English extends Human {
    public English(String name) {
        super(name);
    }
    //
    @Override
    public void sayHello() {
        System.out.println("Hello. I'm " + name);
    }
}