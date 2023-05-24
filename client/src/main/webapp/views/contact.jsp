<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<mp:Master title="Banking System">
<jsp:attribute name="head">
 <meta charset="UTF-8" />
  <title>Get In Touch Section</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <meta http-equiv="X-UA-Compatible" content="ie=edge" />
  <link rel="stylesheet" href="style.css" />
  <link rel="preconnect" href="https://fonts.gstatic.com">
  <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="/styles/contact.css" rel="stylesheet"/>
</jsp:attribute>
<jsp:attribute name="content">
<body>
<section class="footer_get_touch_outer">
    <div class="container">
      <div class="footer_get_touch_inner grid-70-30">
        <div class="colmun-70 get_form">
          <div class="get_form_inner">
            <div class="get_form_inner_text">
              <h3>Get In Touch</h3>
            </div>
            <form action="#">
              <div class="grid-50-50">
                <input type="text" placeholder="First Name">
                <input type="text" placeholder="Last Name">
                <input type="email" placeholder="Email">
                <input type="tel" placeholder="Phone/Skype">
              </div>
              <div class="grid-full">
                <textarea placeholder="About Your Project" cols="30" rows="10"></textarea>
                <input type="submit" value="Submit">
              </div>
            </form>
          </div>
        </div>
        <div class="colmun-30 get_say_form">
          <h5>Say Hi!</h5>
          <ul class="get_say_info_sec">
            <li>
              <i class="fa fa-envelope"></i>
              <a href="mailto:">Techbank@gmail.com</a>
            </li>
            <li>
              <i class="fa fa-whatsapp"></i>
              <a href="tel:">+91 7899878790</a>
            </li>
            
          </ul>  
          <ul class="get_say_social-icn">
            <li><a href="#"><i class="fa fa-facebook"></i></a></li>
            <li><a href="#"><i class="fa fa-instagram"></i></a></li>
            <li><a href="#"><i class="fa fa-twitter"></i></a></li>
            <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
          </ul>          
        </div>        
      </div>
    </div>
  </section>
</body>
</jsp:attribute>
</mp:Master>