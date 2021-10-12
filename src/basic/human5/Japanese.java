package basic.human5;

class Japanese extends Human implements IfSayHello {
    public Japanese(String name) {
            super(name);
    }
    //
    @Override
    public void sayHello() {
        System.out.println("こんにちは。わたしの名前は "+name+" です。");
    }
}
