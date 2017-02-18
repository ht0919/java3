import java.sql.*;      /* java.sqlをインポートしておく */
public class Ex0218 {
    public static void main(String[] args) {
      //Ex0218.init();
      //Ex0218.list();
      //Ex0218.update();
      Ex0218.list();
      Ex0218.delete();
      Ex0218.list();
    }

    public static void init() {
        try {
            Class.forName("org.h2.Driver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();            /* ドライバが見つからない場合の処理（＊）*/
        }
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:h2:./atmdb");  /* JDBC URLを指定 */

            // 古いテーブルの削除
            PreparedStatement pstmt = con.prepareStatement
              ("DROP TABLE IF EXISTS ATM");
            int r = pstmt.executeUpdate();

            // テーブルの作成
            pstmt = con.prepareStatement
              ("CREATE TABLE ATM (AN text, NAME text, AB int)");
            r = pstmt.executeUpdate();

            // レコードの追加
            pstmt = con.prepareStatement
              ("INSERT INTO ATM VALUES('1234','AAA',1000)");
            r = pstmt.executeUpdate();

            pstmt = con.prepareStatement
              ("INSERT INTO ATM VALUES('1235','BBB',2000)");
            r = pstmt.executeUpdate();

            pstmt = con.prepareStatement
              ("INSERT INTO ATM VALUES('1236','CCC',3000)");
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

    public static void list() {
        try {
            Class.forName("org.h2.Driver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();            /* ドライバが見つからない場合の処理（＊）*/
        }
        Connection con = null;
        try {
          con = DriverManager.getConnection("jdbc:h2:./atmdb");  /* JDBC URLを指定 */
          PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ATM");
          ResultSet rs = pstmt.executeQuery();
          while(rs.next()) {                              /* 結果行の最後まで繰り返す */
              System.out.print(rs.getString("AN")+" ");   // 注目行について処理
              System.out.print(rs.getString("NAME")+" ");   // 注目行について処理
              System.out.println(rs.getString("AB"));   // 注目行について処理
          }
          rs.close();
          pstmt.close();                  // 後片付け

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

    public static void update() {
        try {
            Class.forName("org.h2.Driver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();            /* ドライバが見つからない場合の処理（＊）*/
        }
        Connection con = null;
        try {
          con = DriverManager.getConnection("jdbc:h2:./atmdb");  /* JDBC URLを指定 */
          PreparedStatement pstmt = con.prepareStatement("UPDATE ATM SET NAME='ZZZ' WHERE NAME='AAA'");
          int rs = pstmt.executeUpdate();
          pstmt.close();                  // 後片付け
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

    public static void delete() {
        try {
            Class.forName("org.h2.Driver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();            /* ドライバが見つからない場合の処理（＊）*/
        }
        Connection con = null;
        try {
          con = DriverManager.getConnection("jdbc:h2:./atmdb");  /* JDBC URLを指定 */
          PreparedStatement pstmt = con.prepareStatement("DELETE FROM ATM WHERE NAME='ZZZ'");
          int rs = pstmt.executeUpdate();
          pstmt.close();                  // 後片付け
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
