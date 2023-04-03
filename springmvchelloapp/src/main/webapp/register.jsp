<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>  
body{  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: pink;  
}  
.container {  
    padding: 50px;  
  background-color: lightblue;  
}  
  
input[type=text], input[type=password], textarea {  
  width: 100%;  
  padding: 15px;  
  margin: 5px 0 22px 0;  
  display: inline-block;  
  border: none;  
  background: #f1f1f1;  
}  
input[type=text]:focus, input[type=password]:focus {  
  background-color: orange;  
  outline: none;  
}   
hr {  
  border: 1px solid #f1f1f1;  
  margin-bottom: 25px;  
}  
.registerbtn {  
  background-color: #4CAF50;  
  color: white;  
  padding: 16px 20px;  
  margin: 8px 0;  
  border: none;  
  cursor: pointer;  
  width: 100%;  
  opacity: 0.9;  
}  
.registerbtn:hover {  
  opacity: 1;  
}  
</style> 
</head>
<body>
<form action="saveStudent">  
   
    <h1>  Registeration Form</h1>   <br> 
<hr>
<label><b>Roll number</b> </label>  
<input type="text" name="rollno" id ="rollno" placeholder="roll no." size="5" required>   <br> 
<label for="name"><b>Name</b></label>  
    <input type="text" id ="name" placeholder="Enter Name" name="name" required>   <br>
  
<label><b> Username:</b>> </label>    
<input type="text" id ="username" name="username" placeholder="Username" size="15"required />   <br> 
 <label for="psw"><b>Password</b></label>  
    <input type="password" id ="password" placeholder="Enter Password" name="password" required>   <br>
  <br> <br>
  <button type="submit" class="registerbtn">Register</button>    
</form>  
</body>
</html>