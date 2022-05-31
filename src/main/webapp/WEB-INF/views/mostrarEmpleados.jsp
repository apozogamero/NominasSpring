<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Lista Empleados</title>
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
	<h1>Lista de empleados</h1>

	<table>
		<tr>
			<td>Nombre</td>
			<td>DNI</td>
			<td>Sexo</td>
			<td>Categoría</td>
			<td>Años</td>
		</tr>
		<c:forEach var="emp" items="${model.listaEmp}">
			<tr>
				<th><c:out value="${emp.nombre}"></c:out></th>
				<th><c:out value="${emp.dni}"></c:out></th>
				<th><c:out value="${emp.sexo}"></c:out></th>
				<th><c:out value="${emp.categoria}"></c:out></th>
				<th><c:out value="${emp.anyos}"></c:out></th>
			</tr>
		</c:forEach>
	</table>
	
	<br/>
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
</body>
</html>