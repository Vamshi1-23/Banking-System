<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="title" required="true" rtexprvalue="true"%>
<%@ attribute name="head" fragment="true"%>
<%@ attribute name="content" fragment="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Branch</title>
<link href="/styles/Menubar.css" rel="stylesheet"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" />
    
    <!-- Custom  css file -->
    <link rel="stylesheet" href="/styles/profile.css">
</head>



   <div  style="position:absolute;left:0px;top:0px;width:100%;height:12%" class="master">
        <img src="/images/BankLogo.PNG" style="width:10%;height:100%">
    </div>
    <div class="header">
        <h2>Tech Bank</h2>
        <div class="log">
						<a id="logs" href="logout"><h3>Logout</h3></a>
						</div>
    </div>
    </div>
    <div class="footer"> @Copyright-TECH BANK-2022- All Right Reserved.   
    </div>  
<header>
    <div class="user">
        <image src="/images/pp5.jpg" alt="">
    <h3 class="name">Hi Admin!</h3>
    
    </div>
    <nav class="navbar">
        <ul>
            <li><a href="adminHome">Home</a></li>
            <li><a href="AdminBranchManager">Branch Manager</a></li>
            <li><a href="getBranches">Branches</a></li>
            <li><a href="adminUserRequests">User Requests</a></li>
               <li><a href="Transactions">Transactions</a></li>
            <li><a href="AdminFeedback">Feedback</a></li>
        </ul>
    </nav>
    </header>
<jsp:invoke fragment="head" ></jsp:invoke>
<jsp:invoke fragment="content"></jsp:invoke>



</body>
</html>
