package localtest.mapInListInMap;

public class Member implements IfGetInfo {
    protected String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getInfo () {
        return String.format("%s ", name);
    }
}
