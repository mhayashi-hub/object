package basic.human5c;

class Deutsch extends Human implements IfSayHello {
    public Deutsch(String name) {
        super(name);
    }
    @Override
    public void sayHello() {
        System.out.println("Hallo, Ich bin "+name);
    }
}
