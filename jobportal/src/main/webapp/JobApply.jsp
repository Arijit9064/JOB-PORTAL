<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="Client.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JOB APPLY</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<link rel="stylesheet" href="Index.css">
<body style="background-image: url('bg-img1.jpg')">
<div style="width: 30%;margin:100px auto;">
	<div class="box">
		<form action="JobApplyServe" method="post">
		<h2>JOB APPLY</h2>
		<input type="text" class="form-control" name="jname" placeholder="ENTER THE USERNAME">
		<input type="text" class="form-control" name="jobid" placeholder="ENTER THE JOB ID">
		<input type="text" class="form-control" name="applydt" placeholder="ENTER THE APPLY DATE">
		<br>
		<input type="submit" class="btn btn-outline-primary" value="APPLY">
	</form>
	</div>
</div>
</body>
</html>