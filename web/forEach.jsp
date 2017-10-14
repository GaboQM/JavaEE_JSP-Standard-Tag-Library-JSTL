<%-- 
    Document   : forEach
    Created on : 12/10/2017, 01:38:08 PM
    Author     : gaboqm
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>For each con JSTL</h3>
        <jsp:useBean id="l" scope="session" class="gabo.corp.com.bean.Lista" />
        <c:forEach var="valor" items="${l.listaNombres}">
            
        <li>
            <c:out value="${valor}"></c:out>
        </li>
            
            
        </c:forEach>
 
    </body>
</html>
