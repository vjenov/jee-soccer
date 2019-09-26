package com.soccer.web.commander;

import javax.servlet.http.HttpServletRequest;


public class Receiver {
	public static Command cmd = new Command();
	public void init(HttpServletRequest request) {
		System.out.println("리서버 전달");
		cmd = Commander.direct(request);
	}
}
