package basic.human5;

class English extends Human implements IfSayHello {
    public English(String name) {
        super(name);
    }
    //
    @Override
    public void sayHello() {
        System.out.println("Hello. I'm " + name);
    }
}
