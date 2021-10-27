package localtest.MapInMap;

import ex.person2.BirthPlace;

class MemberArea extends Member {
    private BirthPlace birthPlace;
    private CurrentPlace currentPlace;

    public MemberArea(String name, BirthPlace birthPlace, CurrentPlace currentPlace) {
        super(name);
        this.birthPlace = birthPlace;
        this.currentPlace = currentPlace;
    }

    public BirthPlace getBirthPlace() {
        return birthPlace;
    }

    public CurrentPlace getCurrentPlace() {
        return currentPlace;
    }

    @Override
    public String toString() {
        return String.format("%s 出身：%s 所在地：%s", name,birthPlace.getName(),currentPlace.getAreaName());
    }

    @Override
    public String getInfo() {
        return String.format(" 出身：%s 所在地：%s", birthPlace.getName(),currentPlace.getAreaName());
    }
}
