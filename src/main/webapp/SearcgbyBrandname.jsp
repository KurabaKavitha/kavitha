<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FuelBunk</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>

<nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
   	<img alt="" src="C:\Users\DELL\OneDrive\Desktop\Mp\fuellogo.png" width="150" height="100" class="d-inline-block align-text-top">
    </a>
    <a href="fuel">Select</a>
     <a href="index.jsp">Home</a>
  </div>
</nav>
<h1>Welcome to PetrolBunk.....</h1>
<h3>
<span style="color:red">${message}</span>
</h3>
<form action="SearchbybrandName" method="get">
Search By BrandName : <input type="text" name="brandName"/>
		<input type="submit" value="Search"/>
	</form>
	<div>
	<table border="1">
	<tr>
	<th>ID</th>
	<th>BrandName</th>
	<th>Type</th>
	<th>Price</th>
	</tr>
	<c:forEach items="${list}" var="t">
	<tr>
	<td>${t.id}</td>
	<td>${t.brandName}</td>
	<td>${t.type}</td>
	<td>${t.price}</td>
	</tr>
	</c:forEach>
	
	
	</table>
	
	</div>

</body>
</html>