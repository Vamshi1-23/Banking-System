<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="title" required="true" rtexprvalue="true"%>
<%@ attribute name="head" fragment="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="z" %>
<%@ attribute name="content" fragment="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title}</title>
<link href="/styles/Menubar.css" rel="stylesheet"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" />
    
    <!-- Custom  css file -->
    <link rel="stylesheet" href="/styles/profile.css">
</head>



   <div  style="position:absolute;left:0px;top:0px;width:100%;height:12%" class="master">
        <img src="/images/BankLogo.PNG" style="width:10%;height:100%">
    </div>
    <div class="header">
      <h1 style="margin-top: 10px">Tech Bank</h1>
      <div class="log">
						<a id="logs" href="logout"><h3>Logout</h3></a>
						</div>
    </div>
    <div class="footer"> @Copyright-TECH BANK-2022- All Right Reserved.   
    </div>  
<header>
    <div class="user">
        <image src="/images/pp5.jpg" alt="">
    <h3 class="name">Hi <z:out value="${sessionScope.userName}"></z:out></h3>
    
    </div>
    <nav class="navbar">
        <ul>
            <li><a href="userHome">Home</a></li>
            <li><a href="userprofile">Profile</a></li>
            <li><a href="checkbalpage">Check Balance</a></li>
            <li><a href="withdrawpage">Withdraw</a></li>
            <li><a href="depopage">Deposit</a></li>
            <li><a href="feedback">Feedback</a></li>
            <li><a href="TransactionsForUser">Transactions</a></li>
        </ul>
    </nav>
    </header>
<jsp:invoke fragment="head" ></jsp:invoke>
<jsp:invoke fragment="content"></jsp:invoke>

</body>
</html>