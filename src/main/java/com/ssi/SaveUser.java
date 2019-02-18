package com.ssi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssi.entities.User;

public class SaveUser extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//reads the data
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String mobile=request.getParameter("mobile");
		//process the data
		User user=new User(email,password,name,address,mobile);
		Session session=Data.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(user);
		tr.commit();
		session.close();
		//provides the response
		PrintWriter out=response.getWriter();
		out.println("Your Account Is Created");
		
		
		
	}

}
