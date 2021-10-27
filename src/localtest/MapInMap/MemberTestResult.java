package localtest.MapInMap;

class MemberTestResult {
    private String name;
    private TestPeriod testPeriod;
    private int jap;
    private int math;
    private int eng;

    public MemberTestResult(String name, TestPeriod testPeriod, int jap, int math, int eng) {
        this.name = name;
        this.testPeriod = testPeriod;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }

    public String getName() {
        return name;
    }

    public TestPeriod getTestPeriod() {
        return testPeriod;
    }

    public int getJap() {
        return jap;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }
}
