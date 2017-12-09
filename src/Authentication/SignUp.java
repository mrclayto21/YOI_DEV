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
		System.out.println("here");
		try{
			user = new UserBean(); 
			String type = request.getParameter("type");
			user.setType(type);
			System.out.println(user.getType());
			if (type.equals("student")){
				System.out.println("student");
				//set user values
				user.setClassID(Integer.parseInt(request.getParameter("class_ID").trim()));
				user.setParentID(Integer.parseInt(request.getParameter("parent_ID").trim()));
				user.setGrade_level(Integer.parseInt(request.getParameter("gradelevel").trim()));
				user.setLastName(request.getParameter("lastName").trim());
				user.setFirstName(request.getParameter("firstName").trim());
				user.setPassword(request.getParameter("password").trim());
				user.setEmail(request.getParameter("email").trim().toLowerCase());
				user.setAge(Integer.parseInt(request.getParameter("age").trim()));
				user.setAddress(request.getParameter("zip").trim());
				user = UserDAO.createStudent(user);
				if (user.getValidUser() == true){
					HttpSession session = request.getSession(true); 
					session.setAttribute("user", user);
					session.setAttribute("currentUser", user.getFirstName());
					session.setAttribute("userType", user.getType());
					response.sendRedirect("success.jsp");
				} else {
					System.out.println("There was an error signing up. ");
					PrintWriter temp = response.getWriter(); 
					temp.println("<script type\"text/javascript\">");
					temp.println("alert('There was an error with logging your session');"); 
					temp.println("</script>");
					response.sendRedirect("signUp.jsp");
				}
			}
			else if (type.equals("parent")){
				System.out.println("hit parent");
				user.setLastName(request.getParameter("lastName"));
				System.out.println(user.getLastName());
				user.setFirstName(request.getParameter("firstName"));
				System.out.println(user.getFirstName());
				user.setEmail(request.getParameter("email").toLowerCase());
				System.out.println(user.getEmail());
				user.setPassword(request.getParameter("password"));
				System.out.println(user.getPassword());
				user.setPhoneNum(Long.parseLong(request.getParameter("phone_num").trim()));
				System.out.println(user.getPhoneNum());
				user.setParConsent(Integer.parseInt(request.getParameter("parental_consent").trim()));
				System.out.println(user.getParConsent());
				user = UserDAO.createParent(user); 
				System.out.println("valid? " + user.getValidUser());
				if (user.getValidUser() == true){
					HttpSession session = request.getSession(); 
					session.setAttribute("user", user);
					session.setAttribute("currentUser", user.getFirstName());
					session.setAttribute("studentInfo", user.getChildInfo());
					session.setAttribute("userType", user.getType());

					response.sendRedirect("success.jsp");
				} else {
					System.out.println("There was an error signing up.");
					PrintWriter temp = response.getWriter();
					response.sendRedirect("signUp.jsp");
				}
			}
			else if (type.equals("educator")){
				System.out.println("educator");
				user.setEmail(request.getParameter("email").trim().toLowerCase());
				user.setPassword(request.getParameter("password").trim());
				user.setClassID(Integer.parseInt(request.getParameter("class_ID").trim()));
				user.setFirstName(request.getParameter("firstName").trim());
				user.setLastName(request.getParameter("lastName").trim());
				user.setSchool(request.getParameter("school").trim());
				user = UserDAO.createEducator(user); 
				if (user.getValidUser() == true){
					HttpSession session = request.getSession();
					session.setAttribute("user", user);
					session.setAttribute("currentUser", user.getFirstName());
					session.setAttribute("allStudents", user.getChildInfo());
					session.setAttribute("userType", user.getType());
					response.sendRedirect("success.jsp");
				}
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
