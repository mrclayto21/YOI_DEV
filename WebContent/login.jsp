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
  <div style="width: 70%; margin: auto" >
	  <ul class="nav nav-tabs">
		  <li style="margin:10px"><a href="#">Student</a><jsp:include page="./_studentForm.jsp"></jsp:include></li>
		  <li style="margin:10px"><a href="#">Parent</a><jsp:include page="./_parentForm.jsp"></jsp:include></li>
		  <li style="margin:10px"><a href="#">Educator</a>Educator sign-in</li>
	  </ul>
  </div>

</div>

</body>
</html>