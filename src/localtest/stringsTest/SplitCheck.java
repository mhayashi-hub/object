package localtest.stringsTest;

class SplitCheck {
    public static void main(String[] args) {
        String keyword1 = "One/Two/Tree/Four/Five";
        // split()で指定した文字列キーワードで文字列を分解して配列化できる。
        String[] count1 = keyword1.split("/");
        // split()の引数の二番目に数値を指定すると、分割する個数の制限となる。2を指定したら1回分割して二個にする。
        String[] count2 = keyword1.split("/",2);
        for (int i=0; i< count1.length; i++) {
            System.out.println(i +":"+ count1[i]);
        }
        System.out.println("-----");
        for (int j=0; j< count2.length; j++) {
            System.out.println(j +":"+ count2[j]);
            System.out.println(j +":"+ count1[j]);
        }
    }
}
