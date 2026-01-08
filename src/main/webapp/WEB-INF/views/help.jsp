<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: rohit
  Date: 11/6/25
  Time: 10:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<%
//    String name = (String) request.getAttribute("name");
//    int rollno = (Integer) request.getAttribute("rollno");
//    LocalDateTime now = (LocalDateTime) request.getAttribute("time");
%>
<body>
<%--    <h1>My name is <%=name%></h1>--%>
<%--    <h1>My rollno is <%=rollno%></h1>--%>
<%--    <h1>The time is now <%= now.toString() %></h1>--%>

    <h1>My name is ${name}</h1>
    <h1>My rollno is ${rollno}</h1>
    <h1>The time is now ${time}</h1>
<%--    <h1>${friends}</h1>--%>
    <c:forEach var="item" items="${friends}">
<%--        <h2>${item}</h2>--%>
      <h1><c:out value="${item}"/><br/></h1>
    </c:forEach>
</body>
</html>
