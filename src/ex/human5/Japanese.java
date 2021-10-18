package ex.human5;

import basic.human5.IfSayHello;

class Japanese implements IfSayHello {
    private String name;

    public Japanese(String name) {
        this.name = name;
    }

    //
    @Override
    public void sayHello() {
        System.out.println("こんにちは。わたしの名前は "+name+" です。");
    }
}
