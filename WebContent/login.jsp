<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet"  href="./css/bootstrap.min.css">
<title>Youth Outreach Initiative</title>
</head>
<body>
<jsp:include page="_header.jsp"></jsp:include>
<div class="container">
  <div class="jumbotron">
    <h1>Sign In</h1> 
    <p></p> 
  </div>
  <div style="width: 30%; margin: auto" >
	  <ul class="nav nav-tabs">
		  <li><a href="#">Student</a><!--<jsp:include page="./_studentForm.jsp"></jsp:include>--></li>
		  <li><a href="#">Parent</a><!--<jsp:include page="./_parentForm.jsp"></jsp:include>--></li>
		  <li><a href="#">Educator</a></li>
	  </ul>
      <!--<form>
		  <div class="form-group">
		    <label for="exampleInputEmail1">Student Email</label>
		    <input type="email" class="form-control" id="inputEmail" placeholder="Student email">
		  </div>
		  <div class="form-group">
		    <label for="exampleInputEmail1">Class ID</label>
		    <input type="text" class="form-control" id="inputClassID" placeholder="Class ID">
		  </div>
		  <div class="form-group">
		    <label for="exampleInputPassword1">Password</label>
		    <input type="password" class="form-control" id="inputPassword" placeholder="Password">
		  </div>
		  <button type="reset" class="btn btn-default">Reset</button>
		  <button type="submit" class="btn btn-default">Submit</button>
		  <a href="./_parentSign-In.jsp"><span class="btn btn-default">Parent Sign In</span></a>
		  <br/><br/>
		  <p>Not a member? Sign up <a href="./signUp.jsp"><span></span>here.</a></p>
	  </form>-->
  </div>

</div>

</body>
</html>