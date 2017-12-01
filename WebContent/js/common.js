/**
 * validates the inputs are not null in student sign in
 * @returns alert if blank values are detected
 */
function stuLogValidate() {
	var email = document.forms["stuform"]["studentEmail"].value;
//	var cID = document.forms["stuform"]["classID"].value;
	var pass = document.forms["stuform"]["studentPass"].value;
	if(email == null || email== ""){
		alert("Email cannot be blank!");
//	}else if (cID == null || cID ==""){
//		alert("Class ID is cannot be blank!");
	}else if (pass == null || pass ==""){
		alert("Password cannot be blank!");
	}
};
/**
 * validates inputs for student sign up form
 * @returns
 */
function stuSigValidate() {
	var parID = document.forms["studentSignUp"]["parent_ID"].value; 
	var classID = document.forms["studentSignUp"]["class_ID"].value;
	var grade = document.forms["studentSignUp"]["gradeLevel"].value;
	var email = document.forms["studentSignUp"]["email"].value;
	var pass = document.forms["studentSignUp"]["password"].value;
	var first = document.forms["studentSignUp"]["firstName"].value;
	var last = document.forms["studentSignUp"]["lastName"].value;
	var age = document.forms["studentSignUp"]["age"].value;
	var add1 = document.forms["studentSignUp"]["address"].value;
	var apt = document.forms["studentSignUp"]["apt"].value;
	var city = document.forms["studentSignUp"]["city"].value;
	var state = document.forms["studentSignUp"]["state"].value;
	var zip = document.forms["studentSignUp"]["zip"].value;
	//check nulls
	if (parID == null || parID == ""){
		alert("Parent ID cannot be null!");
	}
}

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
