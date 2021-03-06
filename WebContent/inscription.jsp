<!-- Projet d'intégration GSI IR -->
<!-- @uthor TIDJANI ENRIFATH -->
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<jsp:include page="/header.jsp"></jsp:include>
<body style="background-color: #03A9F4;">
<div class="container">
  <div class="row" style="margin: 50px 0;">
    <div class="col-xs-12 col-md-6 col-md-offset-3 text-center">
      <img src="<%=request.getContextPath() %>/Ressources/images/quiz-gsi.png" alt="Quiz GSI logo" class="img-rounded img-responsive">
    </div>
  </div>
<div class="jumbotron" style="background-color: rgba(255, 255, 255, .9); box-shadow: 2px 2px 5px black;">
	<h1 style="text-align:center">Inscription</h1>
	<hr>
  <form id="inscriptionForm" class="form-horizontal" method="post" action="<%=request.getContextPath()%>/Inscrire.do" >
	  <div class="form-center">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-4 control-label"><span class ="glyphicon glyphicon-user"></span> Adresse mail</label>
		    <div class="col-sm-6 col-lg-5">
		      <input type="email" class="form-control" name="mail" placeholder="nom@domain.com">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-4 control-label"><span class ="glyphicon glyphicon-lock"></span> Mot de passe</label>
		    <div class="col-sm-6 col-lg-5">
		      <input type="password" class="form-control" name="mdp" placeholder="Password">
		    </div>
		  </div>
		  <div class="form-group">
		  	<label for="inputPassword3" class="col-sm-4 control-label"><span class ="glyphicon glyphicon-lock"></span> Confirmation</label>
		    <div class="col-sm-6 col-lg-5">
		      <input type="password" class="form-control" name="reMdp" placeholder="Re-Password">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="nom" class="col-sm-4 control-label">Nom</label>
		    <div class="col-sm-6 col-lg-5">
		      <input type="text" class="form-control" name="nom" placeholder="Nom">
		    </div>
		     <span class="col-xs-6 col-sm-4"></span>
		  </div>
		  <div class="form-group">
		    <label for="prenom" class="col-sm-4 control-label">Prenom</label>
		    <div class="col-sm-6 col-lg-5">
		      <input type="text" class="form-control" name="prenom" placeholder="Prenom">
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-4 col-sm-10 col-lg-8">
		      <button type="submit" name="signup" class="btn" style="background-color: #FF4081; color: #FFF">S'inscrire</button>
		      <a href ="<%=request.getContextPath()%>/"><button type="Reset" class="btn" style="background-color: #A4A4A4; color: #FFF">Annuler</button></a>
		    </div>
		  </div>
	  </div>
</form>
</div>
</div>
<jsp:include page="/footer.jsp"></jsp:include>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   