<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3">
<thead>
<tr>
<th>
customer number
</th>
<th>
Customer name	
</th>
<th>
Customer city
</th>
<th>
cutomer Rating
</th>
<th>customer sum</th>
<th>delete/edit</th>
</tr>
</thead>
<tbody>

<c:forEach var="cust" items="${list}">
<tr>
<td>${cust.cnum }</td>
<td>${cust.cname }</td>
<td>${cust.city }</td>
<td>${cust.rating }</td>
<td>${cust.snum }</td>
<td><a href="deletecust?cnum=${cust.cnum}">delete</a>/<a href="editcust?cnum=${cust.cnum }">edit</a></td>
 </c:forEach>
</tbody>
</table>
</body>
</html>