<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	    
	<form action="updatingAdmin">
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
				<td><input type="submit" name="submit"></td>
			</tr>
		</table>
		<a:out value="${msg1}"></a:out>
	</form>



</body>
</html>