<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
    <%@include file="_header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet"  href="bootstrap.css">
	  
	<title>Youth Outreach Initiative</title>
</head>
<body>
<div class="container">
  <div class="jumbotron">
    <h1>Youth Outreach Initiative</h1> 
    <p> {insert mission statement}</p> 
  </div>
... 
</div>
<!-- Carousel example For updates an information -->

<div style="width:90%">
<jsp:include page="_contentContainers.jsp"></jsp:include>
</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>