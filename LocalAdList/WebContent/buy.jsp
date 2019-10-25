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
<form action="searchtobuy" method="get">

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
					<Td> ${b.choose }</Td>
					<Td> ${b.postingtitle } </Td>
					<Td> ${b.city } </Td>
					<Td> ${b.postalcode } </Td>
					<Td> ${b.description } </Td>
					<Td> ${b.email } </Td>
				</tr>
			</c:forEach>
		</table>
</form>
Enter the Posting Title:
<input type="text" name="search">
<button type="submit">search</button>
<form action="searchtobuy" method="post">
<table border="1" cellspacing="2" >
			<tr>
				<td>Choose</td>
				<td>Postingtitle</td>
				<td>City&Neighbourhood</td>
				<td>Postalcode</td>
				<td>Description</td>
				<td>Email</td>
			</tr>
			<c:forEach items="${sss}" var="l">
				<tr>
					<Td> ${l.choose }</Td>
					<Td> ${l.postingtitle } </Td>
					<Td> ${l.city } </Td>
					<Td> ${l.postalcode } </Td>
					<Td> ${l.description } </Td>
					<Td> ${l.email } </Td>
				</tr>
			</c:forEach>
		</table>
</form>
</body>
</html>