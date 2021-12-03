package ex.exception;

class ExceptionTest {
    public static void main(String[] args) {
        try {
            ExceptionThrows.printValue();
        } catch (Exception er) {
            er.printStackTrace();
        }
    }
}
