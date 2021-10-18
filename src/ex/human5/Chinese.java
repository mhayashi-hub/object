package ex.human5;


import basic.human5.IfSayHello;

class Chinese implements IfSayHello {
    private String name;

    public Chinese(String name) {
        this.name = name;
    }

    //
    @Override
    public void sayHello() {
        System.out.println("你好, 我叫 " + name);
    }
}
