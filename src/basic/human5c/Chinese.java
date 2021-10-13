package basic.human5c;

class Chinese extends Human implements IfSayHello {
    public Chinese(String name) {
        super(name);
    }
    @Override
    public void sayHello() {
        System.out.println("你好, 我叫 " + name);
    }
}
