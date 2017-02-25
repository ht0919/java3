import java.sql.*;      /* java.sqlをインポートしておく */
public class Score {
    public static void main(String[] args) {
      init();
      list();
    }

    public static void init() {
        try {
            Class.forName("org.h2.Driver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();            /* ドライバが見つからない場合の処理（＊）*/
        }
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:h2:./scoredb");  /* JDBC URLを指定 */

            // 古いテーブルの削除
            PreparedStatement pstmt = con.prepareStatement("DROP TABLE IF EXISTS SCORE");
            int r = pstmt.executeUpdate();
            pstmt = con.prepareStatement("DROP TABLE IF EXISTS STUDENT");
            r = pstmt.executeUpdate();
            pstmt = con.prepareStatement("DROP TABLE IF EXISTS SUBJECT");
            r = pstmt.executeUpdate();

            // テーブルの作成
            pstmt = con.prepareStatement("CREATE TABLE SCORE (DATE date, NAMEID int, SUBID int, SCORE int)");
            r = pstmt.executeUpdate();
            pstmt = con.prepareStatement("CREATE TABLE STUDENT (NAMEID int, NAME text)");
            r = pstmt.executeUpdate();
            pstmt = con.prepareStatement("CREATE TABLE SUBJECT (SUBID int, SUBJECT text)");
            r = pstmt.executeUpdate();

            // レコードの追加
            pstmt = con.prepareStatement("INSERT INTO STUDENT VALUES(1,'鈴木イチロー')");
            r = pstmt.executeUpdate();
            pstmt = con.prepareStatement("INSERT INTO STUDENT VALUES(2,'佐藤二郎')");
            r = pstmt.executeUpdate();
            pstmt = con.prepareStatement("INSERT INTO SUBJECT VALUES(1,'国語')");
            r = pstmt.executeUpdate();
            pstmt = con.prepareStatement("INSERT INTO SCORE VALUES('2017-02-25',1,1,100)");
            r = pstmt.executeUpdate();
            pstmt = con.prepareStatement("INSERT INTO SCORE VALUES('2017-02-25',2,1,59)");
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
          con = DriverManager.getConnection("jdbc:h2:./scoredb");  /* JDBC URLを指定 */
          String sql1 = "SELECT SCORE.DATE,STUDENT.NAME,SUBJECT.SUBJECT,SCORE.SCORE ";
          String sql2 = "FROM SCORE,STUDENT,SUBJECT ";
          String sql3 = "WHERE SCORE.NAMEID=STUDENT.NAMEID and SCORE.SUBID=SUBJECT.SUBID ";
          String sql4 = "and SCORE.SCORE<60";
          String sql  = sql1 + sql2 + sql3 + sql4;
          PreparedStatement pstmt = con.prepareStatement( sql );
          ResultSet rs = pstmt.executeQuery();
          while(rs.next()) {                              /* 結果行の最後まで繰り返す */
              System.out.print(rs.getString("SCORE.DATE")+" ");   // 注目行について処理
              System.out.print(rs.getString("STUDENT.NAME")+" ");   // 注目行について処理
              System.out.print(rs.getString("SUBJECT.SUBJECT")+" ");   // 注目行について処理
              System.out.println(rs.getString("SCORE.SCORE"));   // 注目行について処理
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
}
