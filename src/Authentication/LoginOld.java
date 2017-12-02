package Authentication;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginOld extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		String err; 
//		String email = request.getParameter("email"); 
//		String pass = request.getParameter("password");
//		String type = request.getParameter("type");
//		HttpSession session = request.getSession();
//		UserDAO user = new UserDAO(); 
//		
//		String uName = user.validUser();
//		
//		if (uName == null){
//			err = "Invalid email or password"; 
//			System.out.println(err);
//			session.setAttribute("error", err);
//			response.sendRedirect("login.jsp");
//		} else {
//			System.out.println("success");
//			session.setAttribute("user", uName);
//			response.sendRedirect("index.jsp");
//		}//end if 
	}//end doPost
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		try{
			UserBean user = new UserBean(); 
			user.setEmail(request.getParameter("email"));
			user.setPassword(request.getParameter("password"));
			user.setType(request.getParameter("type"));
			
			user = UserDAO.validUser(user);
			
		}catch (Throwable exc){
			System.out.println(exc);
		}
		
		if("Logout".equalsIgnoreCase(request.getParameter("param"))) {
			HttpSession session = request.getSession(); 
			session.removeAttribute("user");
			session.invalidate();
			response.sendRedirect("index.jsp");
		}//end if
	}//end doGet
}//end login