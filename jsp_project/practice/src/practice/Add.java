package practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Add extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8"); 
		
		PrintWriter out = response.getWriter();
		
		String a = request.getParameter("x");
		String b = request.getParameter("y");
		
		int x = 0;
		int y = 0;
		
		if(!a.equals("")) {
			x = Integer.parseInt(a);
		}
		if(!b.equals("")) {
			y = Integer.parseInt(b);
		}
		
		
		int result = x+y;
		
		out.println("계산 결과: " + result);
		
	}
	
	
	
	
	
}
