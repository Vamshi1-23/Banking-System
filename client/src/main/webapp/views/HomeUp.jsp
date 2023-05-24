<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<mp:Master title="Banking System">
<jsp:attribute name="head">
<link href="/styles/Menubar.css" rel="stylesheet"/>
<link href="/styles/HomeUp.css" rel="stylesheet"/>

</jsp:attribute>
<jsp:attribute name="content">
<style>
body {
  background-image: url('/images/Bank.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}

</style>
	<div class="banner">
		<div class="navbar">
		<img class="logo" >
		<ul >
   				<li><a href=#>Home</a></li>
			 <li><a href="loginpage">Login</a></li>
 			 <li><a href="signup">Create New Account</a></li>
 			 <li><a href="Status">Check Status</a></li>
  			 <li style="float:right"><a href="/views/contact.jsp">Contact Us</a></li>
 			 <li style="float:right"><a href="aboutus">About Us</a></li>
		</ul>
		</div>
		</div>
		<div class="containerr">
		<div class="marquee-container">
    <p class="marquee">
       Our Bank never asks your security pin and CVV please aware of it and don't share the sensitive information with anyone..................
    </p>
</div>
</div>
		
<div class="container">
<div class="project">
	<center><b>Types of Loans provided by our Bank are:</b></center>
		<p>--Home Loans<br>
		--Auto Loans<br>
		--Education Loan scheme<br>
		--Personal Loan scheme<br>
		--Business Loan<br>
		--Wedding Loan<br>
		--Personal Loans for government employees
		--Personal Loans for Women
		</p>
</div>
<div class="body">
	<a href="https://www.lendingtree.com/personal/different-types-of-personal-loans/#:~:text=Common%20types%20of%20personal%20loans%20%20%20Loan,improvement%20project%20...%20%206%20more%20rows%20" style="--clr:#ff1867"><span>Explore More</span><i></i></a>
</div>
</div>

	
<div class="containers">
<div class="project">
	<center><b>Steps for Opening a new account</b></center>
		<p>--Click on the create new account<br>
		--Then you will see a registration form<br>
		--Please fill form with correct information<br>
		--After completion of filling click on submit<br>
		--Then u get a message<br>
		--Now open login<br>
		--Enter the user and password
		--You can find your account
		</p>
		
</div>


<div class="body">
	<a href="/views/aboutus.jsp" style="--clr:#6eff3e"><span>Know More</span><i></i></a>
</div>
</div>	

<div class="containerss">


</div>
<div class="slideshow-container">

  <!-- Full-width images with number and caption text -->
  <div class="mySlides fade">
    <div class="numbertext">1 / 3</div>
    <img src="images/pp1.jpg" style="width: 100%; height:100%">
  </div>

  <div class="mySlides fade">
    <div class="numbertext">2 / 3</div>
    <img src="images/pp2.jpg" style="width: 100%; height:100%">
   
  </div>

  <div class="mySlides fade">
    <div class="numbertext">3 / 3</div>
    <img src="images/pp3.jpg" style="width: 100%; height:100%">
   
  </div>

  <!-- Next and previous buttons -->
  <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
  <a class="next" onclick="plusSlides(1)">&#10095;</a>
</div>
<br>
<!-- The dots/circles -->
<div style="text-align: center">
  <span class="dot" onclick="currentSlide(1)"></span>
  <span class="dot" onclick="currentSlide(2)"></span>
  <span class="dot" onclick="currentSlide(3)"></span>
</div>
<script>
	let slideIndex = 1;
	showSlides(slideIndex);

	// Next/previous controls
	function plusSlides(n) {
		showSlides(slideIndex += n);
	}

	// Thumbnail image controls
	function currentSlide(n) {
		showSlides(slideIndex = n);
	}

	function showSlides(n) {
		let i;
		let slides = document.getElementsByClassName("mySlides");
		let dots = document.getElementsByClassName("dot");
		if (n > slides.length) {
			slideIndex = 1
		}
		if (n < 1) {
			slideIndex = slides.length
		}
		for (i = 0; i < slides.length; i++) {
			slides[i].style.display = "none";
		}
		for (i = 0; i < dots.length; i++) {
			dots[i].className = dots[i].className.replace(" active", "");
		}
		slides[slideIndex - 1].style.display = "block";
		dots[slideIndex - 1].className += " active";
	}
</script>
		
  
  <!-- <marquee behavior="scroll" direction="left" scrollamount="25">
    <img src="/images/pp1.jpg" width="300" height="150" alt="Natural" />
    <img src="/images/pp2.jpg" width="300" height="150" alt="Natural" />
    <img src="/images/pp3.jpg" width="300" height="150" alt="Natural" />
  </marquee> -->
</jsp:attribute>
</mp:Master>
