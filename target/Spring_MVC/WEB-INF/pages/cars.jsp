<%--
  Created by IntelliJ IDEA.
  User: klvdo
  Date: 16.05.2020
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title>Cars list</title>
</head>
<body>
<a href="?locale=en">en</a> | <a href="?locale=ru">ru</a>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2><s:message code="listAllCars"/></h2></caption>
        <h1><s:message code="cars"/></h1>
        <tr>
            <th><s:message code="id"/></th>
            <th><s:message code="licensePlate"/></th>
            <th><s:message code="model"/></th>
        </tr>
        <c:forEach var="car" items="${cars}">
            <tr>
                <td><c:out value="${car.id}"/></td>
                <td><c:out value="${car.licensePlate}"/></td>
                <td><c:out value="${car.model}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
