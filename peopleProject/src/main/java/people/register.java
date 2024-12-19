package people;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//result get by parameter
		String username=req.getParameter("username");
		String Pass=req.getParameter("password");
		//dispatch the response 
		req.setAttribute("message",username);
		RequestDispatcher dispatch=req.getRequestDispatcher("Register.html");
		dispatch.forward(req,res);
		Get g=new Get();
		DAO d=new DAO();
		g.setUserName(username);
		g.setPass(Pass);
		  String user= g.getUserName();
		  String pass=g.getPass();
		  try{
			       int  status=d.Insert(g);
			       boolean result=d.particuler(user,pass);
			       System.out.println(result);
	if(status!=0) {
		System.out.println("success");
	}
	else {
		System.out.println("Not inserted");
	}
		 
	}catch(Exception e){System.out.println(e);}
		   
		}
		
		}
