package localtest.lambdaTest;

class SampleLambda2 {
    public static void main(String[] args) {
        // 型Stringを省略した記述、引数は二つなので()は省略できない。
        // Color2 c1 = (a,b) -> {return a +"と"+ b +" です。";};
        // 前に確認したようにlambda式では実装の部分のreturnと{}は省略できる。
        Color2 c1 = (a,b) -> a +"と"+ b +" です。";
        //
        System.out.println(c1.write1("緑","浅黄"));
    }
}

