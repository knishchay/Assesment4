<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="view" method="get">

<h1>View available items</h1>
		<table border="1" cellspacing="2" >
			<tr>
				<td>Choose</td>
				<td>Postingtitle</td>
				<td>City&Neighbourhood</td>
				<td>Postalcode</td>
				<td>Description</td>
				<td>Email</td>
			</tr>
			<c:forEach items="${data}" var="b">
				<tr>
					<td> ${b.choose }</td>
					<Td> ${b.postingtitle } </Td>
					<Td> ${b.city } </Td>
					<Td> ${b.postalcode } </Td>
					<Td> ${b.description } </Td>
					<Td> ${b.email } </Td>
				</tr>
			</c:forEach>
		</table>
</form>
<a href="sell.jsp">Add more</a>
<a href="index.jsp">Go to home</a>
</body>
</html>