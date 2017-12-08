/**
 * validates the inputs are not null in student sign in
 * @returns alert if blank values are detected
 */
function stuLogValidate() {
	var email = document.forms["stuform"]["email"].value;
//	var cID = document.forms["stuform"]["classID"].value;
	var pass = document.forms["stuform"]["password"].value;
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
		alert("Parent ID cannot be empty!");
	}else if (class_ID == null || class_ID == ""){
		alert("Select a class to continue!");
	}else if (gradeLevel == null || gradeLevel == ""){
		alert("Select your grade level to continue!");
	}else if (email == null || email == ""){
		alert("Email cannot be empty!");
	}else if (password == null || password == ""){
	alert("Password cannot be empty!");
	}
};

/**
 * validates the inputs are not null in parent sign in
 * @returns alert if blank values are detected
 */
function parValidate() {
	var email = document.forms["parform"]["email"].value;
	var pass = document.forms["parform"]["password"].value;
	if(email == null || email== ""){
		alert("Email cannot be blank!");
	}else if (pass == null || pass ==""){
		alert("Password cannot be blank!");
	}
}; 

/**
 * Validates the inputs in the parent sign up form
 * @returns alert if blank values are detected
 */
function parSigValidate() {
	var email = document.forms["parentSignUp"]["email"].value;
	var pass = document.forms["parentSignUp"]["password"].value;
	var first = document.forms["parentSignUp"]["firstName"].value;
	var last = document.forms["parentSignUp"]["lastName"].value;
	var phone = document.forms["parentSignUp"]["phone_num"].value;
	var consent = document.forms["parentSignUp"]["parental_consent"].value;
	if(email == null || email== ""){
		alert("Email cannot be blank!");
	}else if (pass == null || pass ==""){
		alert("Password cannot be blank!");
	}else if (firstName == null || firstName == ""){
		alert("Your first name cannot be blank!");
	}else if (lastName == null || lastName == ""){
		alert("Your last name cannot be blank!");
	}else if (parental_consent == null || parental_consent == ""){
		alert("You must give parental consent to continue with signup!");
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

/**
 * Validates the inputs in the educator sign up form
 * @returns alert if blank values detected
 */
function eduSigValidate() {
	var email = document.forms["educatorSignUp"]["email"].value;
	var pass = document.forms["educatorSignUp"]["password"].value;
	var class_id = document.forms["educatorSignUp"]["class_ID"].value;
	var first = document.forms["educatorSignUp"]["firstName"].value;
	var last = document.forms["educatorSignUp"]["lastName"].value;
	var school = document.forms["educatorSignUp"]["school"].value;
	var zip = document.forms["educatorSignUp"]["zip"].value;
	
	if(email == null || email== ""){
		alert("Email cannot be blank!");
	}else if (pass == null || pass ==""){
		alert("Password cannot be blank!");
	}else if (class_id == null || class_id ==""){
		alert("You must enter at least one class to continue!");
	}else if (first == null || first ==""){
		alert("Name cannot be blank!");
	}else if (last == null || last ==""){
		alert("Name cannot be blank!");
	}else if (school == null || school ==""){
		alert("School name cannot be blank!");
	}else if (zip == null || zip ==""){
		alert("Zip cannot be blank!");
	}
}

