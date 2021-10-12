package basic.human4;

class Deutsch extends Human {
    public Deutsch(String name) {
        super(name);
    }
    @Override
    public void sayHello() {
        System.out.println("Hallo, Ich bin "+name);
    }
}
