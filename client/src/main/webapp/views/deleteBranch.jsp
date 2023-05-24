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
	    
	<form action="deletingBranch">
		<table class="center"
		style="position: absolute; top: 30vh; border-spacing: 20px; background-color: silver">
			<tr>
				<td><select name="ifsc">
				<option value="-1">--SELECT--</option>
                <a:forEach var="b" items="${bb}">
                		
                        <option value="${b.getIfsc()}">${b.getIfsc()}</option>
                </a:forEach>
                </select></td>
			</tr>
			<tr>
				
				<td><input type="submit" name="submit" style=background-color:#e6e6ff></td>
			</tr>
		</table>
		<a:out value="${msg}"></a:out>
	</form>
</body>
</html>