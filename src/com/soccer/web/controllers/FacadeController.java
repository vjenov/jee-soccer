package com.soccer.web.controllers;

import java.io.IOException;
import com.soccer.web.pool.Constants;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/facade.do")
public class FacadeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	enum Resources{
		CTX, CSS, JS, IMG
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("facade 들어옴");
		//session은 request의 집합
		// Resources.values() - enum Resources의 4가지 들어옴  .values는 집합을 가져옴
		   
		for(Resources r : Resources.values()) {
			/*
			request.getSession().setAttribute(r.toString().toLowerCase(), request.getContextPath() + ((r.toString().toLowerCase().equals("ctx")) 
			? "" : "/resources/" + r.toString().toLowerCase()));
			*/
			request.getSession().setAttribute(r.toString().toLowerCase(), request.getContextPath() + ((r.ordinal() ==0)
					? "" : "/resources/" + r.toString().toLowerCase()));
		}
		
		/*
		session.setAttribute("img", request.getContextPath() + "/resources/img");
		session.setAttribute("js", request.getContextPath() + "/resources/js");
		session.setAttribute("css", request.getContextPath() + "/resources/css");
		*
		*/
		request
		.getRequestDispatcher(String.format(Constants.DOUBLE_PATH, request.getServletPath().substring(1, request.getServletPath().indexOf(".")),
				"login"))
		.forward(request, response);
	}
}
