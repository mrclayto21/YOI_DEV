/**
 * validates the inputs are not null in student sign in
 * @returns alert if blank values are detected
 */
function stuValidate() {
	var email = document.forms["stuform"]["studentEmail"].value;
	var cID = document.forms["stuform"]["classID"].value;
	var pass = document.forms["stuform"]["studentPass"].value;
	if(email == null || email== ""){
		alert("Email cannot be blank!");
	}else if (cID == null || cID ==""){
		alert("Class ID is cannot be blank!");
	}else if (pass == null || pass ==""){
		alert("Password cannot be blank!");
	}
};
/**
 * validates the inputs are not null in parent sign in
 * @returns alert if blank values are detected
 */
function parValidate() {
	var email = document.forms["parform"]["parentEmail"].value;
	var child = document.forms["parform"]["childID"].value;
	var pass = document.forms["parform"]["parentPass"].value;
	if(email == null || email== ""){
		alert("Email cannot be blank!");
	}else if (child == null || child ==""){
		alert("Class ID is cannot be blank!");
	}else if (pass == null || pass ==""){
		alert("Password cannot be blank!");
	}
}; 
/**
 * validates the inputs are not null in educator sign in
 * @returns alert if blank values are detected
 */
function eduValidate() {
	var email = document.forms["edform"]["educatorEmail"].value;
	var pass = document.forms["edform"]["educatorPass"].value;
	if(email == null || email== ""){
		alert("Email cannot be blank!");
	}else if (pass == null || pass ==""){
		alert("Password cannot be blank!");
	}
};

//testing
$(document).ready(function(){
	$("#login").click(function(){
		var email = $("#studentEmail").val(); 
		var sClass = $("#studentClass").val();
		var pass = $("#studentPass").val();
		if(email && pass){
			$.ajax({
				type: "GET", 
				url: ""
			})
		}
	})
})
/**
 * After form validation, this checks to see if the information entered is correct. 
 * If correct, establishes active session.
 * Else, prompts user for input again; 
 * @returns 
 */
function signIn() {
	var user = document.getElementByID("studentEmail").value();
	var stuClass = document.getElementByID("studentClass").value();
	var pass = document.getElementByID("studentPass").value();
	
	var connection = mysql.createConnection({
		host: 'localhost', 
		user: 'root', 
		password: 'root', 
		database: 'YOI_DEV'
	});
	//create connection with error checking
	connection.connect(function(err){
		if (!err){
			console.log("connection created");
		}else {
			console.log("error creating connection"); 
		}
	}); 

};