package basic.human5c;

class English extends Human implements IfSayHello {
    public English(String name) {
        super(name);
    }
    @Override
    public void sayHello() {
        System.out.println("Hello. I'm " + name);
    }
}
