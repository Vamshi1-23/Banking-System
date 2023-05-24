<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib tagdir="/WEB-INF/tags" prefix="up"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<up:Admin title="Userprofile">
<jsp:attribute name="head">
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
<div class="container">
<div class="scroll">
   <table class="center"  style="background-color:#c2d6d6">
		<tr>
			<th>Transaction ID</th>
			<th>Transaction Type</th>
			<th>Amount</th>
			<th>Transaction Date</th>
			<th>Account NO</th>

		</tr>

		<a:forEach var="i" items="${t}">
			<tr>
				<th>${i.transId}</th>
				<th>${i.transType }</th>
				<th>${i.amount }</th>
				<th>${i.tansdate }</th>
				<th>${i.accNo.accNo}</th>
			
		</a:forEach>
	</table>
	</div>
	</div>
</body>
</jsp:attribute>
</up:Admin>
</html>
