import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/** 
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
	final private String user = "admin"; 
	final private String pass = "password"; 
 
	
	//test values
	
	public static void main(String[] args){
		Database foo = new Database(); 
		try {
			foo.readDatabase();
		} catch (Exception e) {
		 	// TODO Auto-generated catch block
			System.out.println("here 1");
			e.printStackTrace();
		}
	}//end main
	
	public void readDatabase() throws Exception{
		try{
			Class.forName("com.mysql.jdbc.Driver"); 
			con = DriverManager.getConnection(host, user, pass);
			sta = con.createStatement(); 
			System.out.println("successful connection");
			ResultSet rs = sta.executeQuery("select * from parent;");
			while (rs.next()){
				System.out.println(rs.getString(1));
			}
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
