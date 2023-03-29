<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
form:link, form:visited {
  background-color: #f44336;
  color: white;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

form:hover, form:active {
  background-color: red;
}
</style>
</head>
<body>
<form action="login">
 <pre>
  <label for="username"> Username:</label><br>
  <input type="text" id="username" name="username" value=""><br>
  <label for="password">Password:</label><br>
  <input type="text" id="password" name="password" value=""><br><br>
  <input type="submit" value="Submit">
  </pre>
</form> 
</body>
</html>