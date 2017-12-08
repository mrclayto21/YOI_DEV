package Authentication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserBean user;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try{
			user = new UserBean(); 
			user.setEmail(request.getParameter("email"));
			user.setPassword(request.getParameter("password"));
			String type = request.getParameter("type");
			user.setType(type);
			user = UserDAO.validUser(user);
			if (user.getValidUser() == true){
				HttpSession session = request.getSession(true);
				session.setAttribute("user", user);
				session.setAttribute("currentUser", user.getFirstName());
				response.sendRedirect("success.jsp");
			}else {
				System.out.println("invalid login");
				PrintWriter temp = response.getWriter(); 
				temp.println("<script type=\"text/javascript\">");
				temp.println("alert('email or password is incorrect');");
				temp.println("</script>");
				response.sendRedirect("login.jsp");
			}

		}catch (Throwable exc){
			System.out.println(exc);
		}
	}//end do get

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
