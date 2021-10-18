package ex.human5;

import basic.human5.IfSayHello;

class French implements IfSayHello {
    private String name;

    public French(String name) {
        this.name = name;
    }

    //
    @Override
    public void sayHello () {
        System.out.println("Bonjour, Je m\'appelle "+ name);
    }
}
