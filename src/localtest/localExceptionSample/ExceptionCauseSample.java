package localtest.localExceptionSample;

class ExceptionCauseSample {
    void runExceptionCause() throws LocalException {
        int i = 5;
        if (i == 5) {
            throw new LocalException("locally defineded Exception.");
        }
    }
}
