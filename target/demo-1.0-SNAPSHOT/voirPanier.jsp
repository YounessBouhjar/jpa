<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
<div class="d-flex justify-content-center mt-5"><h1>Bonjour mr ${sessionScope.utilisateur.nom} ${sessionScope.utilisateur.prenom} </h1></div>
<c:if test="${!empty utilisateur.panier}">
<table class="table table-bordered mt-5">
  <tr>
    <th>Code Article</th>
    <th>Designation</th>
    <th>Prix</th>
    <th>Quantite</th>
    <th></th>
  </tr>

<c:forEach var="item" items="${utilisateur.panier}">
	<tr>
 		<tr><td>${item.article.codeArticle}</td>
 		<td>${item.article.designation}</td>
 		<td>${item.article.prix}</td>
 		<td>${item.quantite}</td>
 		<td>
 		<a href="SupprimerArticle?articleasupp=${item.article.codeArticle}&quantite=${item.quantite}">Supprimer </a>
 		</td>		
</tr>
</c:forEach>
</table>
<div class="d-flex justify-content-around">
<a href="AfficherCommandes" class="btn btn-primary mt-5">Commander</a>
</div>
</c:if>
</body>
</html>