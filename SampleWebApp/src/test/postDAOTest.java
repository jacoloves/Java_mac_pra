package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

public class postDAOTest {

	protected String date;

	public static void main(String[] args)  {
		// TODO 自動生成されたメソッド・スタブ
		Connection conn = null;

		try {
			Class.forName("org.postgresql.Driver");

			String dbName = "jdbc:postgresql://[::1]:5432/example-db";
			String userName = "dbaSho";
			String userPass = "ywe4wrd3";

			conn = DriverManager.getConnection(dbName, userName, userPass);

			String sql = "INSERT INTO Blogs (postblog) values(?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, "テストです。何を書いてもOKなのでとりあえず書いてみます。");

			pstmt.executeUpdate();

			System.out.println("テスト完了？");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
