package com.ust.ioc;

public class Login {
	private String userName;
	private String password;
	DBConnection db;
	
	public String validate() {
		//DBConnection db = new DBConnection();
		//db = new DBConnection();
		
		Connection con = db.getConnection();
		return "connected to db";
				
		//obtain connection and write sql to verify username and password exist in database
		//return "login validated";
	}

	public DBConnection getDb() {
		return db;
	}

	public void setDb(DBConnection db) {
		this.db = db;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
