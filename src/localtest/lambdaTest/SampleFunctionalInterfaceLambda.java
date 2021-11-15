package localtest.lambdaTest;

import java.util.function.Function;

class SampleFunctionalInterfaceLambda {
    public static void main(String[] args) {
        Function<String,String> c1 = (String a) -> {return a +" です。";};
        System.out.println(c1.apply("赤"));
    }
}
