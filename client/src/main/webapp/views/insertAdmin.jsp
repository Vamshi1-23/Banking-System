<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/styles/Menubar.css" rel="stylesheet"/>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width:30%;
  left:35%;
}
td {
  border: 1px solid white;
  text-align: left;
  padding: 8px;
  }
  th {
  border: 1px solid white;
  text-align: left;
  padding: 8px;
  }
tr:nth-child(even) {
  background-color: #dddddd;
}
body {
  background-image: url('/images/Bank.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
h1{
 color:#800000;
  }
</style>
</head>
<body>
	    
	<form action="insertAdmin">
		<table
			style="position: absolute; top: 30vh; border-spacing: 20px; background-color: silver;">
			<tr>
				<td>Admin ID</td>
				<td><input type="text" name="adminId"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>Admin Name</td>
				<td><input type="text" name="adminName"></td>
			</tr>

			<tr>
				<td>Insert</td>
				<td><input type="submit" name="submit" style=background-color:#e6e6ff></td>
			</tr>
		</table>
		<center><h1><a:out value="${msg}"></a:out></h1></center>
	</form>
</body>
</html>