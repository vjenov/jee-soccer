package com.soccer.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.soccer.web.commander.Receiver;
import com.soccer.web.commander.Sender;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.enums.Action;
import com.soccer.web.serviceImpls.PlayerServiceImpl;

@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Receiver r = new Receiver();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("서블릿working");
		System.out.println(request.getParameter("action"));
		System.out.println(request.getParameter("page"));
		System.out.println(request.getParameter("playerId"));
		System.out.println(request.getParameter("solar"));
		r.init(request);
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case CREATE :
			request.setAttribute("page", "login");
			break;
		default:
			break;
		}
		Sender.forward(request, response);
		
	}
}
