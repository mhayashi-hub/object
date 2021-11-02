package localtest.throwSample;

class ThrowErrorSample {
    static void runThrowSample() {
        int i = 5;
        String nullerrMessage = "NullpointerException occured, Error.";
        if (i == 5) {
            throw new NullPointerException(nullerrMessage);
        }
    }
}
