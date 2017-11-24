<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<form id="educatorSignUp">
	<!-- email -->
		<div class="form-group">
		    <label for="studentEmail">Student Email</label>
		    <input type="email" class="form-control" name="inputEmail" placeholder="Email">
		</div> <!-- email -->
	<!-- password -->
		<div class="form-group">
			<label for="studentPass">Password</label>
			<input type="password" class="form-control" name="inputPass" placeholder="Password">
		</div><!-- password -->
	<!-- classes -->
		<div class="form-group">
			<label for="classesInput">Classes <br/>Enter classes delimited by a ';'</label>
			<textarea class="form-control" rows="5" name="parentID" placeholder="Enter course titles here"></textarea>
		</div><!-- parent id -->
	<!-- first name -->
		<div class="form-group">
			<label for="firstName">First Name</label>
			<input type="text" class="form-control" name="firstName" placeholder="First name">
		</div><!-- first name -->
	<!-- last name -->
		<div class="form-group">
			<label for="lastName">Last Name</label>
			<input type="text" class="form-control" name="lastName" placeholder="Last name">
		</div><!-- last name -->
	<!-- school name -->
		<div class="form-group">
			<label for="schoolName">School Name</label>
			<input type="text" class="form-control" name="schoolName" placeholder="School">
		</div><!-- school name -->
	<!-- address line 1 -->
	<!-- address line 2 -->
		<div class="form-group">
			<label for="address1">School Address</label>
			<input type="text" class="form-control" name="address1" placeholder="Address">
			<input type="text" class="form-control" name="address2" placeholder="Apt #">
		</div><!-- address -->
	<!-- city -->
		<div class="form-group">
			<label for="stuCity">City</label>
			<input type="text" class="form-control" name="stuCity" placeholder="City">
		</div><!-- city -->
	<!-- state -->
		<div class="form-group">
			<label for="stuState">State</label>
			<br/><div class="btn-group"><br/><button class="btn btn-secondary btn-sm dropdown-toggle" type="button" data-toggle="dropdown" name="classDropDown">Select Your State</button>
			<br/><div class="dropdown-menu" aria-labelby="stateDropDown"></div></div><!-- State Drop Down -->
		</div><!-- state -->
	<!-- zip -->
		<div class="form-group">
			<label for="stuZip">Zip</label>
			<input type="text" class="form-control" name="stuZip" placeholder="Zip">
		</div><!-- zip -->
	</form>
</body>
</html>