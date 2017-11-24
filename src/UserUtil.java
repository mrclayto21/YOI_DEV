import java.sql.Connection;
import java.sql.DriverManager;

public class UserUtil {
	private static Connection conn = null; 
	
	public static Connection getConnection(){
		if (conn != null){
			return conn; 
		}else {
			String url = "jdbc:mysql://localhost:3306/YOI_DEV"; 
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url,"root", "root");
			} catch (Exception e) {
				e.printStackTrace();
			}//end catch
			return conn;
		}//end else
	}//end getConnection()
}//end UserUtil
