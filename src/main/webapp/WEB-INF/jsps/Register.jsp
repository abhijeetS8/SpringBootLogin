<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create user</title>
</head>
<body>

	<form action="SaveReg" method="post">

		<pre>
		
		User Name <input type="text" name="name" /> 
		Password <input type="text" name="password" /> 	
		<input type="submit" value="Save" /> 
		
		</pre>

	</form>

  ${msg}
  
</body>
</html>