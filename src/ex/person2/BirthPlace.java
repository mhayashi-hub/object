package ex.person2;

public enum BirthPlace {
    HOKKAIDO("北海道"),
    TOKYO("東京"),
    OSAKA("大阪"),
    FUKUOKA("福岡");

    private String name;
    // constructor
    BirthPlace(String name) {
        this.name = name;
    }
    // getter
    public String getName() {
        return name;
    }
}
