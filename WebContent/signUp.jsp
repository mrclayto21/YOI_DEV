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
		<h1>Sign Up</h1>
	</div><!-- jumbotron -->
	<div id="signUpContainer" style="width: 65%; margin: auto">
		<ul class="nav nav-tabs" id="signUpTabs" data-tabs="tabs">
			<li class="nav-item active" style="margin:10px"><a class="nav-link active" href="#student" data-toggle="tab">Student</a></li>
			<li class="nav-item" style="margin:10px"><a class="nav-link" href="#parent" data-toggle="tab">Parent</a></li>
		  	<li class="nav-item" style="margin:10px"><a class="nav-link" href="#educator" data-toggle="tab">Educator</a></li>
		</ul>
		<div class="tab-content">
			<!-- student -->
			<div id="student" class="tab-pane fade in active">
				<h3>Student Sign Up</h3>
				<p>** A parent ID is required for a child to register.</p>
				<p><jsp:include page="./_stuSignForm.jsp"></jsp:include></p>
			</div>
			<!-- parent -->
			<div id="parent" class="tab-pane fade">
				<h3>Parent Sign Up</h3>
				<p><jsp:include page="./_parSignForm.jsp"></jsp:include>
			</div>
			<!-- educator -->
			<div id="educator" class="tab-pane fade">
				<h3>Educator Sign Up</h3>
				<p>Third party approval required</p>
				<p><jsp:include page="./_edSignForm.jsp"></jsp:include>
			</div>
		</div><!-- tab content -->
	</div><!-- signupContainer -->
</div><!-- container -->
</body>
</html>