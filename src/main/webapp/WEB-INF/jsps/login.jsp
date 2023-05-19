<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<style>
form {
	background-color: skyblue;
	width: 300px;
	height: 200 border-style: solid;
	border-color: blue;
	paddin: 10px;
}
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Login here</h2>

	<form action="/login" method="post">
		<c:if test="${not empty error}">
			<div style="color: red"><h5>${error}</h5></div>
			<div><br></div>
		</c:if>
		<div>UserName : <input type="text" name="userName" value=""></div>
		<div>Password : <input type="password" name="password" value=""  id="myInput"></div>
		<input type="checkbox" onclick="myFunction()">Show Password

		<script>
			function myFunction() {
				var x = document.getElementById("myInput");
				if (x.type === "password") {
					x.type = "text";
				} else {
					x.type = "password";
				}
			}
		</script>
		<div>
			<input type="submit" value="Login" style="background-color: lime">
		</div>
		
		<a href="Register">Create New User</a>
		
	</form>
	
</body>
</html>