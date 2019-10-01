package com.soccer.web.commander;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.enums.Action;

public class Commander {
	public static Command direct(HttpServletRequest request) {
		Command cmd = new Command();
		System.out.println("커맨더도착" + request.getParameter("action"));
		try {
			switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
			case MOVE :
				System.out.println("move 들어옴");
				cmd = new MoveCommand(request);
				break;
			case LOGIN :
				cmd = new LoginCommand(request);
				break;
			case CREATE :
				cmd = new CreateCommand(request);
				break;
			case SEARCH :
				break;
			case DELETE :
				break;
			case UPDATE :
				break;
			default:
				break;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return cmd;
	}
}
