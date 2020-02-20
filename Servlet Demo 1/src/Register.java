import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          
		String n=request.getParameter("uname");  
		String p=request.getParameter("upass");  
		String e=request.getParameter("uemail");  
		String c=request.getParameter("ucountry"); 
		
		          
		try{  
			String url="jdbc:mysql://localhost:3306/mydb";
			String username="root";
			String password="1234";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("connected");
			
			/*Statement stmt=con.createStatement();
			String s1="if(!exists(create table registeruser(uname varchar(30),upass varchar(30),"
					+ "uemail varchar(30),ucountry varchar(30)))";
					*/
			
			/*stmt.executeUpdate(s1);
			System.out.println("Table Created !!");*/
			int count=0;
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from reguser where uemail='"+e+"'");
	        while(rs.next()){
	        count++;
	        }
	        if(count>0){
	        out.println("<font color=red>Error: user details already exists</font>");

	        }
	        else {	
		PreparedStatement ps=con.prepareStatement(  
		"insert into reguser values(?,?,?,?,?)");  
		ps.setString(1,null);  
		ps.setString(2,n);  
		ps.setString(3,p);  
		ps.setString(4,e);  
		ps.setString(5,c);  
		          
		int i=ps.executeUpdate();  
		if(i>0)  
		{	out.print("<font color=blue><script>alert('You are successfully registered...')</script></font>");
			
		}
		else 
			out.print("<font color=red><script>alert('You are not successfully registered...')</script></font>");  
		      
	        }      
		}catch (Exception e2) {System.out.println(e2);}  
		          
		out.close();  
	}
	
}
