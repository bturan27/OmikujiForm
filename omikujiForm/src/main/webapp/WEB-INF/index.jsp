<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <!-- c:out ; c:forEach ; c:if -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   <!-- Formatting (like dates) -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
   <!-- form:form -->
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
   <!-- for rendering errors on PUT routes -->
 <%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title Here</title>
  <!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
      rel="stylesheet" 
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
      crossorigin="anonymous">
</head>
<body>
	<h1> Send an Omikuji!</h1>
	<form action="/omikuji/processing" method="post">
	<div>
		<label for="random">Pick any number from 5 to 25</label>
		<input type="number" name="random">
	</div>	
	<div>
		<label for="city">Enter the name of any city</label>
		<input type="text" name="city">
	</div>
		<label for="person">Enter the name of any real person</label>
		<input type="text" name="person">
	<div>
		<label for="hobby">Enter professional endeavor or a hobby</label>
		<input type="text" name="hobby">
	</div>
	<div>
		<label for="living">Enter any type of living thing.</label>
		<input type="text" name="living">
	</div>	
		<div>
		<label for="nice">Say something nice to someone</label>
		<input type="text" name="nice">
	</div>
		<h3> Send and show a friend</h3>
		<input type="submit" value="Send" >

	</form>
</body>
</html>