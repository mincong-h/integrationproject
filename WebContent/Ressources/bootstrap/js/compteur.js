/*
 * @author TIONO KEVIN - Mincong HUANG
 */

// Declaration des variables

    // Les 2 variables @debut et @now sont définis dans le page JSP
	var fin = debut + 30 * 1000;    // fin de la question, unit=ms
	var reste = Math.floor((fin - now) / 1000); // reste de la question, unit=s
	console.log('reste=' + reste);
	// var reste = 30
	if (reste < 0)
		reste = 0;
    var interval = null
	// Chargement des images representant les chiffre
	Chiffres = new Array(10)	
	for (i=0; i<10; i++) {
		Chiffres[i] = new Image()
		Chiffres[i].src = 'Ressources/images/' + i + '.gif'
	}
     
    
	// Definition de la fonction appelé chaque seconde
	function Ecoule() {
		// On modifie l'affichage
		window.document.dizaine.src = Chiffres[Math.floor(reste/10)].src
		window.document.unite.src = Chiffres[reste%10].src
		if (reste == 0) {
			// modifie par mincong:
			// Une fois les 30 secondes coulees, on ne fait rien.
			// Si joueur clique une proposition, le controlleur ChoisirAction
			// va nous rediriger vers le bon JSP en cas TIME_OUT
			clearInterval(interval)
			// alert('Trop tard !!!')
			interval=null
			//reste=30
			$('#btn-stats').removeClass('hidden');
		}
		reste--
	}
	
