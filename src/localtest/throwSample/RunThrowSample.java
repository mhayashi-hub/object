package localtest.throwSample;

class RunThrowSample {
    public static void main(String[] args) {
        try {
            ThrowErrorSample.runThrowSample();
        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
