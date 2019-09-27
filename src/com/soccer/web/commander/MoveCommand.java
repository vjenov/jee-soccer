package com.soccer.web.commander;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command{
	public MoveCommand(HttpServletRequest request)throws Exception{
		setRequest(request);
		setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
		System.out.println("무브커맨드도착");
		
	}
	public void execute() {
		setPage(request.getParameter("page"));
		super.execute();
	}
}
