Feature: Ajouter une nouvelle salle 
  En tant que collaborateur je veux ajouter une nouvelle salle

  Background: 
    Given je saisis url "https://staging.erudaxis.com/"
    When je saisis le login "medinimed89@gmail.com"
    And je saisis le mot de passe "Mohamed@123"
    And je clique sur le bouton login
    Then je verifie la connexion par le texte "General Statistics"

  @Ajouter_Salle
  Scenario: je vérifie l ajout d une nouvelle salle 
    Given je clique sur plan etude
    When je clique sur parametrage
    And je clique sur bloc et salle
    And je clique sur nom des salles
    And je clique sur bouton ajouter salle
    And je saisis le nom de salle "S 716"
    And je saisis le la capacité de la salle "30"
    And je selectionne le type de la salle "Cours"
    And je selectionne le bloc de la salle "Bloc A"
    And je clique sur bouton Ajouter
    Then je vérifie l ajout de nouvelle salle avec le message de popup "La salle ajoutée avec succès"
    And je clique sur bouton OK pour confirmer l ajout et je deconnecte
