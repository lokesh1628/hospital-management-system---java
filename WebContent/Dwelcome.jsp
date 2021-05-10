<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style=background-color:#ffff66>
<marquee><h1>Welcome To  KLHospital</h1></marquee>
<p align="right">
 <a href="Dlogin.jsp"> <input type="button" value="Logout" /></a>
</p>
<form action="dprofile" method="get">
<table align="center">
<tr>
<td>
<input type="submit" value="Profile"></td>
<td><img src="C:\Users\LENOVO\Desktop\hc3.jpg"></img></td></tr>
</table>
</form>
<form action="dview" method="get">
<table align="center">
<tr>
<td>
<input type="submit"  value="Appointment"></td>
<td><img src="C:\Users\LENOVO\Desktop\hc4.png"></img></td></tr>
</table>
</form>

</body>
</html>