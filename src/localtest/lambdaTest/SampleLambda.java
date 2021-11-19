package localtest.lambdaTest;

class SampleLambda {
    public static void main(String[] args) {
        // 基本形、ラムダなしの場合は下記のようになる。
        // Color1 c2 = new Color1() {
        //     @Override
        //     public String write1(String a) {
        //         return a +" です。";
        //     }
        // };
        // インスタンスはインターフェースを使って生成するが、インスタンス名に意味はない。
        // 実行するための仮の名前であるため、匿名もしくは無意味な名前でも識別できれば良い。(可読性を考慮するならわかりやすくすべき。)
        // インターフェースをクラスとしてインスタンスを生成し、その中の実装を@Overrideキーワードの後に書いて適用する。
        // IDEがうまく認識できればメソッド名は自動で選択できるようになるはず。またCtrl+OでOverrideする対象メソッドと
        // その引数の型などの情報を保管してくれる。
        // 省略を減らした基本的なラムダ式は下記のようになる。
        // Color1 c2 = (String a) -> {return a +" です。";};
        // 関数型インターフェースを使用する場合、入力と結果の型は一致するので型指定を省略可能。
        // なので()内部の記述はメソッド内の変数名のみにできる。
        // Color1 c2 = (a) -> {return a +" です。";};
        // さらに引数が一つのみの場合、()自体を省略して書ける。
        // Color1 c2 = a -> {return a +" です。";};
        // さらに、{}とreturnもメソッド記述の定型句のため省略できる。
        Color1 c2 = a ->  a +" です。";

        System.out.println(c2.write1("青"));
    }
}
