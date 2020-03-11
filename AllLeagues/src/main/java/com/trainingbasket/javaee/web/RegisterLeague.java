package com.trainingbasket.javaee.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trainingbasket.javaee.modal.League;
import com.trainingbasket.javaee.modal.MyDate;
import com.trainingbasket.javaee.modal.Player;

@WebServlet("/RegisterLeague")
public class RegisterLeague extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
       public RegisterLeague() 
       {
    	   super();
       }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		List<League> leagues = (List<League>) getServletContext().getAttribute("leagues");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/Rsegister.jsp");
		
		dispatcher.forward(request, response);
	}

	List<String> errMsg;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("name");
		String dob = request.getParameter("dob");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String league = request.getParameter("leagues");
		String male = request.getParameter("male");
		String female = request.getParameter("female");
		
		validateData(name, dob, contact, address, email, league);
		
		Player player = new Player();
		
		MyDate dateOB = new MyDate();
		String dobdash[] = dob.split("-");
		String dobslash[] = dob.split("/");
		
		if (dobdash.length == 3)
		{
			dateOB.setDay(Integer.parseInt(dobdash[0]));
			dateOB.setMonth(Integer.parseInt(dobdash[1]));
			dateOB.setYear(Integer.parseInt(dobdash[2]));
		}
		else if (dobslash.length == 3)
		{
			dateOB.setDay(Integer.parseInt(dobslash[0]));
			dateOB.setMonth(Integer.parseInt(dobslash[1]));
			dateOB.setYear(Integer.parseInt(dobslash[2]));
		}
		
		player.setDob(dateOB);
		
		String leaguesFromUI[] = league.split("-");
		System.out.println(leaguesFromUI.length);
		League league2 = new League();
		league2.setId(Integer.parseInt(leaguesFromUI[0].trim()));
		league2.setTitle(leaguesFromUI[1].trim());
		league2.setSeason(leaguesFromUI[2].trim());
		league2.setYear(Integer.parseInt(leaguesFromUI[3].trim()));
		
		
		if (male!= null)
		{
			player.setGender("male");
		}
		if (female!= null)
		{
			player.setGender("female");
		}
		
		if (errMsg.size() != 0)
		{
			
		}
		
		else
		{
			player.setName(name);
			player.setAddress(address);
			player.setContact(contact);
			player.setEmail(email);
			player.setLeague(league2);
		}
	}
	private void validateData(String name, String dob, String contact, String address, String email, String league) 
	{
		errMsg = new ArrayList<String>();
		
		if (name.equals("") || name == null)
		{
			errMsg.add("Name can not be left blank");
		}
		
		if (dob.equals("") || dob == null)
		{
			errMsg.add("Date of Birth can not be left blank");
		}
		
		if (contact.equals("") || contact == null)
		{
			errMsg.add("Contact can not be left blank");
		}
		
		if (address.equals("") || address == null)
		{
			errMsg.add("Address can not be left blank");
		}
		
		if (email.equals("") || email == null)
		{
			errMsg.add("Email can not be left blank");
		}
		
//		if (male.equals("") || male == null)
//		{
//			errMsg.add("Male can not be left blank");
//		}
//		
//		if (female.equals("") || female == null)
//		{
//			errMsg.add("Famale can not be left blank");
//		}
		
		if (league.equals("") || league == null)
		{
			errMsg.add("League can not be left blank");
		}
		
	}
}
