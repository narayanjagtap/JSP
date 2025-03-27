<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = "Sumit";
		out.println(name);
	%>
	
	<%
		session.setAttribute("s_name", "Java full stack");
	%>
	
	<form action="output.jsp" method="get">
		<input type="text" name = "name1" placeholder="Enter your name">
		<input type="submit" value="Submit">
	</form>
</body>
</html>