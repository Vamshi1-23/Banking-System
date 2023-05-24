<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<mp:Master title="Banking System">
<jsp:attribute name="head">
<link href="/styles/aboutus.css" rel="stylesheet"/>
<link href="/styles/Home.css" rel="stylesheet"/>
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
  			 <li style="float:right"><a href="/views/contact.jsp">Contact Us</a></li>
 			 <li style="float:right"><a href="aboutus">About Us</a></li>
		</ul>
		</div>
		</div>
		
		<div class="slideshow-container">

  <!-- Full-width images with number and caption text -->
  <div class="mySlides fade">
    <div class="numbertext"></div>
    <img src="images/pp1.jpg" style="width: 100%; height:100%">
    
  </div>

  <div class="mySlides fade">
    <div class="numbertext"></div>
    <img src="images/pp2.jpg" style="width: 100%; height:100%">
    <div class="text">Security</div>
  </div>

  <div class="mySlides fade">
    <div class="numbertext"></div>
    <img src="images/pp3.jpg" style="width: 100%; height:100%">
    <div class="text">Safety</div>
  </div>

  <!-- Next and previous buttons -->
  <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
  <a class="next" onclick="plusSlides(1)">&#10095;</a>
</div>
<br>
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

</jsp:attribute>
</mp:Master>
