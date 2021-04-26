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
<div class="d-flex justify-content-around mt-5">
<p style="display:inline;"> Bonjour mr ${sessionScope.utilisateur.nom} ${sessionScope.utilisateur.prenom} </p>
<p style="display:inline; "align="right"><a href="VoirPanier">Voir votre panier</a>.</p>
</div>

<form action="GenererTable" method="GET">
<div align="center" class="mt-5" >
<label> Categorie:</label>
<select name="categorie" >
<c:forEach var="name"  items="${sessionScope['taListe']}" >
          <option value="${name}" <c:if test="${name == sessionScope.selected}">selected</c:if>> ${name} </option>
</c:forEach>
</select>
<input class="btn btn-primary" type="submit" value="ok" />
</div>
          

</form>

<c:if test="${!empty maListe}">
<div class="d-flex justify-content-around mt-5" >
<c:forEach var="item" items="${maListe}">
	<div class="card" style="width: 20rem;" >
<img class="card-img-top" src="${item.image}"> 
  <div class="card-body">
    <b class="card-title d-flex justify-content-around">${item.designation}</b>
    <p class="card-text d-flex justify-content-around">prix: ${item.prix}</p>
    <p class="card-text d-flex justify-content-around">stock: ${item.stock}</p>
    <a href="GenererArticle?param=${item.codeArticle}" class="btn btn-primary d-flex justify-content-around">Ajouter au panier</a>
  </div>
</div>

</c:forEach>
</div>
</c:if>


</body>
</html>