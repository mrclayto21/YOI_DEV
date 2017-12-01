<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<script type="text/javascript" src="./js/common.js"></script>
	<form method="post" id="stuform" action="login" onsubmit= "return stuLogValidate()">
	  <div class="form-group">
	    <label for="studentEmail">Student Email</label>
	    <input id = "email" type="email" class="form-control" name="studentEmail" placeholder="Student email">
	  </div>
	  <div class="form-group">
	    <label for="studentPass">Password</label>
	    <input id = "password" type="password" class="form-control" name="studentPass" placeholder="Password">
	  </div>
	  <button type="reset" class="btn btn-default">Reset</button>
	  <button type="submit" id="login" class="btn btn-default">Submit</button>
	  <br/><br/>
	  <p>Not a member? Sign up <a href="./signUp.jsp"><span></span>here.</a></p>
	 </form>
</body>
</html>