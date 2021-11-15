package localtest.lambdaTest;

class SampleLambda {
    public static void main(String[] args) {
        // Color2 c2 = (String a) -> {return a +" です。";};
        // 関数型インターフェースを使用する場合、入力と結果の型は一致するので型指定を省略可能。
        // なので()内部の記述はメソッド内の変数名のみにできる。
        // Color2 c2 = (a) -> {return a +" です。";};
        // さらに引数が一つのみの場合、()自体を省略して書ける。
        // Color2 c2 = a -> {return a +" です。";};
        // さらに、{}とreturnもメソッド記述の定型句のため省略できる。
        Color1 c2 = a ->  a +" です。";

        System.out.println(c2.write1("青"));
    }
}
