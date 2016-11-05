import java.sql.*;
public class DBSample {
	public static void main(String[] args) throws Exception {
		Class.forName("org.h2.Driver");
		String dburl = "jdbc:h2:./test";
		// データベースに接続
		Connection conn = DriverManager.getConnection(dburl);
		// テーブルの作成(1)
		String sql = "CREATE TABLE EMPLOYEES (name nchar(8))";
		conn.createStatement().executeUpdate(sql);
		// レコードの追加(2)
		sql = "INSERT INTO EMPLOYEES (name) VALUES ('iida')";
		conn.createStatement().executeUpdate(sql);
		// テーブルの読み出し(3)
    Statement stmt = conn.createStatement();
    ResultSet rset = stmt.executeQuery("select * from EMPLOYEES");
    while ( rset.next() ) {
      System.out.println(rset.getString(1));
   	}
		// テーブルの削除(4)
		sql = "DROP TABLE EMPLOYEES";
		conn.createStatement().executeUpdate(sql);
		// 結果セットをクローズ
    rset.close();
    // ステートメントをクローズ
    stmt.close();
		// データベースから切断
		conn.close();
	}
}
