package basic.sample.equals;

class EqualsSample {
    public static void main(String[] args) {
        // Employeeインスタンスで従業員を生成
        // employee1 Tomを生成、id 1
        Employee1 employee1 = new Employee1(1,"Tom");
        // employee2はemployee1の単なる参照、参照先は同じオブジェクト、つまりオブジェクトが等価
        Employee1 employee12 = employee1;
        // employee3 Johnを生成、id 3、値が異なるオブジェクトなので等価にはならない
        Employee1 employee13 = new Employee1(2,"John");
        // employee4 Tom id 1を生成、同じ値で同じクラスから生成するので同一オブジェクトになる？
        // 同じクラスで同じ値で生成すると同一オブジェクトになる？メモリ上に同じ値のオブジェクトを一つしか生成できない？
        //  その場合はhashCodeが一致して同じとシステム判定され、オブジェクトを別途作成しない。つまり参照になる。
        //  hashcodeが一致する場合、hashTableで管理する場合に同一オブジェクトを複数格納することはないらしい。
        Employee1 employee14 = new Employee1(1,"Tom");
        // 同じクラスからコピーして別のクラスEmployee2を作成、値は同じでも同一にはならない？
        // クラスが別なので値が同じでも同一オブジェクトにならない？
        Employee2 employee21 = new Employee2(1,"Tom");
        // Employee2から派生させたsubClassでオブジェクト作成
        Employee3 employee31 = new Employee3(1, "Tom");
        Employee3 employee32 = new Employee3(2, "John");

        // equalsメソッドで比較して結果出力
        System.out.println("同一のオブジェクト 1 2 の比較: " + employee1.equals(employee12));
        System.out.println("同一クラス起源だが値が異なる 1 3 の比較: " + employee1.equals(employee13));
        System.out.println("同一クラスで値も同一オブジェクト 1 4 の比較: " + employee1.equals(employee14));
        System.out.println("クラスの異なるオブジェクト 1 21 の比較: " + employee1.equals(employee21));

        System.out.println("サブクラスで値が同じ 21 31 の比較:" + employee21.equals(employee31));
        System.out.println("サブクラスで値が異なる 21 32 の比較:" + employee21.equals(employee32));
    }
}
