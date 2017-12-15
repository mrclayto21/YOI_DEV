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
				content.setModule_name(rs.getString("MODULE_NAME"));
				content.setLesson_Name(rs.getString("LESSON_NAME"));
				content.setLesson_description(rs.getString("LESSON_DESCRIPTION"));
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
	
	public static ArrayList<ContentBean> getSingleLesson(ContentBean bean){
		ArrayList<ContentBean> lessonList = new ArrayList<ContentBean>();
		int id = bean.getLesson_id();
		dbConn = UserUtil.getConnection();  
		try {
			stmt = dbConn.createStatement(); 
			rs = stmt.executeQuery("select * from lessonplan where lesson_ID =" + id);
			while (rs.next()){
				bean.setLesson_id(rs.getInt("LESSON_ID"));
				bean.setLesson_Name(rs.getString("LESSON_NAME").trim());
				bean.setModule_name(rs.getString("MODULE_NAME").trim());
				bean.setLesson_description(rs.getString("LESSON_DESCRIPTION").trim());
				bean.setContent_one(rs.getString("CONTENT_ONE").trim());
				bean.setContent_two(rs.getString("CONTENT_TWO").trim());
				bean.setContent_three(rs.getString("CONTENT_THREE").trim());
				bean.setSummary_one(rs.getString("SUMMARY_ONE").trim());
				bean.setSummary_two(rs.getString("SUMMARY_TWO").trim());
				bean.setSummary_three(rs.getString("SUMMARY_THREE").trim());
				lessonList.add(bean);
			}
		} catch (Exception e) {
			System.out.println("Error retrieving lesson\n");
			e.printStackTrace();
		}
		return lessonList;
	}
}
