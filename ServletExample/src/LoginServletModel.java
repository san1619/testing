import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/test/")
public class LoginServletModel extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) {
		System.out.println("!!!!!!!!inside!!!!!!!!!"+config.getInitParameter("test"));
		System.out.println(config.getServletContext().getInitParameter("contextTest"));
	
	}
	
	public void doPost(HttpServletRequest req, HttpServlet res)
	     throws ServletException, IOException {
		HttpSession ses = req.getSession();
		
		Cookie[] ck= req.getCookies();
		   
		
		      Cookie cke= new Cookie("name","Santoshi");
		      cke.setMaxAge(1000);
		      ((HttpServletResponse) res).addCookie(cke);
		      
		      
		      String userName = req.getParameter("userName");
		      String password = req.getParameter("Password");
		      System.out.println("userName value:::"+userName+":::password value:::"+password);
		      try {
		    	  Class.forName("com.mysql.jdbc.Driver");
		    	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sessions","ROOT","Aforapple");
		          PreparedStatement ps = con.prepareStatement("select * from user where username=?");
		          ps.setString(1, userName);
		          ResultSet rs = ps.executeQuery();
		          boolean isValidUser = false;
		          while(rs.next())   {
		        	  
		        	  isValidUser = true;
		        	  System.out.println("UserName is valid");
		          }
		          
		          String fileName = "index.jsp";
		          if(isValidUser) {
		        	  ses.setAttribute("userId", 123);
		        	  fileName = "Home.html";
		          }else {
		        	  req.setAttribute("msg","userName does not exsist in the database");
		          }
		          
		          RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		          rd.forward(req, (ServletResponse) res);
		          
		      
		      } catch (ClassNotFoundException e) {
		    	  
		    	 
		    	  e.printStackTrace();
		      }catch (SQLException e) {
		    	  
		    	    e.printStackTrace();
		      }
		      
		      
		        	        
	}	
	

	}
