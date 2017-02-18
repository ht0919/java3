import java.sql.*;      /* java.sqlをインポートしておく */
public class DBSetup {
    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();            /* ドライバが見つからない場合の処理（＊）*/
        }
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:h2:./rpgdb");  /* JDBC URLを指定 */

            // テーブルの作成
            PreparedStatement pstmt = con.prepareStatement
              ("CREATE TABLE MONSTERS (NAME text, HP int, MP int, EXP int)");
            int r = pstmt.executeUpdate();

            // レコードの追加
            pstmt = con.prepareStatement
              ("INSERT INTO MONSTERS VALUES('ゾンビ',10,10,10)");
            r = pstmt.executeUpdate();

            pstmt.close();                  // 後片付け
            // ********** リスト12-2 ここまで **********

        } catch(SQLException e) {
            e.printStackTrace();            /* 接続やSQL処理の失敗時の処理（＊）*/
        } finally {
            // STEP 3: データベース接続の切断
            if(con != null) {
                try {
                    con.close();
                } catch(SQLException e) {
                    e.printStackTrace();    /* 切断失敗時の処理（＊）*/
                }
            }   /* ＊の箇所は必要に応じて適切なエラー処理を記述します */
        }
    }
}
