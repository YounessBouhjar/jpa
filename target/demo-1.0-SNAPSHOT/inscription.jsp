<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inscription</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body class="d-flex justify-content-center mt-5">

<div class="w-50 mt-5 d-flex justify-content-center">
<form action="ConfirmerInscription" method="POST">
								<div class="d-flex justify-content-around mb-5 ">
									<div >
										  <label class="d-flex ml-5"for="nom">Nom:</label></br>
										  <label class="d-flex ml-5"for="prenom">Prenom:</label></br>
										  <label class="d-flex ml-5"for="adresse">Adresse:</label></br>
										  <label class="d-flex ml-5"for="codepostal">CodePostale</label></br>
										  <label class="d-flex ml-5"for="ville">Ville</label></br>
										  <label class="d-flex ml-5"for="tel">Tel:</label></br>
										  <label class="d-flex ml-5"for="email">Email:</label></br>
										  <label class="d-flex ml-5"for="motdepasse">Password:</label><br>
									 </div>       
									 <div class="mt-1">
								  		<input class="d-flex ml-5"type="text" id="nom" name="nom" ></br>
								  		<input class="d-flex ml-5"type="text" id="prenom" name="prenom"><br>
								  		<input class="d-flex ml-5 mb-2"type="text" id="adresse" name="adresse" placeholder="adresse"><br>
								  		<input class="d-flex ml-5 mb-3"type="text" id="codepostal" name="codepostal" placeholder="codepostal"><br>
								  		<input class="d-flex ml-5"type="text" id="ville" name="ville" placeholder="ville"><br>
								  		<input class="d-flex ml-5"type="text" id="tel" name="tel"><br>
								  		<input class="d-flex ml-5 mb-2"type="text" id="email" name="email"><br>
								  		<input class="d-flex ml-5"type="password" id="motdepasse" name="motdepasse"><br>
								  	 </div>
					  			</div> 
  	<div class="d-flex justify-content-around mt-5 mb-5">
  	  <input class="btn btn-primary d-flex justify-content-around" type="submit" value="S'inscrire">
  	  </div>
</form> 
</div>
</body>
</html>