<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<mp:Master title="">
<jsp:attribute name="head">
<link href="/styles/Menubar.css" rel="stylesheet"/>
</jsp:attribute>
 <jsp:attribute name="content">
<style>
body{  
  font-family: Calibri, Helvetica, sans-serif;
  padding-bottom:50px;
  padding-top:80px;
  width:95%;
  background-image: url('/images/Bank.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;

}  
h1{
color:black;
text-align:center;
}
.center {
  margin-left:auto;
  margin-right: auto;
  margin-top:10%;
}
</style>

<div class="containersss">
<form action="statusCheck">
<table class="center" style="background-color:#c2d6d6">
	
	<tr><td>Enter Token</td>
	<td><input type="text" name="token"></td>
	</tr>
	</table>
	<div class="body">
	<a href="" style="--clr:#ff1867"><span><input type="submit"  style="margin-left: -1%;background-color:#ff1867;border:none"></span><i></i></a>
</div>
      


<h1><a:out value="${user}"></a:out></h1><br>
<h1><a:out value="${password}"></a:out></h1>
<h1><a:out value="${pending}"></a:out></h1>
<h1><a:out value="${doesntExist}"></a:out></h1>
<h1><a:out value="${Rejected}"></a:out></h1>
<div class="body">
	<a href="loginpage" style="--clr:#ff1867"><span>Login</span><i></i></a>
</div>
</form>
</div>
</jsp:attribute>
 </mp:Master>>
