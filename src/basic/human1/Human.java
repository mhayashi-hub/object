package basic.human1;

//データとしてのクラス宣言
class Human {
    //フィールドの宣言
    private String name;
    private int age;

    //コンストラクタ
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // コンストラクタのオーバーロード
    // Human型のオブジェクトを流用して新たにオブジェクトを作成するコンストラクタ
    public Human(Human human) {
        this.name = human.name;
        this.age = human.age;
    }

    //アクセサ（ゲッター）
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //アクセサ（セッター）
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //toStringメソッド
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
