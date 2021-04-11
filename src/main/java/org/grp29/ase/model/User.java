package org.grp29.ase.model;

public class User {
    private String userName;
    private String password;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "Username: " + getUserName() + "\nPassword: " + getPassword();
	}
}