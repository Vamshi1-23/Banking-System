<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib tagdir="/WEB-INF/tags" prefix="up"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="z" %>
<up:User  title="Userprofile">
<jsp:attribute name="head">
<link href="/styles/Menubar.css" rel="stylesheet"/>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" />
	
	<!-- Custom  css file -->
	<link rel="stylesheet" href="/styles/profile.css">
</jsp:attribute>
 <jsp:attribute name="content">
<body>
	<!-- Content section starts-->
	<div class="container">
		<section class="home" id="home">
			<h1>Tech bank</h1>	
			<h3 class="name">Welcomes <span>You</span></h3>
			<h3 class="post">User Name:<span class="typing-text">	<z:out value="${sessionScope.userName}"></z:out> </span></h3>
			<h3 class="post">Account No:<span class="typing-text"> <z:out value="${sessionScope.account}"></z:out></span></h3>
			<h3 class="post">IFSC Code:<span class="typing-text"> <z:out value="${sessionScope.ifsc}"></z:out></span></h3>
			<h3 class="post">Phone No:<span class="typing-text"> <z:out value="${sessionScope.phone}"></z:out></span></h3>
			<h3 class="post">Balance:<span class="typing-text"> <z:out value="${sessionScope.Balance}"></z:out></span></h3>
		</section>
		</div>
</body>
</jsp:attribute>
</up:User>