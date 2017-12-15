<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <!--<link rel="stylesheet" href="./css/bootstrap.min.css">-->
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript">
</script>
</head>
<body class="">
<!-- Testing table -->
<p class = "test"></p>


<script type="text/javascript">
var lessonID; 
var lessonName;
var lessonDescription;
var imgLink;

window.onload = $.get('Content',function(responseJson) {
	            if(responseJson!=null){
					$('body').append('<div style="width:90%">');
					$('body').append('<form id ="form-group" "style="margin: auto" >');
					$('body').append('<div class="row" style="margin-left: 125px;">');
	                $.each(responseJson, function(key, value) { 
						lessonID = value['lesson_id'];
						lessonName = value['lesson_Name'];
						lessonDescription = value['lesson_description'];
						imgLink = value['imgLink'];
						$('body').append(
								'<div class="col-sm-6 col-md-4">'+ 
								'<div class="thumbnail">'+ 
								'<img src="' + imgLink + '" style="width:100%;height:auto" alt="...">' +
								'<div class="caption">'+
								'<h3>'+ lessonName + '</h3>'+
								'<p>'+ lessonDescription + '</p>'+
								'<button id="' + lessonID + '" type="button" class="launch-btn btn btn-primary"> Launch </button>'+
								'</div>' + '</div>' + '</div>' + '</div>'+ 
								'<div class="lessonModal' + lessonID + ' modal fade" role="dialog" aria-labelledby="lessonModalTitle" aria-hidden="true">' + //1
								    '<div class="modal-dialog">' +
									'<div class="modal-content">' + //2
								      '<div class="modal-header">' + //3
								        '<h5 class="modal-title">Lesson Details</h5>' +
								        '<button type="button" class="close" data-dismiss="modal" aria-label="Close">' +
								          '<span aria-hidden="true">Close</span>' +
								        '</button>' +
								      '</div>' +  //3
								      '<div class="modal-body">' + //4
								      '</div>' + //4
								      '<div class="modal-footer">' + //5
								        '<button type="button" class="close btn btn-secondary" data-dismiss="modal">Done</button>' +
								      '</div>' + //5
								    '</div>' + //2
								    '</div>' +
								  '</div>' //1
							  );
	                });
					$('body').append('</div>');
					$('body').append('</form>');
                }
}).done(function(){

});//enddone
$(document).on("click", ".launch-btn", function(){
	var temp = $(this).attr("id");
	console.log("temp " + temp);
	var forLoad = "_modal.jsp?lesson_id=" + temp; 
	$(".lessonModal" + temp).modal("toggle");
		$('.modal-body').load(forLoad);
		
	$(".close").click(function(){
		$(".lessonModal").modal("hide");
	});
});
</script>

</body>
</html>