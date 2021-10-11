package basic.human3;

class French extends Human{
    public French(String name) {
        super(name);
    }
    @Override
    public void sayHello () {
        System.out.println("Bonjour, Je m\'appelle "+ name);
    }
}
