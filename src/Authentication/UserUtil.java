package Authentication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserUtil {
	private static Connection conn = null; 
	
	public static Connection getConnection(){
		if (conn != null){
			return conn; 
		}else {
			String url = "jdbc:mysql://localhost:3306/YOI_DEV"; 
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url,"admin", "password");
				Statement stmt = conn.createStatement(); 
				System.out.println("DB connection established");
			} catch (Exception e) {
				System.out.println("Connection exception found: " + e.getMessage());
			}//end catch
			return conn;
		}//end else
	}//end getConnection()
}//end UserUtil
