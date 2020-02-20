import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Demo2")
public class Demo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<h1> Init Names are: </h1>");
		Enumeration enumeration = getServletConfig().getInitParameterNames();
		while(enumeration.hasMoreElements()) {
			out.print(enumeration.nextElement() + " ");
		}
		ServletConfig con1 = getServletConfig();
		out.println("<h1>Company: "+ con1.getInitParameter("Company") + "</h1>");
		out.println("Venue: "+ con1.getInitParameter("Venue"));
		out.println("Training: "+ con1.getInitParameter("Training"));
		
		
		out.println("<h1>Company: "+ getServletConfig().getInitParameter("Company") + "</h1>");
		out.println("Venue: "+ getServletConfig().getInitParameter("Venue"));
		out.println("Training: "+ getServletConfig().getInitParameter("Training"));
		
	}
}
