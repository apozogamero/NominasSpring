<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
 	<meta charset="UTF-8">
 	<title>Index</title>
 	<style>
        body {
            text-align: center;
            display: flex;
            justify-content: center;
            flex-flow: row wrap;
        }
        h1 {
        	width: 100%;
        	margin-bottom: 50px;
        }
        div {
        	width: 250px;
        	padding: 15px 10px;
        	border: 1px solid black;
        	margin: 0 10px;
        }
 	</style>
</head>
<body>
	<h1>Nóminas Web App</h1>
	<div>
    	<a href="<c:url value="getEmpleadoAll.htm"/>">Mostrar todos los empleados</a>
	</div>
	<div>
    	<a href="<c:url value="getSalario.htm"/>">Mostrar el salario de un empleado</a>
	</div>
</body>
</html>