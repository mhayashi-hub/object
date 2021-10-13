package basic.human5c;

class Japanese extends Human implements IfSayHello {
    public Japanese(String name) {
        super(name);
    }
    @Override
    public void sayHello() {
        System.out.println("こんにちは。わたしの名前は " + name + " です。");
    }
}
