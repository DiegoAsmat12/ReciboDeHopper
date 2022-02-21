<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<title>Recibo de Hopper</title>
	</head>
	<body>
		<h1>Customer Name: <c:out value="${nombre}"></c:out></h1>
		<p>Item name: <c:out value="${item}"></c:out></p>
		<p>Price: $<c:out value="${precio}"></c:out></p>
		<p>Description: <c:out value="${descripcion}"></c:out></p>
		<p>Vendor: <c:out value="${ vendedor }"></c:out></p>
	</body>
</html>