<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="z" %>
<mp:Master title="LOGIN FORM">
<jsp:attribute name="head">
	
<!DOCTYPE html>
<html>
  <head>  
    <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport"
	content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <link rel="stylesheet" href="css/bootstrap.css">
       <link
	href='https://fonts.googleapis.com/css?family=Oxygen:400,300,700'
	rel='stylesheet' type='text/css'>
       <style>
body {
	margin: 0;
	padding: 0;
	background-size: cover;
	font-family: sans-serif;
}

.log {
	width: 1366px;
	height: 696px;
}

.loginbox {
	width: 320px;
	height: 450px;
	background: #000;
	color: #fff;
	top: 20%;
	left: 40%;
	position: absolute;
	transform: translate{-50%, -50%
}

box-sizing
:
 
border-box
;

          
padding
:
 
70px
 
30px
;

          
opacity
:
.7
;

               
}
.avatar {
	width: 100px;
	height: 100px;
	border-radius: 50%;
	position: absolute;
	top: -14%;
	left: calc(50% - 50px);
}

h1 {
	margin: 0;
	padding: 0 0 20px;
	text-align: center;
	font-size: 30px;
	font-family: AR JULIAN;
	color: white;
}

.loginbox p {
	margin: 0;
	padding: 0;
	font-weight: bold;
}

.loginbox input {
	width: 100%;
	margin-bottom: 20px;
}

.loginbox input[type="text"], input[type="password"] {
	border: none;
	border-bottom: 1px solid #fff;
	background: transparent;
	outline: none;
	height: 40px;
	color: #fff;
	font-size: 16px;
}

.loginbox input[type="submit"] {
	border: none;
	outline: none;
	height: 40px;
	background: #fb2525;
	color: #fff;
	font-size: 18px;
	border-radius: 20px;
}

.loginbox input[type="submit"]:hover {
	cursor: pointer;
	background: #ffc107;
	color: #000;
}

.loginbox a {
	text-decoration: none;
	font-size: 12px;
	line-height: 20px;
	color: darkgrey;
}

.loginbox a:hover {
	color: #ffc107;
}

.active {
	color: #fff;
	background: #e02626;
	border-radius: 4px;
}

body {
	background-image: url('/images/Bank.jpg');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}
</style>
  
</jsp:attribute>
	
	<jsp:attribute name="content">
  <body>
 
    <img class="log">
    <div class="loginbox">
 	<img src="/images/avatar1.png" class="avatar">
    <h1>Login Here</h1>
    
    <form action="logging">
    <p> Userid</p>
    <input type="text" name="userId" placeholder="Userid" maxlength="4"
						minlength="3"  pattern="[0-9]{3-4}" title="4 digit number: e.g. 1234"
						required>
    <p> Password</p>
    <input type="password" name="password" placeholder="Password"
						maxlength="4" minlength="4" pattern="[0-9]{4}"
						title="4 digit number: e.g. 1234" required><br>
    <input type="submit" name="" value="Login">
    
    <a href="/views/Forgot.jsp">Forgot password?</a><br>
     <z:out value="${password}"></z:out>
     <z:out value="${user}"></z:out>
    </form>
    </div>
    <script src="js/jquery-2.1.4.min.js"></script>
      <script src="js/bootstrap.min.js"></script>
      <script src="js/ajax-utils.js"></script>
      <script src="js/script.js"></script>
  </body>
</jsp:attribute>
</mp:Master> 
</html>