package localtest.MapInMap;

import ex.person2.BirthPlace;

class MemberArea {
    private String name;
    private BirthPlace birthPlace;
    private CurrentPlace currentPlace;

    public MemberArea(String name, BirthPlace birthPlace, CurrentPlace currentPlace) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.currentPlace = currentPlace;
    }

    public String getName() {
        return name;
    }

    public BirthPlace getBirthPlace() {
        return birthPlace;
    }

    public CurrentPlace getCurrentPlace() {
        return currentPlace;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", name,birthPlace.getName(),currentPlace.getAreaName());
    }

}
