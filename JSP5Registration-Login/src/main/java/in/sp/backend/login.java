package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginForm")
public class login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();

		String myEmail = req.getParameter("email1");
		String myPass = req.getParameter("pass1");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJavaDB", "root", "Sumit4403");
		    
		    PreparedStatement ps = con.prepareStatement("select * from register where email=? and password=?");
		    ps.setString(1, myEmail);
		    ps.setString(2, myPass);
		    
		    ResultSet rs = ps.executeQuery();
		    
		    if (rs.next()) {
		    	HttpSession session = req.getSession();
		    	session.setAttribute("session_name", rs.getString("name"));
		    	
		    	RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
		    	rd.include(req, resp);
			}
		    else {
		    	resp.setContentType("text/html");
		    	out.print("<h3 style='color:red'> Email id and password didnt matched </h3>");
		    	
		    	RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
		    	rd.include(req, resp);
		    }
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			
			resp.setContentType("text/html");
			out.print("<h3 style='color:red'> "+e.getMessage()+" </h3>");
			
	    	RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
	    	rd.include(req, resp);
		}
	}
}
