<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<form id="educatorSignUp" method="post" action="SignUp?type=educator" onsubmit="return eduSigValidate()">
	<!-- email -->
		<div class="form-group">
		    <label for="email">Email</label>
		    <input id="email" type="email" class="form-control" name="inputEmail" placeholder="Email">
		</div> <!-- email -->
	<!-- password -->
		<div class="form-group">
			<label for="password">Password</label>
			<input id="password" type="password" class="form-control" name="inputPass" placeholder="Password">
		</div><!-- password -->
	<!-- classes -->
		<div class="form-group">
			<label for="class_ID">Classes <br/>Enter class IDs (#####) delimited by a ';'</label>
			<textarea id="class_ID" class="form-control" rows="5" name="class_ID" placeholder="Enter course titles here"></textarea>
		</div><!-- parent id -->
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
	<!-- school name -->
		<div class="form-group">
			<label for="school">School Name</label>
			<input id="school" type="text" class="form-control" name="schoolName" placeholder="School">
		</div><!-- school name -->
	  <button type="reset" class="btn btn-default">Reset</button>
	  <button type="submit" class="btn btn-default">Submit</button>
	  <br/><br/>
	</form>
</body>
</html>