<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
    <mp:Master title="Forgot Password">

	<jsp:attribute name="head">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
            integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="https://cdn.lineicons.com/2.0/LineIcons.css" rel="stylesheet">

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous">
        </script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous">
        </script>
        <link href="/styles/Menubar.css" rel="stylesheet"/>
</head>
</jsp:attribute>
 <jsp:attribute name="content">
<body>
<body class="auth_class">

        <div class="container-fluid login-container text-center">
       
             
            <div class=" login-form">
                <div class="login_form_in">

                  <h1 class="auth_title text-left">Password Reset</h1>
                  <form>
                    <div class="alert alert-success bg-soft-primary border-0" role="alert">
                        Enter a registered mobile number we will send an otp.
                    </div>                    
                    <div class="form-group">
                      <input type="text" class="form-control" name="email" placeholder="Mobile number" maxlength="10" minlength="10" pattern="[0-9]{10}" title="Enter a valid 10 digit mobile number" required >
                    </div>
                     <div class="form-group">
                     <input type="submit" class="btn btn-primary btn-lg btn-block" name="" value="Send">
                    </div>
                     <div class="form-group">
                      <input type="text" class="form-control" name="otp" placeholder="Enter the otp" maxlength="4" minlength="4" pattern="[0-9]{4}" title="4 digit number: e.g. 1234" required  >
                    </div>
                    <div class="form-group">
                      <input type="password" class="form-control" name="password" placeholder="Enter the new Password" maxlength="4" minlength="4" pattern="[0-9]{4}" title="4 digit number" required >
                    </div>
                     <div class="form-group">
                     <input type="password" class="form-control" name="password" placeholder="Confirm the new password" maxlength="4" minlength="4" pattern="[0-9]{4}" title="4 digit number" required >
                    </div>
                    <div class="form-group">
                      <input type="submit" class="btn btn-primary btn-lg btn-block" name="" value="submit">
                    </div>
                    <div class="form-group other_auth_links">
                        <a href="/views/account.jsp">Login</a>
                       
                    </div>
                  </form>
                </div>
            </div>
 </div>       
         
</body>
</jsp:attribute>
  </mp:Master>
</html>