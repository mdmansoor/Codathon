package com.flopper.framework.customer;

import com.flopper.framework.constant.Contsants;
import com.flopper.framework.db.logincheck;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author MM00344894
 * 
 */
public class customerloginbean extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void validate() {
		validateUserName();
		validatePassWord();
	}

	public void validateUserName() {
		if (username.equals("")) {
			this.addFieldError("username", "Username cannot be blank");

		}
	}

	public void validatePassWord() {
		if (password.equals("")) {
			this.addFieldError("password", "Password cannot be blank");

		}
	}

	@Override
	public String execute() throws Exception {
		logincheck login = new logincheck();
		String result = login.userLogin(username, password);
		if (result.equals(Contsants.SUCCESS))
			return SUCCESS;
		else
			return INPUT;

	}

}
