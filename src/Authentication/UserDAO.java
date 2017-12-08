package Authentication;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class UserDAO {
	private static Connection dbConn; 
	private static Statement stmt; 
	private static ResultSet rs; 
	
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
			System.out.println("Logging error \n" + e.getMessage());
		}
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
	public UserBean createStudent(UserBean bean){
		//student_id, class_id, parent_id, lastname, firstname, password, email, age
		//address, grade_level, completed, total
		String type = bean.getType();
		String class_id = bean.getClassID(); 
		String parent_id = bean.getParentID(); 
		String lastname = bean.getLastName(); 
		String firstname = bean.getFirstName(); 
		String password = bean.getPassword(); 
		String email = bean.getEmail(); 
		String age = bean.getAge(); 
		String address = bean.getAddress(); 
		String grade_level = bean.getGrade_level(); 
		String completed = bean.getCompleted(); 
		String total = bean.getTotal(); 
		rs = null; 
		
		try {
			String insert = "insert into STUDENT (CLASS_ID, PARENT_ID, LASTNAME, FIRSTNAME, PASSWORD, EMAIL, AGE, ADDRESS, GRADE_LEVEL, COMPLETED, TOTAL, TYPE) "
					+ "VALUES (" + class_id + ", " + parent_id + ", " + lastname + ", " + firstname + ", " + password + ", "
					+ email + ", " + age + ", " + address + ", " + grade_level + ", 0, 0, " + type + ")";
			dbConn = UserUtil.getConnection(); 
			stmt = dbConn.createStatement();
			rs = stmt.executeQuery(insert); 
			System.out.println("Inserting Student: " + rs.next());
		} catch (Exception e){
			System.out.println("Error inserting student record \n" + e.getMessage());
		}
		return bean;
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
	public UserBean createParent(UserBean bean){
		String type = bean.getType(); 
		String lastname = bean.getType(); 
		String firstname = bean.getType();
		String email = bean.getEmail(); 
		String password = bean.getEmail(); 
		String phone = bean.getEmail(); 
		String consent = bean.getParConsent(); 
		rs = null; 
		
		try {
			String insert = "insert into PARENT(LASTNAME, FIRSTNAME, EMAIL, PASSWORD, PHONE_NUM, PARENTAL_CONSENT, TYPE)"
					+ "VALUES (" + lastname + "," + firstname + ", " + email + ", " + password + ", " + phone + ", " + consent + ", " + type + ")";
			dbConn = UserUtil.getConnection(); 
			stmt = dbConn.createStatement(); 
			rs = stmt.executeQuery(insert); 
			System.out.println("Inserting Parent: " + rs.next());
		} catch (Exception e){
			System.out.println("Error inserting parent record \n" + e.getMessage());
		}
		return bean;
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
	public UserBean createEducator(UserBean bean){
		String type = bean.getType(); 
		String lastname = bean.getType(); 
		String firstname = bean.getType(); 
		String email = bean.getType(); 
		String password = bean.getType();
		String school = bean.getSchool(); 
		String assigned = bean.getAssignment(); 
		String validation = bean.getValidation(); 
		rs = null; 
		
		try {
			String insert = "insert into EDUCATOR(LASTNAME, FIRSTNAME, EMAIL, PASSWORD, SCHOOL_NAME, ASSIGNED_CLASS, VALIDATION_FLAG, TYPE)"
					+ "VALUES(" + lastname + ", " + firstname + ", " + email + ", " + password + ", " + school + ", " + assigned + ", " + validation + ", " + type + ")";
			dbConn = UserUtil.getConnection(); 
			stmt = dbConn.createStatement(); 
			rs = stmt.executeQuery(insert); 
			System.out.println("Inserting Educator: " + rs.next());
		} catch (Exception e){
			System.out.println("Error inserting educator record \n" + e.getMessage());
		}
		return bean;
	}
}
