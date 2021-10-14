package basic.sample.enumsample;

import java.util.Arrays;

public class ArraysSample {
    // 可変長引数の指定の仕方
    // 引数を(型... + 配列名)で指定する。複数の引数を配列として受け取る。(コンパイル時に配列に展開する。)
    // 可変長引数に指定できるのは、引数リストの最後の引数だけ。複数の引数種別を可変長にはできない。
    // 可変長として受け取れるのは一つのメソッドで一つ、なぜなら配列に格納するので型一致でないと取り込めないから。
    /**
     *
     * @param array int
     * @return int
     */
    static int sum(int... array) {
        // forEループで初期化後にループ内で順次追加して合算結果を返すメソッドの実装
        // forEならループ数は要素数すべてを自動設定してループしてくれるのでこれに使える。
        // また引数的の数がメソッド側では不明なので、内部でforEに入れて全要素を処理するよう
        // 気を付けて処理する必要がある。
        // 引数の可変長部分は配列としてコンパイル時に確定するので、配列の処理と同じに扱う。
        int sum = 0;
        for (int value:array) sum += value;
        return sum;
    }

    public static void main(String[] args) {
        // copy arrays
        //　ArraysクラスのCopyOfメソッドで定義済みの配列を拡張(要素数を増減)することができる。
        // 実際の動作としては、既存の配列をコピーして要素数の定義を増減させるので、実際には
        // 元の配列をいじるのではなく新しい配列を生成する際のコピー時に要素数をいじっている。
        // (配列自体は固定長、宣言時点で要素数を決めると以後変更できないが、コピーして新しく配列を作る際にはいじれる。)
        // lengthから正数を引いていくと配列要素数を減らすことができる。
        // lengthの値を減算しても負値になることはできない。配列委要素の数はマイナスにはできず、例外が発生する。
        // 要素数を0にすることまでは可能で例外は出ないが利用方法はあまりなさそう。要素の入っていない空配列になる。
        int[] oldArray = {10,20,30};
        int[] newArray = Arrays.copyOf(
                oldArray, oldArray.length - 3);
        int[] new2Array = Arrays.copyOf(
                oldArray, oldArray.length + 4);
        // 配列の文字列表現
        // 単純に配列を出力してみると配列要素のハッシュ値を表示してしまう。
        System.out.println(oldArray);
        // ArraysクラスのtoStringメソッドを利用(言語で準備されている)すると、配列要素を[]括りで出力してくれる。
        System.out.println(Arrays.toString(oldArray));
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(new2Array));
        //
        int[] array = {100,20,0,50,70,65};
        System.out.println(Arrays.toString(array));
        // 配列要素のソート(言語側で準備済)
        // 自然順 natural order(昇順)でソート、ここで降順ソート reverse orderは準備されていない。
        // sortの結果は対象の同じ配列に代入してしまうので、最初の配列定義時点の並びの状態は保存されない。
        // sort前の状態を保持したいなら、CopyOfで配列自体を要素数そのままでコピーして保持しておく必要がある。
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(array[2]);
        // 配列内の配列要素のを検索する方法：binarysearch
        // 例となる配列、すでにソート済みの配列を使用
        int[] array0 = {1,2,4,7,8};
        // 値7を検索
        System.out.println(Arrays.binarySearch(array0,7));
        // 適当にソートしてない配列を準備
        int [] array1 = {2,4,7,1,8};
        // ソートしてない配列でのbinarysearchは結果が未定義、何が返ってくるかは不明。
        // 下記の結果では一応期待する値が戻ってくるが、常に正常に動くという保証はされないので使うべきではない。
        // 配列要素をソートせずに検索したい場合はArraysクラス外or自己実装のlinersearchなどで検索する。
        System.out.println(Arrays.binarySearch(array1,4));
        System.out.println(Arrays.binarySearch(array1,6));
        // 例：配列をソートして利用
        Arrays.sort(array1);
        // ソート済み配列で検索、検索対象の値をキーとして指定、結果は配列内要素のindexで出てくる。
        System.out.println(Arrays.binarySearch(array1,4));
        System.out.println(Arrays.binarySearch(array1,1));
        // 配列要素と検索キーが合致する場合は常に正か0の値が返るので、検索キーが含まれているかの結果判定に>=0が使える。
        // 検索時に指定した対象が配列にない場合、負値が出てくる。
        // 検索対象を配列と比較し、どこに入れるかを判定しその挿入可能な箇所のindexを内部計算し、-index-1を返す。
        System.out.println(Arrays.binarySearch(array1,3));
        // 例えば1,2,4の配列で3を検索した場合、昇順ソートなので2,4の間に挿入できるのでindexは2となるはず。
        // ソート結果でarray1[0]=1,array1[1]=2,array1[2]=4で3はarray1[2]より小さいためindexの2に
        // 仮に挿入可能と判断して、-index-1=-2-1として-3を返す。
        System.out.println(Arrays.binarySearch(array1,12));
        // 検索キーが配列要素のどれよりも大きい場合はindexに-array1.lengthを返すので-index=-5-1=-6。
        System.out.println(Arrays.binarySearch(array1,-12));
        // 配列要素のどれよりも小さい場合は最初の配列要素より前なのでindex[0]に入れられると判断して
        // index=0、出てくる値は-index-1=0-1=-1となる。
        // オブジェクトを要素とした配列の場合は？

        // 可変長引数
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(10,20));
    }
}
