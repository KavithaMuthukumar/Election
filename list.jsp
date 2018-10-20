<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<h1> the list of orders you have placed</h1>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>the orders are</h2>
<table border=2>
		<thead>
			<tr>
				<th>Orderno</th>
				<th>Quantity</th>
				<th>Amount</th>
				<th>Fooditem</th>
				<th>Customername</th>
				<th>Customeraddress</th>
</tr>
		</thead>
		<tbody>
		<c:forEach var="food" items="${EMPLIST}">
				<tr>
					<td>${food.orderNo}</td>
					<td>${food.quantity}</td>
					<td>${food.amount}</td>
					<td>${food.foodItem}</td>
					<td>${food.customerName}</td>
					<td>${food.customerAddress}</td>
					</tr>
					</c:forEach>
					</tbody>
					</table>
					</body>
</html>