package com.adith.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import com.adith.web.dao.TechDao;
import com.adith.web.model.Tech;

/**
 * Servlet implementation class GetTechController
 */

public class GetTechController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		TechDao dao = new TechDao();
		Tech a = dao.getTech(aid);
		request.setAttribute("tech", a);
		RequestDispatcher rd = request.getRequestDispatcher("showTech.jsp");
		rd.forward(request, response);
	}
}
