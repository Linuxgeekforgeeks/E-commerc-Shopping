<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 Style="text-align='center'; color='red';">Welcome</h3>
<% 
String string=request.getAttribute("label").toString();
%>
<c:out value="This is Awosome ${label}" />
<c:out value=".Right?"></c:out><br>

<%-- <c:import url="http://google.com" /> --%>

</body>
</html>