<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Mostrar salario</title>
	<style>
        table {
        	border: 1px solid black;
        }
        td {
        	font-weight: bold;
        	background-color: black;
        	color: white;
        	width: 100px;
        	text-align: center;
        	border: 1px solid black;
        }
        th {
        	font-weight: bold;
        	background-color: white;
        	color: black;
        	width: 100px;
        	text-align: center;
        	border: 1px solid black;
        }
	</style>
</head>
<body>
	<h1>Mostrando salario del empleado <t:out value="${model.dni}"></t:out></h1>

	<table>
		<tr>
			<td>DNI</td>
			<td>Salario</td>
		</tr>
		<tr>
			<th><t:out value="${model.dni}"></t:out></th>
			<th><t:out value="${model.sueldo}"></t:out></th>
		</tr>
	</table>
</body>
</html>