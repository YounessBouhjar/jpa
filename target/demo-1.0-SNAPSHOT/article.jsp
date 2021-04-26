<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body class="d-flex justify-content-center mt-5">
<p> Fiche  : ${article.designation} </p> <br>
<div class="w-50 mt-5 d-flex justify-content-center">
	
	<form  method="GET" action="AjouterAuPanier">
							<div class="d-flex justify-content-around mb-5 ">
								<div>
									<label class="d-flex " >Code Article :</label></br>
									<label class="d-flex " >Designation:</label></br>
									<label class="d-flex ">Prix :</label></br>
									<label class="d-flex " >Categorie :</label></br>
									<label class="d-flex " >En Stock :</label></br>
									<label class="d-flex " >Combien voulez-vous :</label>
								</div>
								<div>
							  		<input class="d-flex " type="text" value="${article.codeArticle}" name="param" readonly></br>
							 		 <input class="d-flex mb-2"type="text" value="${article.designation}" readonly></br>
							 		 <input class="d-flex  mb-2"type="text" value="${article.prix}" readonly></br>
							  		 <input class="d-flex "type="text" value="${article.categorie.categorie}" readonly></br>
									 <input class="d-flex "type="text" value="${article.stock}" readonly> </br>
									 <input class="d-flex "type="text" name="quantite"></br>
								 </div>
						  	</div>
	  	<div class="d-flex justify-content-around mt-5 mb-5">
		<input  class="btn btn-primary d-flex justify-content-around" type="Submit" value="Ajouter au panier" >
	</div>
	</form>
</div>
</body>
</html>