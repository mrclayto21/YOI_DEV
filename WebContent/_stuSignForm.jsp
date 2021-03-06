<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<form id="studentSignUp" method="post" action="SignUp?type=student" onsubmit="return stuSigValidate()">
		<!-- parent id -->
		<div class="form-group">
			<label for="parentID">Parent ID **</label>
			<input id="parent_ID" type="text" class="form-control" name="parentID" placeholder="Enter a valid parental ID number">
		</div><!-- parent id -->
	<!-- class -->
		<div class="form-group">
			<label for="studentClass">Class</label>
			<input id="class_ID" type="text" class="form-control" name="class_ID" placeholder="Enter a valid class ID">
			<!--<br/><div class="btn-group"><br/><button class="btn btn-secondary btn-sm dropdown-toggle" type="button" data-toggle="dropdown" name="classDropDown">Select Your Class</button>
			<br/><div id="class_ID" class="dropdown-menu" aria-labelby="classDropDown"></div></div>--><!-- Class Drop Down -->
		</div><!-- class -->
    <!-- grade level -->
   		<div class="form-group">
			<label for="studentGrade">Grade Level</label>
			<!--<br/><div class="btn-group"><br/><button class="btn btn-secondary btn-sm dropdown-toggle" type="button" data-toggle="dropdown" name="classDropDown">Select Your Grade</button>-->
			<!--<br/><div id="gradeLevel" class="dropdown-menu" aria-labelby="gradeDropDown"></div></div>--><!-- Class Drop Down -->
			<select class="form-control" id=studentGrade"> 
				<option>8th</option>
				<option>9th</option>
				<option>10th</option>
				<option>11th</option>
				<option>12th</option>
			</select>
		</div><!-- grade -->
	<!-- email -->
		<div class="form-group">
		    <label for="studentEmail">Student Email</label>
		    <input id="email" type="email" class="form-control" name="inputEmail" placeholder="Email">
		</div> <!-- email -->
	<!-- password -->
		<div class="form-group">
			<label for="studentPass">Password</label>
			<input id="password" type="password" class="form-control" name="inputPass" placeholder="Password">
		</div><!-- password -->
	<!-- first name -->
		<div class="form-group">
			<label for="firstName">First Name</label>
			<input id="firstName" type="text" class="form-control" name="firstName" placeholder="First name">
		</div><!-- first name -->
	<!-- last name -->
		<div class="form-group">
			<label for="lastName">Last Name</label>
			<input id="lastName" type="text" class="form-control" name="lastName" placeholder="Last name">
		</div><!-- last name -->
	<!-- age -->
   		<div class="form-group">
   			<label for="studentAge">Age</label>
			<input id="age" type="text" class="form-control" name="stuAge" placeholder="Enter your age">
		</div><!-- student age -->
	<!-- zip -->
		<div class="form-group">
			<label for="stuZip">Zip</label>
			<input id = "zip" type="text" class="form-control" name="stuZip" placeholder="Zip">
		</div><!-- zip -->
	  <button type="reset" class="btn btn-default">Reset</button>
	  <button type="submit" id="SignUp" class="btn btn-default">Submit</button>
	  <br/><br/>
	</form>
</body>
</html>