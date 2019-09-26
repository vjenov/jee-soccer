package com.soccer.web.commander;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceImpls.PlayerServiceImpl;

public class LoginCommand extends Command{
	public LoginCommand(HttpServletRequest request)throws Exception{
		System.out.println("로그인커맨드 접속");
		System.out.println("action값" + request.getParameter("action"));
		System.out.println("page값" + request.getParameter("page"));
		setRequest(request);
		setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
	}
	public void execute() {
		PlayerBean p = new PlayerBean();
		p.setPlayerId(request.getParameter("playerId"));
		p.setSolar(request.getParameter("solar"));
		p = PlayerServiceImpl.getInstance().login(p);
		if(!p.getPlayerId().equals("") && !p.getSolar().equals("")) {
			System.out.println("로그인 성공");
			setPage(request.getParameter("page"));
		}else {
			System.out.println("로그인 실패");
			setPage("index");
		}
		super.execute();
	}
}
