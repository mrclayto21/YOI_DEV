package Authentication;

public class UserBean {
	private String type; 
	private String email; 
	private String password; 
	private String firstName; 
	private String lastName; 
	private int classID; 
	private int parentID;
	private int educatorID; 
	private int age; 
	private String address; 
	private int grade_level; 
	private int completed; 
	private int total; 
	private Long phoneNum; 
	private int parConsent; 
	private String school; 
	private String assignment; 
	private int validation;
	private boolean validUser; 
	
	public int getEducatorID() {
		return educatorID;
	}
	public void setEducatorID(int educatorID) {
		this.educatorID = educatorID;
	}
	private String childInfo;
	
	public String getChildInfo() {
		return childInfo;
	}
	public void setChildInfo(String childInfo) {
		this.childInfo = childInfo;
	}
	public boolean getValidUser() {
		return validUser;
	}
	public void setValidUser(boolean b) {
		this.validUser = b;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getClassID() {
		return classID;
	}
	public void setClassID(int classID) {
		this.classID = classID;
	}
	public int getParentID() {
		return parentID;
	}
	public void setParentID(int parentID) {
		this.parentID = parentID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getGrade_level() {
		return grade_level;
	}
	public void setGrade_level(int grade_level) {
		this.grade_level = grade_level;
	}
	public int getCompleted() {
		return completed;
	}
	public void setCompleted(int completed) {
		this.completed = completed;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getParConsent() {
		return parConsent;
	}
	public void setParConsent(int parConsent) {
		this.parConsent = parConsent;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getAssignment() {
		return assignment;
	}
	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}
	public int getValidation() {
		return validation;
	}
	public void setValidation(int validation) {
		this.validation = validation;
	} 
	
}
