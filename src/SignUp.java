import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type"); 
		User user = new User(); 
		int result = 0; 
		
		if (type.equalsIgnoreCase("student")) {
			//ints
			String temp = request.getParameter("class_ID");
			int c_id = Integer.getInteger(temp);
			temp = request.getParameter("parent_ID"); 
			int p_id = Integer.getInteger(temp);
			String lname = request.getParameter("lastName"); 
			String fname = request.getParameter("firstName");
			String pass = request.getParameter("password"); 
			String email = request.getParameter("email");
			temp = request.getParameter("age");
			int age = Integer.getInteger(temp);
			String address = request.getParameter("address");
			temp = request.getParameter("gradeLevel"); 
			int grade = Integer.getInteger(temp);
//			int comp = request.getParameter("completed");
			int comp = 0; 
//			int total = request.getParameter("total");
			int total = 0; 
			result = user.createStudent(c_id, p_id, lname, fname, pass, email, age, address, grade, comp, total);
		} 
		else if (type.equalsIgnoreCase("parent")) {
			String lname = request.getParameter("lastName"); 
			String fname = request.getParameter("firstName");
			String pass = request.getParameter("password"); 
			String phone = request.getParameter("phone_num");
			String email = request.getParameter("email");
			String temp = request.getParameter("parental_consent");
			int consent;
			if (temp == "true"){
				consent = 1; 
			}else 
				consent = 0; 
			result = user.createParent(lname, fname, phone, email, consent, pass);
		}
		else if (type.equalsIgnoreCase("educatior")) {
			String lname = request.getParameter("lastName"); 
			String fname = request.getParameter("firstName");
			String pass = request.getParameter("password"); 
			String school = request.getParameter("school_name");
			String email = request.getParameter("email");
			String temp = request.getParameter("assigned_class");
			int as_class = Integer.getInteger(temp);
			int val = 0; 
			result = user.createEducator(lname, fname, email, school, as_class, val, pass);
		}
		if (result == 1){
			response.sendRedirect("./success.jsp");
		}
		
	}// end doPost
}// end signUp