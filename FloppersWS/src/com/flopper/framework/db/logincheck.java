package com.flopper.framework.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.flopper.framework.constant.Constants;

public class logincheck {

	public String userLogin(String username, String password) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Connection conn = DBHelper.getConnection();
		try {

			stmt = conn
					.prepareStatement("select * from usercredential c where c.username=? and c.password=?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			rs = stmt.executeQuery();
			if (rs.next()) {
				loginHistory(username, conn);
				return Constants.SUCCESS;

			} else {
				return "Invalid credential";
			}

		} catch (Exception e) {
			e.printStackTrace();
			return Constants.UNKNOWN_ERROR;

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
					.prepareStatement("insert into loginhistory values(((select nvl( max(loginid),0) from loginhistory)+1),?,sysdate,null)");
			stmt.setString(1, username);
			int rs = stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
