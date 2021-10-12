package basic.human5;

class French extends Human implements IfSayHello {
    public French(String name) {
        super(name);
    }
    //
    @Override
    public void sayHello () {
        System.out.println("Bonjour, Je m\'appelle "+ name);
    }
}
