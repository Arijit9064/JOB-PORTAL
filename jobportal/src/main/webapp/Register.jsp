<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTER</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<link rel="stylesheet" href="Index.css">
<body style="background-image: url('bg-img1.jpg')">
<div style="width: 30%;margin:100px auto;">
	<div class="box">
		<form action="RegisterServe">
		<h2>REGISTER</h2>
		<input type="text" class="form-control" name="uname" placeholder="ENTER THE USERNAME">
		<input type="password" class="form-control" name="pass" placeholder="ENTER THE PASSWORD">
		<input type="text" class="form-control" name="nm" placeholder="ENTER THE NAME">
		<br>
		<input type="submit" class="btn btn-outline-primary" value="REGISTER">
	</form>
	</div>
</div>
</body>
</html>