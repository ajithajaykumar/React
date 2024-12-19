package people;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//user login
public class user extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//result get by parameter
		String username=req.getParameter("username");
		String Pass=req.getParameter("password");
		//dispatch the response 
		Get g=new Get();
		DAO d=new DAO();
		  try{
			       boolean result=d.particuler(username,Pass);
			       if(result==true) {
					RequestDispatcher dispatch=req.getRequestDispatcher("Main.html");
					dispatch.forward(req,res);
			       }
			       else {
			    	   System.out.println("users not found");
			    	   req.setAttribute("message",username);
						RequestDispatcher dispatch=req.getRequestDispatcher("User.html");
						dispatch.forward(req,res);
			       }
	 
	}catch(Exception e){System.out.println(e);}
		   
		}
		
		}
