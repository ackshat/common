<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Subscribe Page</h1>

<p>${response}</p>
<p>${error}</p>
<c:url var="saveUrl" value="/krams/main/subscribe" />
<form:form modelAttribute="subscriptionAttribute" method="POST" action="${saveUrl}">
	<table>
		<tr>
			<td><form:label path="id">Id:</form:label></td>
			<td><form:input path="id"/></td>
		</tr>
	
		<tr>
			<td><form:label path="name">Name:</form:label></td>
			<td><form:input path="name"/></td>
		</tr>

		<tr>
			<td><form:label path="email">Email:</form:label></td>
			<td><form:input path="email"/></td>
		</tr>
	</table>
	
	<input type="submit" value="Save" />
</form:form>

</body>
</html>