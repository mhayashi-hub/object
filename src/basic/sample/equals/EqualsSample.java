package basic.sample.equals;

class EqualsSample {
    public static void main(String[] args) {
        // Employeeインスタンスで従業員を生成
        // employee1 Tomを生成、id 1
        Employee employee1 = new Employee(1,"Tom");
        // employee2はemployee1の単なる参照、参照先は同じオブジェクト、つまりオブジェクトが等価
        Employee employee2 = employee1;
        // employee3 Johnを生成、id 3、値が異なるオブジェクトなので等価にはならない
        Employee employee3 = new Employee(2,"John");
        // employee4 Tom id 1を生成、同じ値で同じクラスから生成するので同一オブジェクトになる？
        // 同じクラスで同じ値で生成すると同一オブジェクトになる？メモリ上に同じ値のオブジェクトを一つしか生成できない？
        Employee employee4 = new Employee(1,"Tom");
        // 同じクラスからコピーして別のクラスEmployee2を作成、値は同じでも同一にはならない？
        // クラスが別なので値が同じでも同一オブジェクトにならない？
        Employee2 employee21 = new Employee2(1,"Tom");

        // equalsメソッドで比較して結果出力
        System.out.println("1 2: " + employee1.equals(employee2));
        System.out.println("1 3: " + employee1.equals(employee3));
        System.out.println("1 4: " + employee1.equals(employee4));
        System.out.println("1 21: " + employee1.equals(employee21));
    }
}
