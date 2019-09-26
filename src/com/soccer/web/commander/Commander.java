package com.soccer.web.commander;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.enums.Action;

public class Commander {
	public static Command direct(HttpServletRequest request) {
		Command cmd = new Command();
		System.out.println("커맨더도착");
		try {
			switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
			case SEARCH :
				cmd = new SearchCommand();
				break;
			case MOVE :
				cmd = new MoveCommand(request);
				break;
			case LOGIN :
				cmd = new LoginCommand(request);
				break;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return cmd;
	}
}
