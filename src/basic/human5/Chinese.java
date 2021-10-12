package basic.human5;

class Chinese extends Human implements IfSayHello {
    public Chinese(String name) {
        super(name);
    }
    //
    @Override
    public void sayHello() {
        System.out.println("你好, 我叫 " + name);
    }
}
