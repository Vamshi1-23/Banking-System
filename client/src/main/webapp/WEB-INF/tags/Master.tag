<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="z" %>
<%@ attribute name="title" required="true" rtexprvalue="true"%>
<%@ attribute name="head" fragment="true"%>
<%@ attribute name="content" fragment="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title}</title>
<link href="/styles/Menubar.css" rel="stylesheet"/>
</head>
<body bgcolor="#AFBDCA">

	<div  style="position:absolute;left:0px;top:0px;width:100%;height:12%" class="master">
		<img src="/images/BankLogo.PNG" style="width:10%;height:100%">
	</div>
	<div class="header">
		<h2>Tech Bank</h2>
	</div>
	<div class="footer"> @Copyright-TECH BANK-2022- All Right Reserved.   
	</div>  



	<jsp:invoke fragment="head" ></jsp:invoke>
<jsp:invoke fragment="content"></jsp:invoke>
<%-- <z:choose>
	<z:when test="${ sessionScope.userId==null}">
		<z:redirect url="/"></z:redirect>
	</z:when>
	<z:otherwise>
		Welcome <z:out value="${sessionScope.userId}"></z:out>
	
	</z:otherwise> 
</z:choose> --%>
</body>
</html>