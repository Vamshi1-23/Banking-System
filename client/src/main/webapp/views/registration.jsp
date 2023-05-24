<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<mp:Master title="Registration Form">
<jsp:attribute name="head">
<style>
body{  
  font-family: Calibri, Helvetica, sans-serif;
  padding-bottom:50px;
  padding-top:80px;
  width:70%;
  background-image: url('/images/Bank.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;

}  
.container {  
    padding: 50px;
    width:70%;
    height:100%;
  margin-left:38%;
  border-style: solid;
  background-color:#d1d1e0;
  
}  
  
input[type=text], input[type=password], textarea {  
  width: 100%;  
  padding: 15px;  
  margin: 5px 0 22px 0;  
  display: inline-block;  
  border: none;  
  background: #f1f1f1;  
}  
input[type=text]:focus, input[type=password]:focus {  
  background-color:#a1b9c7;  
  outline: none;  
}  
div {  
            padding: 10px 0;  
         }  
hr {  
  border: 1px solid #f1f1f1;  
  margin-bottom: 15px;  
}  
.registerbtn {  
  background-color: #4CAF50;  
  color: white;  
  padding: 16px 20px;  
  margin: 8px 0;  
  border: none;  
  cursor: pointer;  
  width: 100%;  
  opacity: 0.9;  
}  
.registerbtn:hover {  
  opacity: 1;  
} 
.print{
 
  color: Black;  
	margin-left:40%;
  border:solid;  
  opacity: 0.9;  
} 
</style>   
</jsp:attribute>
  <jsp:attribute name="content">

<body>  
<form action="insertnewUser" method="post">  
  <div class="container">  
  <center><h1>Bank Account Registration Form</h1></center><br>
  <label><b> First Name: </b></label>
<input type="text" name="fName" placeholder= "Firstname" size="15" required name="fname"/>   

<label><b> Last Name: </b> </label> 
<input type="text" name="lName" placeholder="Lastname" size="15" required name="lname"/>

<label for="email"><b>E-mail:</b></label>  
<input type="email" placeholder="Enter Email" name="email" required>     
<div>  
<label> <b>
Gender : </b>
</label>  
<input type="radio" value="Male" name="gender"  checked> Male   
<input type="radio" value="Female" name="gender"> Female   
<input type="radio" value="Other" name="gender"> Other  
  
</div>  

<label><b> Date Of Birth: </b></label> 
<input type="date"  name="dob"><br>
<label><b><br>Phone :  </b></label>      
<input type="number" name="phNo" placeholder="Mobile number" maxlength="10" minlength="10" pattern="[0-9]{10}" title="Enter valid 10 digit Mobile number" required><br><br>
<label><b>Nationality</b></label>
<input type="text" name="nationality" required>
<label><b>  Aadhar Number:  </b></label>      
<input type="text" name="aadhar" placeholder="Aadhar number" maxlength="12" minlength="12" pattern="[0-9]{12}" title="Enter valid 12 digit Aadhar number" required>
<b>Address :</b>  
<textarea cols="80" rows="5" name="address" placeholder="Address"  required>  
</textarea>
<div>   
<label><b>Branch Location : </b></label>
<select name="ifsc">
					<option value="-1">--SELECT--</option>
               			 <a:forEach var="b" items="${bb}">
                		
                        <option value="${b.getIfsc()}">${b.getCity()}</option>
                		</a:forEach>
                </select>
</div>   

<h1><center><input type="submit" name="submit" style="background-color:green"></center></h1>
 
    
       <center><h1> <a:out value="${msg}"></a:out><br></h1></center>
         <center><h1> <a:out value="${msg1}"></a:out><br></h1></center>
         <div class="body">
	<a href="Status" style="--clr:#ff1867"><span>check status</span><i></i></a>
</div>
       
    </div>
    
    
    </form>
</body>
</jsp:attribute>
  </mp:Master>
</html>