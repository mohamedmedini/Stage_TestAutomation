Feature: Suppression d une salle
   en tant que collaborateur je veux supprimer une salle

  Background: 
    Given je saisis url "https://staging.erudaxis.com/"
    When je saisis le login "medinimed89@gmail.com"
    And je saisis le mot de passe "Mohamed@123"
    And je clique sur le bouton login
    Then je verifie la connexion par le texte "General Statistics"
    
    Given je clique sur plan etude
    When je clique sur parametrage
    And je clique sur bloc et salle
    And je clique sur nom des salles

  @SuppresionSalle
  Scenario: je vérifie la suppression d une salle
    Given je cherchere la salle "S 400"
    When je clique sur bouton supprimer
    And je clique bouton OUI Supprimer de popup
    Then je vérifie la suppression de la salle avec le message popup "La salle a été supprimée avec succès."
    And je déconnecte
