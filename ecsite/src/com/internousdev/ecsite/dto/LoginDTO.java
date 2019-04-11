package com.internousdev.ecsite.dto;

public class LoginDTO {
	private String LoginId;
	private String LoginPassword;
	private String UserName;
	private boolean loginFlg = false;

	public String getLoginId() {
		return this.LoginId;
	}

	public void setLoginId(String LoginId) {
		this.LoginId = LoginId;
	}

	public String getLoginPassword() {
		return this.LoginPassword;
	}

	public void setLoginPassword(String LoginPassword) {
		this.LoginPassword = LoginPassword;
	}

	public String getUserName() {
		return this.UserName;
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;
	}

	public boolean getLoginFlg() {
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

}
