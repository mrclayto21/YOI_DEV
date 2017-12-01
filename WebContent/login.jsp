<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"  href="./css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="_header.jsp"></jsp:include>

<div class="container">
  <div class="jumbotron">
    <h1>Sign In</h1> 
 
  </div> <!-- jumbotron -->
  <div id="loginContainer" style="width: 65%; margin: auto" >
	  <ul class="nav nav-tabs" id="loginTabs" data-tabs="tabs">
		  <li class="nav-item active" style="margin:10px"><a class="nav-link active" href="#student" data-toggle="tab">Student</a></li>
		  <li class="nav-item" style="margin:10px"><a class="nav-link" href="#parent" data-toggle="tab">Parent</a></li>
		  <li class="nav-item" style="margin:10px"><a class="nav-link" href="#educator" data-toggle="tab">Educator</a></li>
	  </ul>
	  <div class="tab-content">
	  <!-- First pane is the student login -->
	  	<div id="student" class="tab-pane fade in active">
	  	<h3>Student Login</h3>
	  	<p><jsp:include page="./_studentForm.jsp"></jsp:include></p>
	  	</div><!-- first -->
	  <!-- Second pane is the parent login -->
	  	<div id="parent" class="tab-pane fade">
	  	<h3>Parent Login</h3>
	  	<p><jsp:include page="./_parentForm.jsp"></jsp:include></p>
	  	</div><!-- second -->
	  <!-- Third pane is the educator login -->
	  	<div id="educator" class="tab-pane fade">
	  	<h3>Educator Login</h3>
	  	<p><jsp:include page="./_educatorForm.jsp"></jsp:include></p>
	  	</div> <!-- third -->
	  </div><!-- tab content -->
  </div><!-- loginContainer -->
</div> <!-- container -->
</body>
</html>