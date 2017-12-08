package Authentication;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserBean user; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
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
			String type = request.getParameter("type");
			user.setType(type);
			if (type == "student"){
				//set user values
				user.setClassID(request.getParameter("class_ID"));
				user.setParentID(request.getParameter("parent_ID"));
				user.setGrade_level(request.getParameter("gradelevel"));
				user.setLastName(request.getParameter("lastName"));
				user.setFirstName(request.getParameter("firstName"));
				user.setPassword(request.getParameter("password"));
				user.setEmail(request.getParameter("email"));
				user.setAge(request.getParameter("age"));
				user.setAddress(request.getParameter("zip"));
			}
			else if (type == "parent"){
				user.setLastName(request.getParameter("lastName"));
				user.setFirstName(request.getParameter("firstName"));
				user.setEmail(request.getParameter("email"));
				user.setPassword(request.getParameter("password"));
				user.setPhoneNum(request.getParameter("phone_num"));
				user.setParConsent(request.getParameter("parental_consent"));
			}
			else if (type == "educator"){
				user.setEmail(request.getParameter("email"));
				user.setPassword(request.getParameter("password"));
				user.setClassID(request.getParameter("class_ID"));
				user.setFirstName(request.getParameter("firstName"));
				user.setLastName(request.getParameter("lastName"));
				user.setSchool(request.getParameter("school"));
			}
		} catch (Exception e){
			System.out.println("um, error here: " + e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
