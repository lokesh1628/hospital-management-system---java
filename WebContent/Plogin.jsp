<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center" style=background-color:#FA8072>
<form action="pregistration" method="post">
<table align="center">
<h1 align="center">Patient Login</h1>
<h2 align="center">sign in to your account</h2>
<h3 align="center">Please enter your name and password to log in.</h3>
<tr><td>USER Name:</td><td><input type="text" name="uname" required></td></tr>
<tr><td>PASSWORD:</td><td><input type="password" name="password1" required></td></tr>
<tr><td><input type="submit" name="submit" value="login" ></td><td><h4>Don't have an account yet?<a href="Pregister.jsp">Registration</a></h4></td></tr>

</table>
</form>
</body>
</html>