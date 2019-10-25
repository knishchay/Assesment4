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
<a href="index.jsp">Go to home</a>

<h1>Add </h1>
	<form action="add" method="post">
	<table>
	<tr>
	Choose:
	<select name="choose">
  <option value="community">community</option>
  <option value="events">events</option>
  <option value="sales">sales</option>
  <option value="housing">housing</option>
  <option value="Jobs">Jobs</option>
  <option value="Services">Services</option>
	</select>
	<br>
	<td>Posting title:<br><input type="text" name="postingtitle" /></td>
	<td>City or neighbourhood:<br><input type="text" name="city" /></td>
	<td>Postal code:<br><input type="text" name="postalcode" /></td>
	<td>Description:<br><input type="text" name="description" /></td>
	<td>Email:<br><input type="text" name="email" /></td>
	<td><br><input type="submit" value="add" /></td>
	</table>
	</form>
</body>
</html>