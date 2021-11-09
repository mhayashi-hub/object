package localtest.stringsTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexMatchGroupSample {
    public static void main(String[] args) {
        String sentence = "ABCABC";
        System.out.println(sentence);
        System.out.println("match検索");
        // Patternは正規表現を扱うクラス？compileは正規表現をプログラム上で処理するためのコンパイル処理？
        // いちいちコンパイルする意味がよくわからないが、コンパイルしておけば高速な検索になる？
        // またPatternオブジェクトはイミュータブルなのでスレッドセーフであり、マルチスレッドプログラムで使いまわせる。
        Pattern key = Pattern.compile("BC");
        // MatcherはPatternでの表現を使って入力をどう処理するかを決めているっぽい。
        // matcher,find,lookingAtがあり、合致したものをまとめてgroupで取り出せる？
        // どれもパターンを使って入力内を検索するが、matcherは全体一括検索、lookingAtは先頭から走査、
        // findは見つけたパターン合致部位の次にみつかる合致部位を探しに行く？(イテレータ処理？)
        Matcher match = key.matcher(sentence);
        //
        while (match.find()) {
            System.out.println(match.group());
        }
        System.out.println("\nOR検索");
        // パターン指定部分には普通に正規表現指定が使える。
        // ただし対話的に使える正規表現検索、抽出と異なり、検索や抽出に適さないパターンでも
        // 一応正規表現の記法に合致すれば処理が進んでしまう。
        // 本来はコンパイル時にエラーが出るはずだが、記法的には通るものはチェックできない？
        // 検索の意図として合致しないだけでパターンの記述としてはあり、という場合は通ってしまう。
        // 一応検索処理は生成済みMatcherオブジェクトから行えるので使いまわしはできる。
        Pattern orKey = Pattern.compile("[BC]");
        Matcher orMatch = orKey.matcher(sentence);
        while (orMatch.find()) {
            System.out.println(orMatch.group());
        }
        System.out.println("\nNOT検索");
        // 文字の否定表現はもしかしたら[ ]でくくって記載する必要がある？
        // []なしの場合は先頭の検索パターンになるためか？
        Pattern notKey = Pattern.compile("[^B]");
        Matcher notMatch = notKey.matcher(sentence);
        while (notMatch.find()) {
            System.out.println(notMatch.group());
        }
        System.out.println("\n範囲を指定した文字列検索");
        // パターンで文字列の範囲を指定して検索する方法のテスト。
        String sentence2 = "ABCDABCDEF";
        Pattern areaKey = Pattern.compile("[A-C]");
        Matcher areaMatch = areaKey.matcher(sentence2);
        while (areaMatch.find()) {
            System.out.println(areaMatch.group());
        }
        System.out.println("\n先頭文字検索");
        // 先頭文字を指定して検索する方法のテスト。
        Pattern startKey = Pattern.compile("^AB");
        Matcher startMatch = startKey.matcher(sentence2);
        while (startMatch.find()) {
            System.out.println(startMatch.group());
        }
        System.out.println("\n末尾文字検索");
        // 文字列末尾を指定して検索する方法のテスト。
        Pattern endKey = Pattern.compile("BC$");
        Matcher endMatch = endKey.matcher(sentence2);
        while (endMatch.find()) {
            System.out.println(endMatch.group());
        }
        System.out.println("\n複数文字の連続部分の検索");
        // 同一で複数連続した文字を連続数指定して検索する方法のテスト。
        String sentence3 = "ABCDECEEEFGJIF";
        Pattern serialKey = Pattern.compile("E{3}");
        Matcher serialMatch = serialKey.matcher(sentence3);
        while (serialMatch.find()) {
            System.out.println(serialMatch.group());
        }
        System.out.println("\n複数文字(何個以上)の連続部分の検索");
        // 複数、～個以上連続した文字を指定して検索する方法のテスト。
        String sentence4 = "ABCCEDFCGCCCDEGCCGJ";
        Pattern seriesKey = Pattern.compile("C{2,}");
        Matcher seriesMatch = seriesKey.matcher(sentence4);
        while (seriesMatch.find()) {
            System.out.println(seriesMatch.group());
        }
        System.out.println("\nOR検索バリエーションテスト");
        // ORの正規表現の書き方バリエーション。
        // |でORを表現する場合、[]での括りは不要。
        // 逆に[]でくくるなら|はOR条件の区切りに使えない？
        Pattern anoOrKey = Pattern.compile("A|B|D");
        Matcher anoOrMatch = anoOrKey.matcher(sentence4);
        while (anoOrMatch.find()) {
            System.out.println(anoOrMatch.group());
        }
        // []括りのOR正規表現の場合、[]内に|を記載することはできないっぽい。
        // 正規表現パターンとして認識されなくなる？記述法としても不正確？間違っている？
        // []括りの場合、中の全部の文字が検索パターンとして採用されるので、","区切りはできない、
        // ","も検索パターンの文字そのものとして認識されるため、複数記載すると「検索パターンが重複してる」と怒られる。
        Pattern anoOrKey2 = Pattern.compile("AB|BD");
        Matcher anoOrMatch2 = anoOrKey2.matcher(sentence4);
        while (anoOrMatch2.find()) {
            System.out.println(anoOrMatch2.group());
        }
    }
}
