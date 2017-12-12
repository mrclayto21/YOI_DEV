<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <!--<link rel="stylesheet" href="./css/bootstrap.min.css">-->

<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript"></script>
</head>
<body class="">
<!-- Testing table -->
<p class = "test"></p>


<script>
window.onload = $.get('Content',function(responseJson) {
				$("#tablediv").show();
	            if(responseJson!=null){
	                $("#contenttable").find("tr:gt(0)").remove();
	                var table1 = $("#contenttable");
					$('body').append('<div style="width:90%"');
					$('body').append('<form id ="form-group" "style="margin: auto" >');
					$('body').append('<div class="row" style="margin-left: 125px;">');
	                $.each(responseJson, function(key, value) { 
						$('body').append(
								'<div class="col-sm-6 col-md-4">'+ 
								'<div class="thumbnail">'+ 
								'<img src="' + value['imgLink'] + '" style="width:100%;height:200px" alt="...">' +
								'<div class="caption">'+
								'<h3>'+ value['lesson_Name'] + '</h3>'+
								'<p>'+ value['lesson_description'] + '</p>'+
								'<button id="openLesson" type="button" class="btn btn-primary"> Launch </button>'+
								'</div>' + '</div>' + '</div>' + '</div>'+ 
								'<div class="modal fade" id="lessonModal" role="dialog" aria-labelledby="lessonModalTitle" aria-hidden="true">' + //1
								    '<div class="modal-dialog">' +
									'<div class="modal-content">' + //2
								      '<div class="modal-header">' + //3
								        '<h5 class="modal-title">'+ value['lesson_Name'] + '</h5>' +
								        '<button type="button" class="close" data-dismiss="modal" aria-label="Close">' +
								          '<span aria-hidden="true">Close</span>' +
								        '</button>' +
								      '</div>' +  //3
								      '<div class="modal-body">' + //4
								        '<p>' + value['content_one'] + '</p>' +
								      '</div>' + //4
								      '<div class="modal-footer">' + //5
								        '<button type="button" class="btn btn-primary">Save changes</button>' +
								        '<button type="button" class="btn btn-secondßary" data-dismiss="modal">Close</button>' +
								      '</div>' + //5
								    '</div>' + //2
								    '</div>' +
								  '</div>' //1
							  );
	                });
					$('body').append('</div>');
					$('body').append('</form>');
                }
});//end get
$(document).ready(function(){
	$("#openLesson").click(function(){
		$("#lessonModal").modal("show");
	});
});
</script>
</body>
</html>