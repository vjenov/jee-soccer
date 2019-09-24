package com.soccer.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceImpls.PlayerServiceImpl;
import com.soccer.web.services.PlayerService;

@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PlayerBean param = null;
		switch(request.getParameter("action")) {
		case "move" :
			break;
		case "find2" :
			request.setAttribute("positions", PlayerServiceImpl.getInstance().findPositions());
			break;
		case "find4" :
			System.out.println("액션 : , 페이지 : " + request.getParameter("action")+ ", " + request.getParameter("page"));
			param = new PlayerBean();
			param.setTeamId(request.getParameter("teamId"));
			param.setPosition(request.getParameter("position"));
			request.setAttribute("players", PlayerServiceImpl.getInstance().findByTeamIdPosition(param));
			break;
		case "find5" :
			System.out.println("액션 : , 페이지 : " + request.getParameter("action")+ ", " + request.getParameter("page"));
			param = new PlayerBean();
			param.setTeamId(request.getParameter("teamId"));
			param.setHeight(request.getParameter("height"));
			param.setPlayerName(request.getParameter("playerName"));
			request.setAttribute("players", PlayerServiceImpl.getInstance().findByTeamIdHeightName(param));
			break;
		}
		request.getRequestDispatcher(String.format("WEB-INF/views/%s.jsp", request.getParameter("page"))).forward(request, response);
	}
}
