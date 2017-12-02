<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
    <%@include file="_header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
		  <meta name="viewport" content="width=device-width, initial-scale=1">
		  <link rel="stylesheet"  href="./css/bootstrap.min.css">
		 
	<title>Youth Outreach Initiative</title>
</head>
<body>
<div class="container">
  <div class="jumbotron">
    <h1>Youth Outreach Initiative</h1> 
    <p> {insert mission statement}</p> 
  </div>
  <H1>Welcome <%= request.getSession().getAttribute("currentUser") %> you have successfully registered!</H1>
  <a class="btn btn-success" href="./index.jsp" role="button">Home</a>
</div>

<div style="width:90%">
</div>

</body>
</html>