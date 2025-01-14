package basic.sample.equals;

import java.util.Objects;

class Employee2 {
    private int id;
    private String name;
    // constructor
    public Employee2(int id, String name) {
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

    // equalsのオーバーライド実装、subClassのクラスを自クラスと一致と判定する。
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // instanceof演算子でオブジェクトの等価性(オブジェクト自体が参照で同一のものを見ているか)を判定
        // instanceof演算子では継承で作成したsubClassもsuperClassと同一と判定するため、subClassを
        // 同一クラスと判定することを許容できるようになる
        if (!(o instanceof Employee2)) return false;
        // 判定対象オブジェクトを自クラスにキャストして形式を合わせる
        Employee2 employee2 = (Employee2) o;
        // 値を個別で判定して結果のbooleanをAND演算して結果出力
        return id == employee2.id && Objects.equals(name, employee2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
