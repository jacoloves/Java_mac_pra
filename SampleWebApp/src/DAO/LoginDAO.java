package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dairy.Account;
import dairy.Login;

public class LoginDAO {
	public Account findByLogin(Login login) {
		Connection conn = null;
		Account account = null;

		try {
			Class.forName("org.postgresql.Driver");

			String dbName = "jdbc:postgresql://[::1]:5432/example-db";
			String userName = "dbaSho";
			String userPass = "ywe4wrd3";

			conn = DriverManager.getConnection(dbName, userName, userPass);

			String sql = "SELECT USERID, PASSWORD FROM ROGIN WHERE USERID = ? AND PASSWORD = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, login.getUserId());
			pStmt.setString(2, login.getPass());

			ResultSet rs = pStmt.executeQuery();

			if (rs.next()) {
				String userID = rs.getString("USERID");
				String pass = rs.getString("PASS");

				account = new Account(userID, pass);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					return null;
				}
			}
		}


		return account;
	}
}
