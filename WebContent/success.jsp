<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
    <%@include file="_header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
		  <meta name="viewport" content="width=device-width, initial-scale=1">
		  <link rel="stylesheet"  href="./css/bootstrap.css">
		 
	<title>Youth Outreach Initiative</title>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<H1>Welcome <%= request.getSession().getAttribute("currentUser") %> you have been successfully registered!</H1>
			<p>Continue to the Home page to view the available lessons.</p>
  			<a class="btn btn-success" href="./index.jsp" role="button">Home</a>
		</div>
	</div>
	
</body>
</html>