<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<form id="parentSignUp">
	<!-- email -->
		<div class="form-group">
		    <label for="parentEmail">Parent Email</label>
		    <input id="email"type="email" class="form-control" name="inputEmail" placeholder="Email">
		</div> <!-- email -->
	<!-- password -->
		<div class="form-group">
			<label for="parentPass">Password</label>
			<input id="password" type="password" class="form-control" name="inputPass" placeholder="Password">
		</div><!-- password -->
	<!-- first name -->
		<div class="form-group">
			<label for="firstName">First Name</label>
			<input id = "firstName" type="text" class="form-control" name="firstName" placeholder="First name">
		</div><!-- first name -->
	<!-- last name -->
		<div class="form-group">
			<label for="lastName">Last Name</label>
			<input id ="lastName" type="text" class="form-control" name="lastName" placeholder="Last name">
		</div><!-- last name -->
	<!-- phone number -->
		<div class="form-group">
			<label for="phoneNumber" name="phoneNum">Phone Number</label>
			<input id="phone_num" type="text" class="form-control bfh-phone" data-format="+1 (ddd) ddd-dddd" placeholder="(###) ###-####">
		</div><!-- phone -->
	<!-- consent -->
		<div class="form-group">
			<label for="parentConsent" name="parConsent">Parental Consent <br/> ** Required to allow student to sign-up.</label>
			<input id="parental_consent"type="checkbox" class="form-control" name="parConsent">
		</div><!-- consent -->
	  <button type="reset" class="btn btn-default">Reset</button>
	  <button type="submit" class="btn btn-default">Submit</button>
	  <br/><br/>
	</form>
</body>
</html>