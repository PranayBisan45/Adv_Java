<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="Post">
<center>
<pre>
customer id:<input type="number" name="cnum" id="cnum" value="${cust.cnum}" readonly>
customer name:<input type="text" name="cname " id="cname" value="${cust.cname }">
city name :<input type="text" name="city" id="city" value="${cust.city }">
rating :<input type="number" name="rating " id="rating" value="${cust.rating }">
salary :<input type="number" name="sal" id="sal" value="${cust.snum }">
<button type="submit"> submit</button>
</pre>
</center>
</form>

</body>
</html>