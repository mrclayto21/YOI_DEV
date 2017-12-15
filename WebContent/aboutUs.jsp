<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@include file="_header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	  <meta charset="utf-8">
	   <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet"  href="./css/bootstrap.css">
	  <script src="https://apis.google.com/js/platform.js" async defer></script>
	  <meta name="google-signin-client_id" content="962796513505-97l0nomavgmo8m4v45jse3025ef4a5r8.apps.googleusercontent.com.apps.googleusercontent.com">
	  <title>Youth Outreach Initiative</title>
</head>
	<body>
	<jsp:include page="_YOIContainer.jsp"></jsp:include>
	
	<div class="container">
	<h3 class="text-center">This site was built using Java, JS, and JSP Servlets. <small>(circa 1997)</br>
	It runs using Eclipse, hostility, and Apache Tomcat v.7</small></h3>
	<p>Other dependencies include:
	<ul>
		<li>Gson Library: Google's version of Json</li>
		<li>jConnector: JDBC API, for the database connection.</li>
		<li>A Mysql DBMS: <i>for the database</i></li>
	</ul>
	</p>
	</br>
	<p>The intention of this site was to be a useful tool to middle school educators to 
	introduce their students to small scale coding.</p>
	<strong>That did not happen.</strong>
	<p>Future developments could include the following improvements</p>
	<ul>
		<li>Check your understanding quizzes at the conclusion of each lesson. (With data validation) </li>
		<li>An active student progress portal that allows the student, parents, and educators to view the progress of the students</br> 
		they are responsible for in real time.</li>
		<li>Expanded lesson, with actual content.</li>
	</ul>
	</div>
	</body>
</html>