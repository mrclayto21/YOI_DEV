<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
		<form method="post" id="parform" action="Login?type=parent" onsubmit= "return parValidate()">
		  <div class="form-group">
		    <label for="parentEmail">Parent Email</label>
		    <input id="email" type="email" class="form-control" name="email" placeholder="Parent email">
		  </div>
		  <div class="form-group">
		    <label for="parentPass">Password</label>
		    <input id="password" type="password" class="form-control" name="password" placeholder="Password">
		  </div>
		  <button type="reset" class="btn btn-default">Reset</button>
		  <button type="submit" class="btn btn-default" >Submit</button>
		  <br/><br/>
		  <p>Not a member? Sign up <a href="./signUp.jsp"><span></span>here.</a></p>
	  </form>
</body>
</html>