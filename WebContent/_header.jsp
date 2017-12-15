<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	  <meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <!--<link rel="stylesheet" href="./css/bootstrap.min.css">-->
	<title>Youth Outreach Initiative</title>
</head>
	<body>
	<!-- Navigation bar -->
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
				    <!-- Replace with logo -->
					<a id="homeLogo" class="navbar-brand" href="index.jsp"><img src="https://github.com/mrclayto21/YOI_DEV/blob/master/WebContent/images/Logo_small.png?raw=true" height="30px" width="35px"alt="Youth Outreach Initiative"></a>
				</div>
				<!-- code once solution -->
				<div class="collapse navbar-collapse" id="myNavbar">
			      <ul class="nav navbar-nav">
			        <li ><a href ="index.jsp" >Home</a></li>
			        <li><a href="aboutUs.jsp">Site Progress</a></li>
			      </ul>
			      <ul class="nav navbar-nav navbar-right">
			        <% String u =  (String)request.getSession().getAttribute("currentUser");
			           String t =  (String)request.getSession().getAttribute("type");
			        	if (u == null) {%>
			        	<li><a href="./signUp.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
			        	<li><a href="./login.jsp"><span class="glyphicon glyphicon-log-in" ></span> Login</a></li>
			        <% } else if (t == "parent" || t == "educator"){ %>
			        	<li><a href="./progress.jsp"> View Child's Progress</a></li> 
		        		<li><a href="Logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
			        <% } else {%>
			        	<li><a href="./progress.jsp"><%= request.getSession().getAttribute("currentUser") %>'s Progress</a></li> 
		        		<li><a href="Logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
		        	<% }%>
			      </ul>
			    </div>
			</div>
		</nav>
	</body>
</html>