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
import com.soccer.web.serviceImpls.PlayerServiceImpl;

@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("working");
		System.out.println(request.getParameter("action"));
		System.out.println(request.getParameter("page"));
		Receiver r = new Receiver();
		r.init(request);
		Sender s = new Sender();
		s.forward(request, response);
		
	}
}
