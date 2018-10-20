<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Your Food!!</title>
</head>
<body background="C:\Users\Kavi\Desktop\Kavi\Recipes.jpg">

	<form action="UpdateServlet" method="post">
			<div style="text-align: center">
	
		<h1><p align="center"><br><br>
		Order No:<input type="text" name="ono" value="${EMPLOYEE.orderNo}">
		</p>
		<p align="center">
			Foodname:<input type="text" name="foodname"
				value="${EMPLOYEE.foodItem}" required autofocus />
		</p>
		<p align="center">
			<input type="submit" value="Update">
		</p></h1>
		</div>
		</form>
</body>
</html>