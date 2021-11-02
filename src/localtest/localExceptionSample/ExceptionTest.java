package localtest.localExceptionSample;

class ExceptionTest {
    public static void main(String[] args) {
        ExceptionCauseSample sample = new ExceptionCauseSample();
        try {
            sample.runExceptionCause();
        } catch (LocalException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
