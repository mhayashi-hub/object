package localtest.stringsTest;

import java.util.Locale;

class CaseConvertCheck {
    public static void main(String[] args) {
        String message1 = "Hello!";
        // toUpperCase()で大文字に変換、toLowerCase()で小文字に変換可能。
        // 変換可能なのは大文字小文字のある言語のみ。デフォルトはシステムロケールの英字となるはず。
        System.out.println(message1);
        System.out.println(message1.toUpperCase());
        System.out.println(message1.toLowerCase());
        // 変換時にロケール情報を渡して変換させることも可能。元が英字の文字列なので英字の変換ルールはほぼ変わらない。
        System.out.println(message1.toLowerCase(Locale.getDefault()));
        System.out.println(message1.toUpperCase(Locale.CANADA_FRENCH));
        // 日本語は大文字小文字がないので特に変換されないはず。
        String message2 = "こんにちわ";
        System.out.println(message2);
        System.out.println(message2.toUpperCase());
    }
}
