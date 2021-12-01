package web07Application;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fs")
public class ServletApplication01 extends HttpServlet{
	private UserValidationService service=new UserValidationService();
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		String userName=req.getParameter("un");
		String password=req.getParameter("pwd");
		//-----------------set attribute--------------------------//
		Boolean isUserValid=service.isUserValid(userName, password);
		
		if(isUserValid) {
			req.setAttribute("un", userName);
			req.setAttribute("pwd", password);
			req.getRequestDispatcher("/WEB-INF/view/welcome.jsp").forward(req, resp);
		}else {
			req.setAttribute("errormessage", "!invalid Certria");
			req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req, resp);
		}
		
	}
}
