package basic.human5a;

class Deutsch extends Human {
    public Deutsch(String name) {
        super(name);
    }
    @Override
    public void sayHello() {
        System.out.println("Hallo, Ich bin "+name);
    }
}
