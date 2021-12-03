package ex.exception;

class ExceptionThrows {
    // 例外を呼び出し元にthrowする書式。
    // メソッドの()の後にthrows 例外名　という形で宣言する。
    // このメソッド内では例外が発生しても何も処理せず、呼び出した方に例外処理を押し付ける。
    public static void printValue() throws Exception {
        int[] numArray = {1,2,3,5,8};
        int i = 0;
        for (i=0; i<=5 ; i++) {
            System.out.println("配列のindex："+ i +" 配列の値："+ numArray[i]);
        }
    }
}
