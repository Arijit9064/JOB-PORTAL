<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JOB SEEKER</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<link rel="stylesheet" href="Index.css">
<body style="background-image: url('bg-img1.jpg')">
<div style="width: 30%;margin:100px auto;">
	<div class="box">
		<form action="JobSeekerServe" method="post">
		<h2>JOB SEEKER</h2>
		<input type="text" class="form-control" name="username" placeholder="ENTER THE USERNAME">
		<input type="text" class="form-control" name="password" placeholder="ENTER THE PASSWORD">
		<input type="text" class="form-control" name="name" placeholder="ENTER THE NAME">
		<input type="text" class="form-control" name="phno" placeholder="ENTER THE PHONE NUMBER">
		<input type="text" class="form-control" name="domain" placeholder="ENTER THE DOMAIN">
		<input type="text" class="form-control" name="yrexp" placeholder="ENTER THE YEAR OF EXPERIENCE">
		<br>
		<input type="submit" class="btn btn-outline-primary" value="ADD">
	</form>
	</div>
</div>
</body>
</html>