package com.trainingbasket.javaee.web;

import java.io.IOException;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import javax.jws.soap.InitParam;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trainingbasket.javaee.modal.League;

/**
 * Servlet implementation class AddLeague
 */

@WebServlet(urlPatterns = "/addLeague")
@WebInitParam(name = "customData", value = "123,1234,21,21,23,213,21,412")
public class AddLeague extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	// black form
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/addleague.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		System.out.println("CustomDataConfig" + getServletConfig().getInitParameter("customData"));
		System.out.println("CustomDataContext" + getServletContext().getInitParameter("customData"));
		int year = 0;
		List<String> errMsg = new ArrayList<String>();
		String season = request.getParameter("season");
		String title = request.getParameter("title");

		try {
			year = Integer.parseInt(request.getParameter("year"));
		} catch (Exception e) {
			errMsg.add("Please enter a valid Year" + e.getMessage());
		}

		if (year < 2020) {
			errMsg.add("Year Can not be less than current year");
		}
		if (season.equals("") || season == null) {
			errMsg.add("Season can not be blank");
		}
		if (title.equals("") || title == null) {
			errMsg.add("title can not be blank");
		}
		RequestDispatcher dispatcher = null;
		if (errMsg.isEmpty()) {
			League league = new League();
			List<League> leagues = (List<League>) getServletContext().getAttribute("leagues");
			if (leagues == null) {
				leagues = new ArrayList<League>();
				leagues.add(new League(1, getInitParameter("customData"), getInitParameter("customData")));
				league.setSeason(season);
				league.setTitle(title);
				league.setYear(year);
				leagues.add(league);
				getServletContext().setAttribute("leagues", leagues);
			} else {
				league.setSeason(season);
				leagues.add(new League(1, getServletConfig().getInitParameter("customData"), ""));
				league.setTitle(title);
				league.setYear(year);
				leagues.add(league);
				getServletContext().setAttribute("leagues", leagues);
			}
			request.setAttribute("msg", "League Has been added" + league);
			dispatcher = request.getRequestDispatcher("/views/listleague.jsp");

		} else {
			request.setAttribute("errMsg", errMsg);
			dispatcher = request.getRequestDispatcher("/views/addleague.jsp");
		}
		dispatcher.forward(request, response);
	}

}
