<%@page import="com.adith.web.model.Tech"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="green">
    I AM NOT A GOOD BAD GUY
    
    <%
    
      Tech o = (Tech)request.getAttribute("tech");
      out.println(o);
    %>
</body>
</html>