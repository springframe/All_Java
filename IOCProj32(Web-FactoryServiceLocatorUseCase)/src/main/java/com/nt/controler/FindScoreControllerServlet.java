package com.nt.controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.FindScoreService;
import com.nt.service.FindScoreServiceImpl;

@WebServlet("/controller")
public class FindScoreControllerServlet extends HttpServlet {
	ApplicationContext ctx = null;

	public void init() {
		// create ioc container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int mid;
		FindScoreService service = null;
		String scoreCard = null;
		RequestDispatcher rd = null;
		// read match id
		mid = Integer.parseInt(req.getParameter("matchId"));
		System.out.println(mid);
		// get loacl service class obj ref
		service = ctx.getBean("findscoeImpl", FindScoreServiceImpl.class);
		scoreCard = service.findScore(mid);
		//keep on request scoep and forward the request to the viewJsp page
		req.setAttribute("scoreCard", scoreCard);
		//forward request to the jsp
		rd=req.getRequestDispatcher("viewScore.jsp");
		rd.forward(req, resp);

	}

}
