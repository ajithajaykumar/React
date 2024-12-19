package people;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class Admin
 */
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static boolean getAdmin(String username,String pass){
		DAO d=new DAO();
//	    List list=new ArrayList<>();
	     boolean result=false;
	    try{
	        Connection con=d.getCon();
	        PreparedStatement ps=con.prepareStatement("select * from admin where username=?");
	        ps.setString(1, username);
	        ResultSet rs=ps.executeQuery();
	        while(rs.next()){
	        	String name=rs.getString("username");
	        	String password=rs.getString("pass");
	            if(name.equals(username) && password.equals(pass)) {
	            	result= true;
	            }
	            else {
	            	result= false;
	            }
	        }
	    }catch(Exception e){System.out.println(e);}
//	    return list;
		return result;
	}


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {	
		//result get by parameter
		String username=req.getParameter("username");
		String Pass=req.getParameter("password");
		//dispatch the response 
		Get g=new Get();
		DAO d=new DAO();
		  try{
			       boolean result=getAdmin(username,Pass);
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
