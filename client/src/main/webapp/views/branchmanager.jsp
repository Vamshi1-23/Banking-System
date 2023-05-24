<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="ap"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<ap:Admin title="FEEDBACK FORM">
	<jsp:attribute name="head">
<meta name="viewport" content="width=device-width, initial-scale=1">    
  <link rel="stylesheet" href="/styles/Menubar.css">
  <link rel="stylesheet" href="/styles/profile.css">
  
  <style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
}

td, th {
  border: 1px solid #6f5380;
  text-align: left;
  padding: 8px;
  }
/* tr:nth-child(even) {
  background-color: #dddddd;
}
  */
body {
  background-image: url('/images/Bank.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
.center {
  margin-left: auto;
  margin-right: auto;
  margin-top:5px;
}
div.scroll {
                margin:4px, 4px;
                padding:4px;
                background-color:white;
                height:55rem;
				width:85rem;
                overflow-x: hidden;
                overflow-y: auto;
                text-align:justify;
            }
</style>
</jsp:attribute>
	<jsp:attribute name="content">
</head>
<body>
<div class="container">
<div class="scroll">
	<table class="center" style="background-color:#c2d6d6;width:90%">
		<tr>
			<th>Manager Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Address</th>
			<th>Gender</th>
			<th>Date Of Birth</th>
			<th>Date Of Joining</th>
			<th>IFSC Code</th>
			<th>Admin Id</th>
			

		</tr>

		<a:forEach var="i" items="${ulist}">
			<tr>
				<th>${i.mgrId}</th>
				<th>${i.fname }</th>
				<th>${i.lname }</th>
				<th>${i.address }</th>
				<th>${i.gender }</th>
				<th>${i.dob }</th>
				<th>${i.doj }</th>
				<th>${i.ifsc.ifsc }</th>
				<th>${i.adminId.adminId }</th>
				
		</a:forEach>
	</table>
	</div>
	</div>
</body>
</jsp:attribute>
</ap:Admin>
</html>
