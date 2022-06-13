<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Buscar empleado</title>
</head>
<body>
	<h1>Buscar empleado</h1>
	
	<form:form method="post" modelAttribute="nominaModel" action="procesarForm.htm">
  		<form:label path="dni">DNI del empleado:</form:label>
  		<form:input path="dni"/>
		<input type="submit" value="Buscar">
	</form:form>
	
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
</body>
</html>