<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
        
    <form action="insertnewUser">
        <table
            style="position: absolute; top: 30vh; border-spacing: 20px; background-color: silver;">
            
            <tr>
                <td>First Name</td>
                <td><input type="text" name="fName"></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input type="text" name="lName"></td>
            </tr>
<tr>
                <td>E-mail</td>
                <td><input type="email" name="email"></td>
            </tr>
            <tr>
                <td>Gender</td>
                <td><input type="radio" name="gender" value="male">Male
				<input type="radio" name="gender" value="female">Female
				<input type="radio" name="gender" value="trans">Trans</td>
            </tr>
            <tr>
                <td>Date Of Birth</td>
                <td><input type="date" name="dob"></td>
            </tr>
            <tr>
                <td>Mobile Number</td>
                <td><input type="text" name="phNo"></td>
            </tr>
            <tr>
                <td>Nationality</td>
                <td><input type="text" name="nationality"></td>
            </tr>
            <tr>
                <td>Aadhar Number</td>
                <td><input type="text" name="aadhar"></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" name="address"></td>
            </tr>
            <tr>
                <td>Branch Location</td>
				<td><select name="ifsc">
					<option value="-1">--SELECT--</option>
               			 <a:forEach var="b" items="${bb}">
                		
                        <option value="${b.getIfsc()}">${b.getIfsc()}</option>
                		</a:forEach>
                </select></td>
			</tr>
             
            <tr>
                <td>Insert</td>
                <td><input type="submit" name="submit"></td>
            </tr>
        </table>
        	<h1><a:out value="Your Request is granted"></a:out></h1><br>
           <a:out value="${granted}"></a:out>
        <a:out value="${msg}"></a:out><br>
         <a:out value="${pgranted}"></a:out>
         <a:out value="${password}"></a:out>
        
    </form>





</body>
</html>