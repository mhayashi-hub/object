package localtest.lambdaTest;

class SampleClass {
    public static void main(String[] args) {
        Color1 c1 = new Color1() {
            @Override
            public String write1(String a) {
                return a +" です。";
            }
        };
        System.out.println(c1.write1("青"));
    }
}
