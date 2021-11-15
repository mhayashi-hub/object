package localtest.lambdaTest;

@FunctionalInterface
interface Color1 {
    String write1(String a);
}

class SampleClass {
    public static void main(String[] args) {
        Color1 c1 = new Color1() {
            @Override
            public String write1() {
                
            }
        }
    }
}
