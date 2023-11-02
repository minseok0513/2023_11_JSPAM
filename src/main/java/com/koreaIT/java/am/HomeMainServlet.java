package com.koreaIT.java.am;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class HomeMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8;");
		response.getWriter().append("<ul>");
		response.getWriter().append("	<li>1번, 2023-11-02, 제목1</li>");
		response.getWriter().append("	<li>2번, 2023-11-02, 제목2</li>");
		response.getWriter().append("	<li>3번, 2023-11-02, 제목3</li>");
		response.getWriter().append("</ul>");
	}

}
