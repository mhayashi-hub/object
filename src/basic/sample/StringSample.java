package basic.sample;

import java.util.Arrays;

class StringSample {
    public static void main(String[] args) {
        // concatメソッドのテスト
        String word1 = "abs";
        // Stringクラスに実装されているconcatメソッドで文字列を結合
        // concatでは文字列インスタンスに一度に1文字列しか追加できないので、連続結合は繰り返し
        // concatでは結合時点で文字列インスタンスを改めて確保するのでパフォーマンスが悪い
        // = 配列用メモリ確保が遅い＋配列を毎回新規で作るので遅い
        // StringBuilderのappendでは確保済みの文字列配列に追加するので配列確保の労力が減る、
        // また配列サイズを自動拡張していくので新規配列を生成する必要がない
        System.out.println(word1.concat("bbc"));

        // splitメソッドのテスト
        String sentence = "1-1,いのうえ,女,80,70,95";
        // sentence文字列を分割して配列に格納、区切り文字を","に、配列要素数の上限を6に指定
        // = 配列を6要素で確保してその中に切り出した文字列を入れる、という指定
        String[] data = sentence.split(",",6);
        System.out.println(Arrays.toString(data));

        // 複数の文字列の結合、文字列は文字列配列(String型)でもよい。
        String joinWord = String.join(" ",data);
        System.out.println(joinWord);

        // replaceメソッドで文字列を置き換え、パターンに合致するのが複数あれば全部置き換える
        String original = "This　+ is a pen.";
        System.out.println(original);
        String replace = original.replace("is","at");
        System.out.println(replace);

        // 文字列の検索、位置を検索する、複数マッチするパターンの場合は最初に見つけたものの位置を
        // 文頭スタートを0としてマッチする箇所の先頭位置の文字数を返す。
        // 文字列を含んでいないと-1を返す。
        // パターン,数値を指定した場合はその文字以降で検索して位置を返す。
        sentence = "This is a pen.";
        int index = sentence.indexOf("is");
        System.out.println(index);
        int indexNg = sentence.indexOf("at");
        System.out.println(indexNg);



    }
}
