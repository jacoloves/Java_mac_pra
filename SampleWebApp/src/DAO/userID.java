package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class userID {

	public static void main(String[] args) {

		Connection con = null;

		try {
			Class.forName("org.postgresql.Driver");

			String dbName = "jdbc:postgresql://[::1]:5432/example-db";
			String userName = "dbaSho";
			String userPass = "ywe4wrd3";

			con = DriverManager.getConnection(dbName, userName, userPass);

			String sql = "SELECT * FROM rogin";
			PreparedStatement psmt = con.prepareStatement(sql);

			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("userid");
				String pass = rs.getString("password");

				System.out.println("ID:" + id);
				System.out.println("PASS:" + pass);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (con != null ) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
