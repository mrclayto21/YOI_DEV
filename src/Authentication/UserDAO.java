package Authentication;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class UserDAO {
	private static Connection dbConn; 
	private static Statement stmt; 
	private static ResultSet rs; 
	
	//QUERIES
	//student select & insert
	private String SEL_STUD = "SELECT FIRSTNAME FROM STUDENT WHERE EMAIL = ?  AND PASSWORD = ?";
	private String INS_STUD = "INSERT INTO STUDENT (CLASS_ID, PARENT_ID, LASTNAME, FIRSTNAME, PASSWORD, EMAIL, AGE, ADDRESS, GRADE_LEVEL, COMPLETED, TOTAL) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
	//parent select & insert
	private String SEL_PARE = "SELECT FIRSTNAME FROM STUDENT WHERE EMAIL = ?  AND PASSWORD = ?";
	private String INS_PARE = "INSERT INTO PARENT(LASTNAME, FIRSTNAME, PHONE_NUM, EMAIL, PARENTAL_CONSENT) VALUES (?,?,?,?,?)"; 
	//educator select & insert
	private String SEL_EDUC = "SELECT FIRSTNAME FROM STUDENT WHERE EMAIL = ?  AND PASSWORD = ?";
	private String INS_EDUC = "INSERT INTO EDUCATOR (LASTNAME, FIRSTNAME, EMAIL, SCHOOL_NAME, ASSIGNED_CLASS, VALIDATION_FLAG, PASSWORD) VALUES (?,?,?,?,?,?,?)";
	
	/**
	 * validates or creates a new user
	 */
	public UserDAO() {
		dbConn = UserUtil.getConnection();
	}//end user
	
	/** 
	 * Checks logins for three types: Student, Parent, Educator
	 * @param email -- user defined
	 * @param password -- user defined
	 * @param type -- application defined
	 * @return Name of the user if successful
	 * @error set string is not inserting the user defined email and password; 
	 */
	public static UserBean validUser(UserBean bean){
		String email = bean.getEmail();
		String password = bean.getPassword();
		String type = bean.getType();
		String firstName = null; 
		rs = null;
		
		try {
			if (type.equals("student")){
				String select= "select * from student where email = '" + email + "' AND password = '" + password + "'";
				dbConn = UserUtil.getConnection(); 
				stmt = dbConn.createStatement(); 
				rs = stmt.executeQuery(select); 
				System.out.println("first "+ rs.first());
				if (!rs.first()){
					bean.setValidUser(false);
				}else if (rs.first()){
					bean.setValidUser(true);
					firstName = rs.getString("firstName");
					bean.setFirstName(rs.getString("firstName"));
					System.out.println("logging session for " + firstName );
				}
			}
		} catch (Exception e){
			System.out.println("Loging error \n" + e.getMessage());
		}
//		try {
//			if (type == "student"){
//				stmt = dbConn.prepareStatement(SEL_STUD); 
//				stmt.setString(1, email); 
//				stmt.setString(2, password);
//				ResultSet rs = stmt.executeQuery(); 
//				while (rs.next()){
//					firstName = rs.getString("FIRSTNAME"); 
//					bean.setFirstName(firstName);
//				}//end while
//			}else if (type == "parent"){
//				stmt = dbConn.prepareStatement(SEL_PARE); 
//				stmt.setString(1, email); 
//				stmt.setString(2, password);
//				ResultSet rs = stmt.executeQuery(); 
//				while (rs.next()){
//					firstName = rs.getString("FIRSTNAME"); 
//					bean.setFirstName(firstName);
//				}//end while
//			}else if (type == "educator"){
//				stmt = dbConn.prepareStatement(SEL_EDUC); 
//				stmt.setString(1, email); 
//				stmt.setString(2, password);
//				ResultSet rs = stmt.executeQuery(); 
//				while (rs.next()){
//					firstName = rs.getString("FIRSTNAME");
//					bean.setFirstName(firstName);
//				}//end while
//			}
//			else {
//				System.out.println("no type set");
//			}
//		} catch (Exception e){
//			System.err.println(e.getMessage());
//		}//end catch
		return bean; 
	}//end validUser
	
	/**
	 * Creates a student user 
	 * @param class_ID -- sets the instructor
	 * @param parent_ID -- sets parental consent
	 * @param lastName -- user defined
	 * @param firstName -- user defined
	 * @param password -- user defined
	 * @param email -- user defined
	 * @param age -- user defined
	 * @param address -- user defined
	 * @param grade_level -- user defined
	 * @param completed -- application defined
	 * @param total -- application defined
	 * @return
	 */
	//private String INS_STUD = "INSERT INTO STUDENT (CLASS_ID, PARENT_ID, LASTNAME, FIRSTNAME, PASSWORD, EMAIL, AGE, ADDRESS, GRADE_LEVEL, COMPLETED, TOTAL) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
	public int createStudent(int class_ID, int parent_ID, String lastName, String firstName, String password, String email, int age, String address, int grade_level, int completed, int total){
		int res = 0; 
//		try {
//			stmt = dbConn.prepareStatement(INS_STUD); 
//			stmt.setInt(1, class_ID);
//			stmt.setInt(2, parent_ID);
//			stmt.setString(3, lastName);
//			stmt.setString(4, firstName);
//			stmt.setString(5, password);
//			stmt.setString(6, email);
//			stmt.setInt(7, age);
//			stmt.setString(8, address);
//			stmt.setInt(9, grade_level);
//			stmt.setInt(10, completed);
//			stmt.setInt(11, total);
//			res = stmt.executeUpdate(); 
//		} catch (Exception e){
//			System.err.println(e.getMessage());
//		}
		return res;
	}//end createStudent
	
	/**
	 * Creates a parent user to track student progress
	 * required to create a child 
	 * @param lastName -- user defined
	 * @param firstName -- user defined
	 * @param password -- user defined
	 * @param phone_num -- user defined
	 * @param email -- user defined
	 * @param parental_consent -- user defined
	 * @return name of the parent upon success
	 */
	//private String INS_PARE = "INSERT INTO PARENT(LASTNAME, FIRSTNAME, PHONE_NUM, EMAIL, PARENTAL_CONSENT) VALUES (?,?,?,?,?)"; 
	public int createParent(String lastName, String firstName, String phone_num, String email, int parental_consent, String password){
		int res = 0; 
//		try {
//			stmt = dbConn.prepareStatement(INS_PARE); 
//			stmt.setString(1, lastName);
//			stmt.setString(2, firstName);
//			stmt.setString(6, password);
//			stmt.setString(3, phone_num);
//			stmt.setString(4, email);
//			stmt.setInt(5, parental_consent);
//			res = stmt.executeUpdate(); 
//		} catch (Exception e){
//			System.err.println(e.getMessage());
//		}
		return res;
	}//end createParent
	
	/**
	 * Creates an educator 
	 * oversees progress of everyone in their defined class_id
	 * @param lastName -- user defined
	 * @param firstName -- user defined
	 * @param email -- user defined
	 * @param school_name -- user defined
	 * @param assigned_class -- user defined
	 * @param validation_flag -- application defined
	 * @param password -- user defined
	 * @return name of the educator upon success
	 */
	//private String INS_EDUC = "INSERT INTO EDUCATOR (LASTNAME, FIRSTNAME, EMAIL, SCHOOL_NAME, ASSIGNED_CLASS, VALIDATION_FLAG, PASSWORD) VALUES (?,?,?,?,?,?,?)";
	public static int createEducator(String lastName, String firstName, String email, String school_name, int assigned_class, int validation_flag, String password){
		int res = 0; 
//		try { 
//			stmt = dbConn.prepareStatement(INS_EDUC); 
//			stmt.setString(1, lastName);
//			stmt.setString(2, firstName);
//			stmt.setString(3, email);
//			stmt.setString(4, school_name);
//			stmt.setInt(5, assigned_class);
//			stmt.setInt(6, validation_flag);
//			stmt.setString(7, password);
//			res = stmt.executeUpdate();
//		} catch (Exception e){
//			System.err.println(e.getMessage());
//		}
		return res; 
	}
}
