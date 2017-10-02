import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/** 
 * adding comment to test push
 * Connection strings
 * @author mrclaytor
 *
 */
public class Database {
	private Connection con = null; 
	private Statement sta = null; 
	private PreparedStatement pre = null ;
	private ResultSet res = null; 
	
	final private String host = "jdbc:mysql://localhost:3306/YOI_DEV"; 
	final private String user = "root"; 
	final private String pass = "root"; 
	
	//test values
	final private String q1 = "SELECT * FROM YOI_DEV.STUDENT"; 
	final private String q2 = "INSERT INTO YOI_DEV.LESSONPLAN VALUES (0, 1, 2, 3)"; 
	final private String q3 = "SELECT * FROM YOI_DEV.LESSONPLAN"; 
	
	public static void main(String[] args){
		Database foo = new Database(); 
		try {
			foo.readDatabase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//end main
	
	public void readDatabase() throws Exception{
		try{
			Class.forName("com.mysql.jdbc.Driver"); 
			con = DriverManager.getConnection(host + "?" + "user=" + user + "&password=" + pass);
			sta = con.createStatement(); 
			
			//testing query 
			res = sta.executeQuery(q1);
			getResultSet(res);
			pre = con.prepareStatement(q3);
			res = pre.executeQuery(); 
			getResultSet(res); 
			getData(res); 
			
		}catch (Exception e){//connection failed
			System.out.println("Exception thrown: \n" + e.getMessage());
		} finally { 
			if (res != null){
				res.close();
			}
			if (sta != null){
				sta.close();
			}
			if (con != null){
				con.close();
			}
		}
	}
/**
 * testing table connection
 * to be deleted
 * @param res2
 * @throws SQLException
 */
	private void getData(ResultSet res2) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("\nTesting:");
		System.out.println("T " + res2.getMetaData().getTableName(1));
		for(int i = 1; i <= res2.getMetaData().getColumnCount(); i++){
			System.out.println("C " + i + " " + res2.getMetaData().getColumnName(i)); 
		}
	}
/**
 * testing data out 
 * to be deleted
 * @param res2
 * @throws SQLException
 */
	private void getResultSet(ResultSet res2) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Data Values");
		while (res2.next()){
			int id = res2.getInt("LESSON_ID"); 
			String mn = res2.getString("MODULE_NAME"); 
			String ln = res2.getString("LESSON_NAME");
			String ld = res2.getString("LESSON_DESCRIPTION");
			System.out.format("%s, %s, %s, %s\n", id, mn, ln, ld);
		}
	}
}//end class
