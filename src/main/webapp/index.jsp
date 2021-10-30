<%--
  Created by IntelliJ IDEA.
  User: igorp
  Date: 29.10.2021
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
 <c:when test="${not empty books}">
     <table>
         <tr>
             <th>id</th>
             <th>Title</th>
             <th>Author</th>
             <th>Date</th>
         </tr>
         <c:forEach var="book" items="${books}">
             <tr>
                 <td>${book.id}</td>
                 <td>${book.title}</td>
                 <td>${book.author}</td>
                 <td>${book.date}</td>
             </tr>
         </c:forEach>

     </table>
 </c:when>
 <c:otherwise>
     <p style="color: #ff0000">${message}</p>
 </c:otherwise>
</c:choose>

</body>
</html>
