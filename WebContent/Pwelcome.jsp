<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body   style=background-color:skyblue>
<marquee><h1>Welcome To KLHospital</h1></marquee>
<form action="data" method="post">
<table align="center">
<h3 align="center">Apply Online Appointment</h3>

<tr><td>Name:<input type="text" name="name" required></td></tr>
<tr><td>Specialist:<input type="radio" id="Allergists" name="grade" value="Allergists">
<label for="male">Allergists</label>
  <input type="radio" id="Dermatologists" name="grade" value="Dermatologists">
  <label for="male">Dermatologists</label>
  <input type="radio" id="Ophthalmologists" name="grade" value="Ophthalmologists">
  <label for="male">Ophthalmologists</label>
  <input type="radio" id="Gynecologists" name="grade" value="Gynecologists">
  <label for="male">Gynecologists</label>
  <input type="radio" id="Cardiologists" name="grade" value="Cardiologists">
  <label for="male">Cardiologists</label>
  <input type="radio" id="Endocrinologists" name="grade" value="Endocrinologists">
  <label for="male">Endocrinologists</label>
  <input type="radio" id="Gastroenterologists" name="grade" value="Gastroenterologists">
  <label for="male">Gastroenterologists</label>
  
  </td></tr>
<tr><td>
 <p>
          <label>Problem:</label>
          <textarea rows = "3" cols = "80" name="address">Your text here</textarea>
        </p>
</td>
</tr>
<tr>
<td>
<input type="submit" name="submit" value="Submit" align="center"></td>
<td>
<p align="right">
 <a href="Plogin.jsp"> <input type="button" value="Logout" /></a>
</p>
</td>
</tr>
</table>
</form>
</body>
</html>