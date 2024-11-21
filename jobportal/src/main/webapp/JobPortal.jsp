<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JOB PORTAL</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script>
function admin()
{
	window.open("Admin.jsp");
	}
	function client()
	{
		window.open("Client.jsp");
	}
</script>
</head>
<link rel="stylesheet" href="Index.css">
<body style="background-image: url('bg-img1.jpg')">
<div class="mainContainer">
	<h1 style="color: white; font-size: 4.8rem; margin-button: 30px;">JOB PORTAL</h1>
</div>
<div style="text-align:center;">
	<div class="box">
		<h1 style="font-size: 3.8rem; margin-bottom: 30px; color: #003366;">FIND YOUR JOB</h1>
		<button class="btn btn-outline-secondary" onclick="admin()">ADMIN PAGE</button> &nbsp;&nbsp;
		<button class="btn btn-outline-primary" onclick="client()">CLIENT PAGE</button>
	</div>
</div>
</body>
</html>