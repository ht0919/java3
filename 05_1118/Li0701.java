public class Li0701 {
    public static void main(String[] args) {
        /* 何らかのデータを読み込む処理 */
        if( true /* データが正しくないなら */) {
            System.out.println("データが壊れています。異常終了します。");
            System.exit(1);     // ここでJVMを異常終了
        }
        System.out.println("正常終了しました。");
    }
}
