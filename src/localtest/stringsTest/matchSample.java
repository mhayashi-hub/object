package localtest.stringsTest;

class matchSample {
    public static void main(String[] args) {
        // regionMatc()hのテスト
        String message1 = "Hello World!";
        String message2 = "Hi world!";
        // regionMatches()の最初のtrue/falseは大文字小文字を区別するかの指定。
        // falseはignoreCaseでfalse、つまり大文字小文字を別文字として識別する。
        System.out.println(message1.regionMatches(false,6,message2,3,5));
        System.out.println(message1.regionMatches(true,6,message2,3,5));
    }
}
