package Content;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Authentication.UserUtil;

public class ContentDAO {
	private static Connection dbConn;
	private static Statement stmt; 
	private static ResultSet rs; 
	
	public ContentDAO() {
		dbConn = UserUtil.getConnection(); 
	}//end content
	
	public static ContentBean returnAllLessons() throws SQLException{
		ContentBean bean = new ContentBean(); 
		System.out.println("before try");
		rs = null; 
		try{
			System.out.println("enter try");
			String getLessons = "select * from LESSONPLAN"; 
			dbConn = UserUtil.getConnection();
			rs = stmt.executeQuery(getLessons);
			System.out.println("I hate you");
			if(rs.first()){
				System.out.println("reached here");
				bean.setSuccessfullPull(true);
				bean.setLesson_id("LESSON_ID");
				bean.setModule_name("MODULE_NAME");
				bean.setLesson_Name("LESSON_NAME");
				bean.setLesson_description("LESSON_DESCRIPTION");
				bean.setImgLink("IMGLINK");
				bean.setContent_one("CONTENT_ONE");
				bean.setContent_two("CONTENT_TWO");
				bean.setContent_three("CONTENT_THREE");
			}
		} catch (Exception e){
			System.out.println("Error retrieving lessons: \n" + e.getMessage());
		}
		
		return bean;
	}
}
