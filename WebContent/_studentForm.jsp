<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<script type="text/javascript" src="./js/common.js"></script>
	<form method="post" id="stuform" action="Login?type=student" onsubmit= "return stuLogValidate()" autocompleted="on">
	  <div class="form-group">
	    <label for="email">Email</label>
	    <input id = "email" type="email" class="form-control" name="email" placeholder="Email">
	  </div>
	  <div class="form-group">
	    <label for="password">Password</label>
	    <input id = "password" type="password" class="form-control" name="password" placeholder="Password">
	  </div>
	<!--<fieldset disabled>
	  <div class="form-group">
	  <label for ="type"></label>
	  <input id= "type" type="hidden" class="form-control" name="type" value="student">
	  </div>
	  </fieldset>-->
	  <button type="reset" class="btn btn-default">Reset</button>
	  <button type="submit" id="login" class="btn btn-default">Submit</button>
	  <br/><br/>
	  <p>Not a member? Sign up <a href="./signUp.jsp"><span></span>here.</a></p>
	 </form>
</body>
</html>