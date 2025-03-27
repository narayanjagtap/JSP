<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!					//Declaration tag
		int a = 10;
		String name = "Narayan";
		
		int squere(){
			return a*a;
		}
	%>
	
	
	<%								//Scriptlet tag
		out.println("a : " + a);
		out.println("Name : " + name);
		out.println(squere());
		
		int b = 32;
		
		if(b<100){
			out.println("b is less than 100");
		}else{
			out.println("b is greater than 100");
		}
		
		for(int i=0; i<10; i++){
			out.println(i);
		}
		
		//String name = request.getParameter("------------");
	%>
	
	<hr>
	
	<%=name %> <br>	<!-- Expression Tag -->
	<%= a %><br>
	<%= squere() %> <br>
	<%=LocalDate.now() %><br>
	<%=LocalTime.now() %>
</body>
</html>