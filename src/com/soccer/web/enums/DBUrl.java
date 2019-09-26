package com.soccer.web.enums;

public enum DBUrl {
	ORACLE_URL, MYSQL_URL, MARIA_URL;
	@Override
	public String toString() {
		String url = "";
		switch(this) {
		case ORACLE_URL :
			url = "jdbc:oracle:thin:@localhost:1521:xe";
			break;
		case MARIA_URL :
			url = "jdbc:mariadb://서버아이피:3306(사용포트)/데이터베이스명";
		}
		return url;
	}
}
