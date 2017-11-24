import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/** 
 * I hate github
 * like really hate it
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
			getTables();
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
	}// end readDatabase
	
	public void getTables() throws SQLException {
		res.getMetaData().getTableName(0);
		while (res.next()){
			System.out.println(res.getString(3));
		}
		
	}// get tables
	public void getColumns() throws SQLException {
		res = con.getMetaData().getColumns(null, null, "%", null);
		while (res.next()){
			System.out.println(res.getString(4));
		}
	}
}//end class
