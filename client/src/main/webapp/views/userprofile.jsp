<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib tagdir="/WEB-INF/tags" prefix="up"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="z" %>
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
			
					<h1 class="heading">*****User Profile*****</h1>
			
				<div class="content">
					<h3 class="name">Personal Details:</h3>
				</div>
				<div class="skills">
					<div class="progress">
						<h3>User Name:<span><z:out value="${sessionScope.userName}"></z:out></span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>Date of Birth:<span><z:out value="${sessionScope.dob}"></z:out></span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>Gender:<span><z:out value="${sessionScope.gender}"></z:out></span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>Aadhar Number:<span><z:out value="${sessionScope.aadhar}"></z:out></span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>Email:<span><z:out value="${sessionScope.email}"></z:out></span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>Phone Number:<span><z:out value="${sessionScope.phone}"></z:out></span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>Address:<span><z:out value="${sessionScope.address}"></z:out></span></h3>
						<div class="bar"><span></span></div>
					</div>
				</div>
				
				<div class="content">
					<h3 class="name">Account Details:</h3>
				</div>
				<div class="skills">
					<div class="progress">
						<h3>Account Number:<span><z:out value="${sessionScope.account}"></z:out></span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>IFSC Number:<span><z:out value="${sessionScope.ifsc}"></z:out></span></h3>
						<div class="bar"><span></span></div>
					</div>
					
					
				</div>
			</section>
	
		<!-- Profile section ends -->
		</div>
</body>
</jsp:attribute>
</up:User>