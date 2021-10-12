package basic.human5a;

class Japanese extends Human {
    public Japanese(String name) {
        super(name);
    }
    @Override
    public void sayHello() {
        System.out.println("こんにちは。わたしの名前は " + name + " です。");
    }
}
