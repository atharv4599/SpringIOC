<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN PAGE</title>
<style>

form:link, form:visited {
  background-color: #f44336;
  color: black;
  padding: 14px 25px;
  text-align: left;
  text-decoration: none;
  display: inline-block;
  border-color: blue;
  border: thick;
  font-size: 20px;
	font-color: yellow;
}
pre{
font-size: 20px;
	font-color: yellow;
}
form:hover, form:active {
  background-color: pink;
  border-color: red;
  border: thick;
  font-size: 20px;
	font-color: yellow;
}
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
<form action="login">
 <pre>
  <label for="username">Username:</label><br>
  <input type="text" id="username" name="username" ><br>
  <label for="password">Password:</label><br>
  <input type="text" id="password" name="password" ><br><br>
  <input type="submit" value="Login">
 
<a href="Register.jsp"><u>New user sign up now?</u></a>

  </pre>
</form> 
 
</body>
</html>