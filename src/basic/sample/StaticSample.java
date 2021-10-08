package basic.sample;

class StaticSample {
    // example of static methods

    /**
     *
     * @param x first integer
     * @param y second integer
     * @return add result
     */
    static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(StaticSample.add(10, 22));
        int ans = add(100, 54);
        System.out.println(ans);
    }
}
