<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
	<form action="ConfirmerConnexion" method="POST">
	<div class=" d-flex justify-content-center mt-5">
		 <div class="mt-5">
			  <label class="d-flex "for="email">Email:</label><br>
			  <label class="d-flex ">Password:</label><br>
		 </div>
		 <div class="mt-5">
			  	<input class="d-flex ml-5" type="text" id="email" name="email"><br>
			  	<input class="d-flex ml-5"type="password" id="motdepsse" name="motdepasse"><br>
		 </div>
	</div>
	<div class="d-flex justify-content-around mt-5 mb-5">
		  <input class="btn btn-primary d-flex justify-content-around" type="submit" value="s'identifier">
	</div>
	</form> 
</body>
</html>