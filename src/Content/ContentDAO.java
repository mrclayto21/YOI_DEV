package Content;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Authentication.UserUtil;

public class ContentDAO {
	private static Connection dbConn;
	private static Statement stmt; 
	private static ResultSet rs; 
	
	public ContentDAO() {
		dbConn = UserUtil.getConnection(); 
	}//end content
	
	public static ArrayList<ContentBean> returnAllLessons(){
		dbConn = UserUtil.getConnection(); 
		ArrayList<ContentBean> lessonList = new ArrayList<ContentBean>();
		try {
			stmt = dbConn.createStatement(); 
			rs = stmt.executeQuery("select * from lessonplan"); 
			while (rs.next()){
				ContentBean content = new ContentBean(); 
				content.setLesson_id(rs.getInt("LESSON_ID"));
				content.setModule_name(rs.getString("MODULE_NAME").trim());
				content.setLesson_Name(rs.getString("LESSON_NAME").trim());
				content.setLesson_description(rs.getString("LESSON_DESCRIPTION").trim());
				content.setImgLink(rs.getString("imgLink"));
				content.setContent_one(rs.getString("content_one"));
				content.setContent_two(rs.getString("content_two"));
				content.setContent_three(rs.getString("content_three"));
				lessonList.add(content);
			}//while
		} catch (Exception e){
			System.out.println("Error retrieving lessons\n");
			e.printStackTrace();
		}
		return lessonList;
	}
}
