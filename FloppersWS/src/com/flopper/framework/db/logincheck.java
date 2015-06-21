package com.flopper.framework.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.flopper.framework.constant.Contsants;

public class logincheck {

	public String userLogin(String username, String password) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Connection conn = DBHelper.getConnection();
		try {

			stmt = conn
					.prepareStatement("select * from customerusers c where c.username=? and c.password=?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			rs = stmt.executeQuery();
			if (rs.next()) {
				loginHistory(username, conn);
				return Contsants.SUCCESS;

			} else {
				return "Invalid credential";
			}

		} catch (Exception e) {
			e.printStackTrace();
			return Contsants.UNKNOWN_ERROR;

		} finally {

			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void loginHistory(String username, Connection conn) {
		PreparedStatement stmt = null;
		try {

			stmt = conn
					.prepareStatement("insert into loginhistory values(((select max(loginid) from loginhistory)+1),?,sysdate,null)");
			stmt.setString(1, username);
			int rs = stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
