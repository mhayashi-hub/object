package basic.human5;

class Deutsch extends Human implements IfSayHello{
    public Deutsch(String name) {
        super(name);
    }
    //
    @Override
    public void sayHello() {
        System.out.println("Hallo, Ich bin "+name);
    }
}
