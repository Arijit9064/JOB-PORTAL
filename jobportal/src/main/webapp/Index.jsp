<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JOB PORTAL PAGE</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script>
function register()
{
	window.open("Register.jsp");
	}
	function login()
	{
		window.open("Login.jsp");
	}
</script>
</head>
<link rel="stylesheet" href="Index.css">
<body style="background-image: url('bg-img.jpg')">
<div class="mainContainer">
	<h1 style="color: white; font-size: 4.8rem; margin-button: 30px;">WELCOME TO JOB PORTAL</h1>
</div>
<div style="text-align:center;">
	<div class="box">
		<h1 style="font-size: 4.8rem; margin-bottom: 30px; color: #003366;">JOB PORTAL</h1>
		<button class="btn btn-outline-secondary" onclick="register()">REGISTER</button> &nbsp;&nbsp;
		<button class="btn btn-outline-primary" onclick="login()">LOGIN</button>
	</div>
</div>
</body>
</html>