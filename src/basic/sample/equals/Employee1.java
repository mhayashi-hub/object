package basic.sample.equals;

import java.util.Objects;

class Employee1 {
    private int id;
    private String name;
    // constructor
    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //
    @Override
    public String toString() {
        return "Employee(" +
                "id= " + id +
                ", name= '" + name + '\'' + '}';
    }

    // equalsのオーバーライド実装、subClassのクラスを自クラスとは識別して不一致と判定する。
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // getClass()でクラス内で自分のクラスを取得しそれが判定対象オブジェクトの持つクラスと一致するかで厳密に判定
        if (o == null || getClass() != o.getClass()) return false;
        // 判定対象オブジェクトを自クラスにキャストして形式を合わせる
        Employee1 employee1 = (Employee1) o;
        // 値を個別で判定して結果のbooleanをAND演算して結果出力
        return id == employee1.id && Objects.equals(name, employee1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
