package com.soccer.web.commander;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Sender {
	public static void forward(HttpServletRequest request, HttpServletResponse response) { // .jsp - Send to jsp file
		try {
			System.out.println("sender도착" + Receiver.cmd.getView());
			request.getRequestDispatcher(Receiver.cmd.getView()).forward(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	public static void redirect(HttpServletRequest request, HttpServletResponse response) { // .do - Send to Servlet file
		try {
		response.sendRedirect("");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
