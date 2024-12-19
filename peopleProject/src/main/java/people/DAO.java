package people;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import people.Get;
public class DAO {
public static Connection getCon(){
    Connection con=null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/people","root","1806");
    }catch(Exception e){System.out.println(e);}
    return con;
}
public static int Insert(Get u){
    int status=0;
    try{
        Connection con=getCon();
        PreparedStatement ps=con.prepareStatement(
		        "insert into register(username,pass) values(?,?)");
	            ps.setString(1,u.getUserName());
		        ps.setString(2,u.getPass());
        status=ps.executeUpdate();
    }catch(Exception e){System.out.println(e);}
    return status;
}
public static List<Get> Records(){
    List<Get> list=new ArrayList<>();

    try{
        Connection con=getCon();
        PreparedStatement ps=con.prepareStatement("select * from Register where username=? ");
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            Get u=new Get();
            u.setUserName(rs.getString("name"));
            u.setPass(rs.getString("pass"));
            list.add(u);
        }
    }catch(Exception e){System.out.println(e);}
    return list;
}
public static List particuler(String username){
    List list=new ArrayList<>();

    try{
        Connection con=getCon();
        PreparedStatement ps=con.prepareStatement("select * from Register where username=?");
        ps.setString(1, username);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
           list.add( rs.getInt("id"));
            list.add(rs.getString("username"));
            list.add(rs.getString("pass"));
        }
    }catch(Exception e){System.out.println(e);}
    return list;
}


	}
