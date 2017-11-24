import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class User {
	private Connection dbConn; 
	private PreparedStatement pStmt; 
	
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
	public User() {
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
	public String validUser(String email, String password, String type){
		String uName = null;  
		try {
			if (type == "student"){
				pStmt = dbConn.prepareStatement(SEL_STUD); 
				pStmt = setString(1, email); 
				pStmt = setString(2, password);
				ResultSet rs = pStmt.executeQuery(); 
				while (rs.next()){
					uName = rs.getString("FIRSTNAME"); 
				}//end while
			}else if (type == "parent"){
				pStmt = dbConn.prepareStatement(SEL_PARE); 
				pStmt = setString(1, email); 
				pStmt = setString(2, password);
				ResultSet rs = pStmt.executeQuery(); 
				while (rs.next()){
					uName = rs.getString("FIRSTNAME"); 
				}//end while
			}else if (type == "educator"){
				pStmt = dbConn.prepareStatement(SEL_EDUC); 
				pStmt = setString(1, email); 
				pStmt = setString(2, password);
				ResultSet rs = pStmt.executeQuery(); 
				while (rs.next()){
					uName = rs.getString("FIRSTNAME"); 
				}//end while
			}
			else {
				System.out.println("no type set");
			}
		} catch (Exception e){
			System.err.println(e.getMessage());
		}//end catch
		return uName; 
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
		try {
			pStmt = dbConn.prepareStatement(INS_STUD); 
			pStmt.setInt(1, class_ID);
			pStmt.setInt(2, parent_ID);
			pStmt.setString(3, lastName);
			pStmt.setString(4, firstName);
			pStmt.setString(5, password);
			pStmt.setString(6, email);
			pStmt.setInt(7, age);
			pStmt.setString(8, address);
			pStmt.setInt(9, grade_level);
			pStmt.setInt(10, completed);
			pStmt.setInt(11, total);
			res = pStmt.executeUpdate(); 
		} catch (Exception e){
			System.err.println(e.getMessage());
		}
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
		try {
			pStmt = dbConn.prepareStatement(INS_PARE); 
			pStmt.setString(1, lastName);
			pStmt.setString(2, firstName);
			pStmt.setString(6, password);
			pStmt.setString(3, phone_num);
			pStmt.setString(4, email);
			pStmt.setInt(5, parental_consent);
			res = pStmt.executeUpdate(); 
		} catch (Exception e){
			System.err.println(e.getMessage());
		}
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
	public int createEducator(String lastName, String firstName, String email, String school_name, int assigned_class, int validation_flag, String password){
		int res = 0; 
		try { 
			pStmt = dbConn.prepareStatement(INS_EDUC); 
			pStmt.setString(1, lastName);
			pStmt.setString(2, firstName);
			pStmt.setString(3, email);
			pStmt.setString(4, school_name);
			pStmt.setInt(5, assigned_class);
			pStmt.setInt(6, validation_flag);
			pStmt.setString(7, password);
			res = pStmt.executeUpdate();
		} catch (Exception e){
			System.err.println(e.getMessage());
		}
		return res; 
	}
}
