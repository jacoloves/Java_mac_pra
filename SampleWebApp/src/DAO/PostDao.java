package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostDao {

	protected String dairy;

	public PostDao(String dairy) {
		this.dairy = dairy;
	}

	// 書いた日記をテーブルに挿入する。
	public void insData() {

		Connection conn = null;

		try {
			Class.forName("org.postgresql.Driver");

			String dbName = "jdbc:postgresql://[::1]:5432/example-db";
			String userName = "dbaSho";
			String userPass = "ywe4wrd3";

			conn = DriverManager.getConnection(dbName, userName, userPass);

			String sql = "INSERT INTO Blogs (postblog) values(?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, this.dairy);

			pstmt.executeUpdate();


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
