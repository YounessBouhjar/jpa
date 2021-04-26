<%@ page language="java" import="microprojet.entity.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<div class="d-flex justify-content-center mt-5">
	<h1> Bonjour mr ${sessionScope.utilisateur.nom} ${sessionScope.utilisateur.prenom} </h1>
</div>
	<div class="d-flex justify-content-center mt-5"><a href="GenererTable">Consulter catalogue.</a></div>
	<div class="d-flex justify-content-center mt-5"><a href="VoirPanier">Consulter votre panier.</a></div>
	<div class="d-flex justify-content-center mt-5"><a href="AfficherCommandes">Consulter vos commandes.</a></div> 	


</body>
</html>