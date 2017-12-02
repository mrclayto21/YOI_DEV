package Authentication;

public class UserBean {
	private String type; 
	private String email; 
	private String password; 
	private String firstName; 
	private String lastName; 
	private String classID; 
	private String parentID;
	private String age; 
	private String address; 
	private String grade_level; 
	private String completed; 
	private String total; 
	private String phoneNum; 
	private String parConsent; 
	private String school; 
	private String assignment; 
	private String validation;
	private boolean validUser; 
	
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
	public String getClassID() {
		return classID;
	}
	public void setClassID(String classID) {
		this.classID = classID;
	}
	public String getParentID() {
		return parentID;
	}
	public void setParentID(String parentID) {
		this.parentID = parentID;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGrade_level() {
		return grade_level;
	}
	public void setGrade_level(String grade_level) {
		this.grade_level = grade_level;
	}
	public String getCompleted() {
		return completed;
	}
	public void setCompleted(String completed) {
		this.completed = completed;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getParConsent() {
		return parConsent;
	}
	public void setParConsent(String parConsent) {
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
	public String getValidation() {
		return validation;
	}
	public void setValidation(String validation) {
		this.validation = validation;
	} 
	
}
