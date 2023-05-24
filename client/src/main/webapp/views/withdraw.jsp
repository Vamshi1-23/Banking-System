<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib tagdir="/WEB-INF/tags" prefix="up"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="z" %>
<up:User title="Userprofile">
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
		<!-- Profile section starts -->
			<section class="profile" id="profile">
			
			<h1 class="heading">*****WITHDRAW AMOUNT*****</h1>
				<div class="content">
				</div>
				<form action="withdraw">
				<div class="skills">
					<div class="progress">
						<h3>Account Number:<span><z:out value="${sessionScope.account}"></z:out></span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>Amount:<span><input type="text" name="amount"></span></h3>
						<div class="bar"><span></span></div>
					</div>
				</div>
				<center><input style="background:orange; color: #fff; padding: 12px; border: 0"
						type="submit" ></center>
						<h1><z:out value="${msg}"></z:out></h1>
						<h1><z:out value="${msg1}"></z:out></h1>
				</form>
			</section>
	
		<!-- Profile section ends -->
		</div>
</body>
</jsp:attribute>
</up:User>