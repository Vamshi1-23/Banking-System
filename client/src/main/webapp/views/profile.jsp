<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="z" %>
    <mp:Master title="Forgot Password">

	<jsp:attribute name="head">
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>User Profile</title>

	<!-- Font awesome -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" />
	
	<!-- Custom  css file -->
	<link rel="stylesheet" href="/styles/profile.css">
</head>
</jsp:attribute>
 <jsp:attribute name="content">
<body>
<body>
	<!-- Head section starts -->
	<header>
	<div class="user">
		<image src="/images/pp5.jpg" alt="">
	<h3 class="name"></h3>
	<p class="post">Developer</p>
	<z:out value="${sessionScope.userName}"></z:out>
	</div>
	<nav class="navbar">
		<ul>
			<li><a href="#home">Home</a></li>
			<li><a href="#profile">Profile</a></li>
			<li><a href="#transactions">Transactions</a></li>
			<li><a href="withdraw">Withdraw</a></li>
			<li><a href="#deposit">Deposit</a></li>
			<li><a href="#feedback">Feedback</a></li>
		</ul>
	</nav>
	</header>
	<!-- Head section ends -->
	
	<!-- Content section starts-->
	<div class="container">
		<section class="home" id="home">
			<h1>Tech bank</h1>	
			<h3 class="name">Welcomes <span>You</span></h3>
			<h3 class="post">User Name:<span class="typing-text"> We</span></h3>
			<h3 class="post">Account No:<span class="typing-text"> 77778888543</span></h3>
			<h3 class="post">IFSC Code:<span class="typing-text"> SBIN006316</span></h3>
			<h3 class="post">Phone No:<span class="typing-text"> 9898787812</span></h3>
		</section>
		
		<!-- Profile section starts -->
			<section class="profile" id="profile">
			
					<h1 class="heading">*****User Profile*****</h1>
			
				<div class="content">
					<h3 class="name">Personal Details:</h3>
				</div>
				<div class="skills">
					<div class="progress">
						<h3>User Name:<span>We</span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>Father name:<span>We</span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>Date of Birth:<span>We</span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>Gender:<span>We</span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>Aadhar Number:<span>We</span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>Email:<span>We</span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>Phone Number:<span>We</span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>Address:<span>We</span></h3>
						<div class="bar"><span></span></div>
					</div>
				</div>
				
				<div class="content">
					<h3 class="name">Account Details:</h3>
				</div>
				<div class="skills">
					<div class="progress">
						<h3>Account Number:<span>We</span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>IFSC Number:<span>We</span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>Branch Name:<span>We</span></h3>
						<div class="bar"><span></span></div>
					</div>
					<div class="progress">
						<h3>Pin Code:<span>We</span></h3>
						<div class="bar"><span></span></div>
					</div>
					
				</div>
			</section>
	
		<!-- Profile section ends -->
	</div>
	<!-- Content section ends-->

</body>
</jsp:attribute>
  </mp:Master>
</html>