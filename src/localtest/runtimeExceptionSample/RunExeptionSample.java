package localtest.runtimeExceptionSample;

class RunExeptionSample {
    public static void main(String[] args) {
        try {
            RuntimeExceptionSample.runSample();
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finallyブロックの実行");
        }
    }
}
