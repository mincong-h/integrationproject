<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inscription</title>
<link href="Ressources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type ="text/css">
<link href="Ressources/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" type ="text/css">
<link href="Ressources/bootstrap/css/style.css" rel="stylesheet" type ="text/css">
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<h1>Inscription</h1>
	<hr>
  <form class="form-horizontal">
	  <div class="form-center">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-xs-6 col-sm-4 control-label"><span class ="glyphicon glyphicon-user"></span> Adresse mail</label>
		    <div class="col-xs-6 col-sm-4">
		      <input type="email" class="form-control" name="mail" placeholder="nom@domain.com">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword3" class="col-xs-6 col-sm-4 control-label"><span class ="glyphicon glyphicon-lock"></span> Mot de passe</label>
		    <div class="col-xs-6 col-sm-4">
		      <input type="password" class="form-control" name="mdp" placeholder="Password">
		    </div>
		  </div>
		  <div class="form-group">
		  	<label for="inputPassword3" class="col-xs-6 col-sm-4 control-label"></label>
		    <div class="col-xs-6 col-sm-4">
		      <input type="password" class="form-control" name="reMdp" placeholder="Re-Password">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="nom" class="col-xs-6 col-sm-4 control-label">Nom</label>
		    <div class="col-xs-6 col-sm-4">
		      <input type="password" class="form-control" name="nom" placeholder="Nom">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="prenom" class="col-xs-6 col-sm-4 control-label">Prenom</label>
		    <div class="col-xs-6 col-sm-4">
		      <input type="password" class="form-control" name="prenom" placeholder="Prenom">
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-xs-6">
		      <button type="submit" class="btn btn-primary">S'inscrire</button>
		      <button type="Reset" class="btn btn-primary">Annuler</button>
		    </div>
		  </div>
	  </div>
</form>
</div>
</body>
</html>