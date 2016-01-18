<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
    <%@ page import="fr.esigelec.quiz.dto.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Animateur</title>
<link href="Ressources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type ="text/css">
<link href="Ressources/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" type ="text/css">
<link href="Ressources/bootstrap/css/style.css" rel="stylesheet" type ="text/css">
<link href="Ressources/fonts/font-awesome.min.css" rel="stylesheet" type ="text/css">
<script src="Ressources/Jquery/jquery.min.js"></script>
<script src="Ressources/bootstrap/js/bootstrap.min.js"></script>
<script src="Ressources/bootstrap/js/compteur.js"></script>
</head>
<body onload="if (!interval) { interval=setInterval(Ecoule, 1000) }">
<%
int count=Integer.parseInt(request.getParameter("compteur"));

%>

<div class="form-center animateur">
<button class="btn btn-primary">Afficher statistiques</button>
<button class="btn btn-primary">Afficher bonne réponse</button>	
<a href="Compteur.do?compteur=<%=count+1%>"><button class="btn btn-primary" id="suivant">Question suivante</button></a>
<%
//Quiz q=(Quiz)request.getAttribute("quiz");
//List<Question> listq=q.getListeQuestions();
Proposition pro1 = new Proposition("proposition1");
Proposition pro2 = new Proposition("proposition2");
List<Proposition> list = new LinkedList<Proposition>();
list.add(pro1);
list.add(pro2);
Question question = new Question("question1",pro1,list);
Proposition prop11 = new Proposition("proposition11");
Proposition prop22 = new Proposition("proposition22");
List<Proposition> list1 = new LinkedList<Proposition>();
list1.add(prop11);
list1.add(prop22);
Question question1 = new Question("question2",prop11,list1);
List<Question> listq= new LinkedList<Question>();
listq.add(question);
listq.add(question1);
%>

<h1>Question n°<%=count%></h1>
</div>
<hr>
<div class="form-center">
<p class="paraanimateur"><strong>Reste :</strong>  &nbsp;
 <IMG HSPACE=0 NAME="dizaine" SRC="Ressources/images/3.gif">
		<IMG HSPACE=0 NAME="unite" SRC="Ressources/images/0.gif">
 &nbsp;secondes</p>
			<table id="tab" class="table table-bordered table-hover">
				<thead>
					<tr>
						<th><%=listq.get(count).getLibelle()%></th>
						
					</tr>
				</thead>
				<tbody>
				<%for(int j=0;j<listq.get(count).getListePropositions().size();j++){ %>
					<tr>
						<td><a id="test" href="#"><%=listq.get(count).getListePropositions().get(j).getLibelle()%></a></td>
					</tr>
					<%} %>
				</tbody>
			</table>
			</div>
</body>
</html>