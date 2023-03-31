<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <title> Blinking feature using JavaScript </title>
    <style>
        #blink {
            font-size: 50px;
            font-weight: bold;
            color: #2d38be;
            transition: 1s;
        }
    </style>
</head>

<body>
    <p id="blink">!!!NO RECORD FOUND!!!</p>
    <script type="text/javascript">
        var blink = document.getElementById('blink');
        setInterval(function() {
            blink.style.opacity = (blink.style.opacity == 0 ? 1 : 0);
        }, 1500);
    </script>
    
 <a href="Register.jsp"><u>New user sign up now?</u></a><br>
<a href="login.jsp"><u>GO to login page</u></a><br>
</body>
</html>