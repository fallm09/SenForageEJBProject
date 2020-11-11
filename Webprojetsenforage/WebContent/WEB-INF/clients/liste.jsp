<jsp:include page="/header.jsp"></jsp:include>
<jsp:include page="/footer.jsp"></jsp:include>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clients</title>
</head>
<body>
	<pre>
		<form method="post" action="Clients">
			    <label>Nom</label>
				<input type ="text" name="nom"/>
				<label>Prenom</label>
				<input type="text" name="prenom"/>
				<label>Village</label>
				<input type="text" name="village"/>
				<label>Adresse</label>
				<input type="text" name="adresse"/>
				<label>Numero de Telephone</label>
				<input type="text" name="numero"/>
		
				<input type="submit" name="Envoyer"/>
		</form>
	</pre>

</body>
</html>