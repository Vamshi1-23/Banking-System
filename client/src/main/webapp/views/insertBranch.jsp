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
  left:30%;
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
</style>
</head>
<body>
	    
	<form action="insertBranch" ModelAttribute="A">
		<table
			style="position: absolute; top: 30vh; border-spacing: 20px; background-color: silver;">
			<tr>
				<td>IFSC Code</td>
				<td><input type="text" name="ifsc"></td>
			</tr>
			<tr>
				<td>Bank Name</td>
				<td><input type="text" name="bankName"></td>
			</tr>
			<tr>
				<td>Pincode</td>
				<td><input type="text" name="pincode"></td>
			</tr>

			<tr>
				<td>City</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>Insert</td>
				<td><input type="Submit" name="submit"></td>
			</tr>
		</table>
		<center><h1><a:out value="${msg}"></a:out></h1></center>
	</form>



</body>
</html>