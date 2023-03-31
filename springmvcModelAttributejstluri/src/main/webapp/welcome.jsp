<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<style>  
body{  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: pink;  
}  
.container {  
    padding: 50px;  
  background-color: lightblue;  
}
</style>
</head>
<body>
WELCOME <br>

<table border ="3">
<tr>
<th>Username</th>
<th>Password</th>
<th>Phone</th>
<th>Email</th>
</tr>
<c:forEach items="${data}" var="u">
<tr>
<td>${u.username}</td>
<td>${u.password}</td>
<td>${u.phone}</td>
<td>${u.email}</td>
</tr>
</c:forEach>
</table>
 <br> 
 <a href="Register.jsp"><u>New user sign up now?</u></a><br>
<a href="login.jsp"><u>GO to login page</u></a><br>
 <br>
</body>
</html>