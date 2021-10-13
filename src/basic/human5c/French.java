package basic.human5c;

class French extends Human implements IfSayHello {
    public French(String name) {
        super(name);
    }
    @Override
    public void sayHello () {
        System.out.println("Bonjour, Je m\'appelle "+ name);
    }
}
