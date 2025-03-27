<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 
	
	<%
		String name = request.getParameter("name1");
		out.println(name);
	%>
	
	 --%>
	
	${param.name1 }	<!-- predefined implicit object of Expression language -->
	
	<hr>
	
	${23 + 23}
</body>
</html>