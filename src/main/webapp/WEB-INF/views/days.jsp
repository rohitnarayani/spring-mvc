<%--
  Created by IntelliJ IDEA.
  User: rohit
  Date: 1/6/26
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var="day" items="${days}">
        <h1><c:out value="${day}"/><br/></h1>
    </c:forEach>
</body>
</html>
