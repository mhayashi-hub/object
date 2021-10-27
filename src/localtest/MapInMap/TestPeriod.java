package localtest.MapInMap;

public enum TestPeriod {
    P1("一期"),
    P2("二期"),
    P3("三期"),
    P4("四期");

    private String jpName;

    TestPeriod(String jpName) {
        this.jpName = jpName;
    }

    public String getJpName() {
        return jpName;
    }
}
