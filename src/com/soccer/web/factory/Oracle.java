package com.soccer.web.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import com.soccer.web.pool.Constants;

public class Oracle implements Database{

	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			//오라클의 영역
			Class.forName(Constants.ORACLE_DRIVER); //import 기능 역할
			conn = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USERID, Constants.PASSWORD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
