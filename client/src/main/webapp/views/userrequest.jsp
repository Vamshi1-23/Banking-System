<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="ap"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<ap:Admin title="FEEDBACK FORM">
	<jsp:attribute name="head">
<meta name="viewport" content="width=device-width, initial-scale=1">    
  <link rel="stylesheet" href="/styles/feedback.css">
  <link rel="stylesheet" href="/styles/Menubar.css">
  <link rel="stylesheet" href="/styles/profile.css">
  
  <style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  border-width:2px;
  
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
  margin-top:2px;
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
<body>
<div class="container">
<div class="scroll">
        <table class="center"  style="background-color:#c2d6d6">
            <tr>
                    <th>Cust_Id</th>
                    <th>Fname</th>
                    <th>Lname</th>
                    <th>Email</th>
                    <th>Gender</th>
                    <th>Dob</th>
                    <th>Phone No</th>
                   
                    <th>Aadhar</th>
                    <th>Address</th>
                    <th>IFSC</th>
                    <th colspan="2">Action</th>
            </tr>
            <tr>
            <a:forEach var="i" items="${ulist}">
            <a:url var="saveUser" value="saveUser">
            <a:param name="userId" value="${i.userId}"></a:param>
            </a:url>
            
            <a:url var="RejectUser" value="RejectUser">
            <a:param name="userId" value="${i.userId}"></a:param>
             <div align="center"><h1><a:out value="${msg}"></a:out></h1></div>
            </a:url>
            <tr>
                <td>${i.userId }</td>
                <td>${i.fName}</td>
                <td>${i.lName }</td>
                <td>${i.email }</td>
                <td>${i.gender}</td>
                <td>${i.dob}</td>
                <td>${i.phNo}</td>
              
                <td>${i.aadhar }</td>
                <td>${i.address }</td>
                <td>${i.ifsc}</td>
                 <td><a href="${saveUser}">grant</a></td>
                <td><a href="${RejectUser}">reject</a></td>
               
        </a:forEach>
            </tr>
          <center><h1> <a:out value="${grant }"></a:out></h1></center>
        </table>
        </div>
    </div>
</body>
</jsp:attribute>
</ap:Admin>
</html>