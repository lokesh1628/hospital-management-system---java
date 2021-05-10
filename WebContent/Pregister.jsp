<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="pregistration" method="post">
<table style="background-color: skyblue; margin-left: 20px; margin-left:20px;">
<h2>sign up</h2>
<h3>Please enter your personal details below:</h3>
<tr><td>USER Name:</td><td><input type="text" name="uname" required></td></tr>
<tr><td>Name:</td><td><input type="text" name="name" required></td></tr>
<tr><td>PASSWORD:</td><td><input type="password" name="password1" required></td></tr>
<tr><td>RE-TYPE PASSWORD:</td><td><input type="password" name="password2" required></td></tr>
<tr><td><input type="submit" name="submit" value="register"></td><td></td></tr>

</table>
</form>
</body>
</html>