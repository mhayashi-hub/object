package ex.human5;

import basic.human5.IfSayHello;

class Deutsch implements IfSayHello {
    private String name;

    public Deutsch(String name) {
        this.name = name;
    }

    //
    @Override
    public void sayHello() {
        System.out.println("Hallo, Ich bin "+name);
    }
}
