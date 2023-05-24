<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ALL Branches</title>
<link href="/styles/Menubar.css" rel="stylesheet"/>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width:50%;
  left:10%;
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
	<table class="center">
		<tr>
			<th>IFSC Code</th>
			<th>Bank Name</th>
			<th>Pincode</th>
			<th>City</th>

		</tr>

		<a:forEach var="i" items="${msg}">
			<tr>
				<td>${i.ifsc}</td>
				<td>${i.bankName }</td>
				<td>${i.pincode }</td>
				<td>${i.city }</td>
		</a:forEach>
	</table>
</body>
</html>