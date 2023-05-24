<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="up"%>
<up:User title="FEEDBACK FORM">
	<jsp:attribute name="head">
<meta name="viewport" content="width=device-width, initial-scale=1">    
  <link rel="stylesheet" href="/styles/feedback.css">
  <link rel="stylesheet" href="/styles/Menubar.css">
  <link rel="stylesheet" href="/styles/profile.css">
</jsp:attribute>
	<jsp:attribute name="content">
<body> 
<div class="container"> 
<div class="feedback">
<center> <h1>FEEDBACK FORM</h1> </center>  
<p>Dear Customer,<br>
Thank you for getting your car services at our workshop. We would like to know how we performed. Please spare some moments to give us your valuable feedback as it will help us in improving our service.</p>


<br>
<h4>Please rate your service experience for the following parameters</h4>
<br>


<form method="post" action="#action-url">
<label>1. Your overall experience with us ?</label><br>
  
<span class="star-rating">
  <input type="radio" name="rating1" value="1"><i></i>
  <input type="radio" name="rating1" value="2"><i></i>
  <input type="radio" name="rating1" value="3"><i></i>
  <input type="radio" name="rating1" value="4"><i></i>
  <input type="radio" name="rating1" value="5"><i></i>
</span>



 <div class="clear"></div>
  <hr class="survey-hr">
<label>2. Your overall experience with us ?</label><br><br />
  <div style="color: grey">
    <span style="float: left">
     POOR
    </span>
    <span style="float: right">
      BEST
    </span>
   
</div>
<span class="scale-rating">
  	<label value="1">
  		<input type="radio" name="rating">
  		<label style="width: 100%;"></label>
  	</label>
  	<label value="2">
  		<input type="radio" name="rating">
  		<label style="width: 100%;"></label>
  </label>
  <label value="3">
  <input type="radio" name="rating">
  <label style="width: 100%;"></label>
  </label>
  <label value="4">
  <input type="radio" name="rating">
  <label style="width: 100%;"></label>
  </label>
  <label value="5">
  <input type="radio" name="rating">
  <label style="width: 100%;"></label>
  </label>
  <label value="6">
  <input type="radio" name="rating">
  <label style="width: 100%;"></label>
  </label>
  <label value="7">
  <input type="radio" name="rating">
  <label style="width: 100%;"></label>
  </label>
  <label value="8">
  <input type="radio" name="rating">
  <label style="width: 100%;"></label>
  </label>
  <label value="9">
  <input type="radio" name="rating">
  <label style="width: 100%;"></label>
  </label>
  <label value="10">
  <input type="radio" name="rating" value="10">
  <label style="width: 100%;"></label>
  </label>
</span>



 <div class="clear"></div>
  <hr class="survey-hr">
<label for="m_3189847521540640526commentText">3. Any Other suggestions:</label><br /><br />
<textarea cols="75" name="commentText" rows="5" style="background: #d0d0e1"></textarea>
					<br>
<br>
  <div class="clear"></div>
<input
						style="background: #43a7d5; color: #fff; padding: 12px; border: 0"
						type="submit" value="Submit your review">&nbsp;
</form>
   </div>
   </div>
    </body>
</html>
</body>
</jsp:attribute>
</up:User>
</html>