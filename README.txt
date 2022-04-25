Demo d'un Micro-Service qui permet de déployer des WS basés sur Spring Data REST.

URL pour tester les WS DATA REST :

	+ Liste des étudiants:		http://localhost:8080/students
	+ Affiche étudiant par id:	http://localhost:8080/students/id
	
	+ Liste des formations:		http://localhost:8080/trainings
	+ Affiche formation par id:	http://localhost:8080/trainings/id
	
		http://localhost:8080/students?size=2&page=1&sort=name,asc
	
	+ Appel de la méthode findByLastNameContains sans l'annotation @RestResources:
		http://localhost:8080/students/search/findByLastNameContains?nc=L
		http://localhost:8080/students/search/findByLastNameContains?nc=&page=0&size=2
	
	+ Appel de la méthode findByLastNameContains avec l'annotation @RestResources(path="byLastName"):
		http://localhost:8080/students/search/byLastName?nc=L
	
	+ Lorsqu'on utilise des projections nommées 'P1' et 'P2'
		http://localhost:8080/students?projection=P1
		http://localhost:8080/students?projection=P2
	
	+ Si on ajoute /api dans le fichier application.properties
		http://localhost:8080/api/students?projection=P1   
	
 
			
