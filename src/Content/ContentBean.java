package Content;


public class ContentBean {
	
	public ContentBean(int lesson_id, String lesson_Name, String lesson_description, String imgLink, String content_one, String content_two, String content_three){
		this.setLesson_id(lesson_id);
		this.setLesson_Name(lesson_Name);
		this.setLesson_description(lesson_description);
		this.setImgLink(imgLink);
		this.setContent_one(content_one);
		this.setContent_two(content_two);
		this.setContent_three(content_three);
	}
	public ContentBean() {
		
	}
	
	private int lesson_id; 
	private String module_name; 
	private String lesson_Name; 
	private String lesson_description; 
	private String imgLink; 
	private String content_one; 
	private String content_two; 
	private String content_three; 

	public int getLesson_id() {
		return lesson_id;
	}
	public String getModule_name() {
		return module_name;
	}
	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}
	public String getImgLink() {
		return imgLink;
	}
	public void setImgLink(String imgLink) {
		this.imgLink = imgLink;
	}
	public void setLesson_id(int lesson_id) {
		this.lesson_id = lesson_id;
	}
	public String getLesson_Name() {
		return lesson_Name;
	}
	public void setLesson_Name(String lesson_Name) {
		this.lesson_Name = lesson_Name;
	}
	public String getLesson_description() {
		return lesson_description;
	}
	public void setLesson_description(String lesson_description) {
		this.lesson_description = lesson_description;
	}
	public String getContent_one() {
		return content_one;
	}
	public void setContent_one(String content_one) {
		this.content_one = content_one;
	}
	public String getContent_two() {
		return content_two;
	}
	public void setContent_two(String content_two) {
		this.content_two = content_two;
	}
	public String getContent_three() {
		return content_three;
	}
	public void setContent_three(String content_three) {
		this.content_three = content_three;
	} 
	
}
