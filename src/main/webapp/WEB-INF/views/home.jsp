<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: rohit
  Date: 11/4/25
  Time: 4:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    String msg = (String) request.getAttribute("msg");
    long phno = (Long) request.getAttribute("phno");
    List<String> friends = (List<String>) request.getAttribute("friends");
%>

<%=msg%>
<br>
<%=phno%>
<br>
<%
    for(String friend : friends){
        out.println(friend + "<br>");
    }
%>

</body>
</html>
