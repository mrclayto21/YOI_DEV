<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<div class="individual container" style="width:100%">
	<!-- <div class="jumbotron">
	</div>-->
<!-- get variables -->
<script type="text/javascript">
var lesson_id;
var lessonName; 
var lessonDescription; 
var contentOne; 
var contentTwo; 
var contentThree; 
var summaryOne; 
var summaryTwo; 
var summaryThree; 
lesson_id = <%= request.getParameter("lesson_id")%>; 

$.ajax({
	type:"GET", 
	url: "SingleContent", 
	datatype: "json",
	data: {
		"lesson_id": lesson_id
	}, 
	success: function(responseJson){
		console.log("success");
		$.each(responseJson, function(key, value){
			lessonName = value['lesson_Name']; 
			lessonDescription = value['lesson_description'];
			contentOne = value['content_one']; 
			contentTwo = value['content_two']; 
			contentThree = value['content_three']; 
			summaryOne = value['summary_one'];
			summaryTwo = value['summary_two'];
			summaryThree = value['summary_three']; 
			$('.individual').append('<div><h1>'+ lessonName + '</h1>' 
					+ '<p class ="lead"><em>' + lessonDescription + '</em></p>'
					+ '<div class="carousel slide" data-ride="carousel">'
					+ '<div>' + contentOne + '</div>'
					+ '<div><strong>Summary: </strong>'
					+ '<ul>'
					+ summaryOne 
					+ '</ul></div>' 
					+ '<div>' + contentTwo + '</div>'
					+ '<div><strong>Summary: </strong>'
					+ '<ul>'
					+ summaryTwo 
					+ '</ul></div>' 
					+ '<div>' + contentThree + '</div>'
					+ '<div><strong>Summary: </strong>'
					+ '<ul>'
					+ summaryThree 
					+ '</ul></div>' 
					+ '</div>'
					+ '</div>');
		});
	}, 
	error: function(request, status, errorThrown){
		console.log(request);
		console.log(status);
		console.log(errorThrown);
	}
});
</script>

</div> <!-- container -->
</body>
</html>