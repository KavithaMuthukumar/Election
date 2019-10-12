<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
</head>
<body>
	<%!String loginid;%>
	<%!String password;%>
	<%
		loginid = request.getParameter("uname");
		password = request.getParameter("psw");

		if (loginid.equals("admin") && password.equals("admin")) {
			out.println("<h1><center>Welcome Admin</center></h1>");

		} else {
			out.println("<h3>You Are Not An Admin...You Don't Have Authorization to View This Page !!!</h3>");
		}
	%>
	<jsp:include page="electionresult.jsp" />

</body>
</html>