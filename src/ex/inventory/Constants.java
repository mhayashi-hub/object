package ex.inventory;

/*
public interface Constants {
    // 定数クラス - インターフェースタイプ
    // (Java8でinterface内で定数として変数定義して即値代入可能になったらしいのでその説明のために作ったものらしい。)
    // 根本的にはinterfaceで作成する意味はない。定数クラスで十分。
    // OS type
    public static final String WIN10 = "Windows10";
    public static final String WIN11 = "Windows11";
    public static final String MAC = "Mac";
    // CPU type
    public static final int OS64 = 64;
    public static final int OS32 = 32;
}
 */

public class Constants {
    // 定数クラス
    // 定数宣言する場合はstatic finalのアクセス修飾子を付ける。
    // staticを付けるとインスタンス生成(new)しなくても変数にアクセスできる。(クラス名.変数でアクセス可能。)
    // 通常はnewでインスタンス生成しないと(クラス自体はひな形なので中身がないから)変数にはアクセスできない。
    // finalを付けた時点で最初の定義後変更不可になる。
    public static final String WIN10 = "Windows10";
    public static final String WIN11 = "Windows11";
    public static final String MAC = "Mac";
    // CPU bus-bit type
    public static final int OS64 = 64;
    public static final int OS32 = 32;
}
