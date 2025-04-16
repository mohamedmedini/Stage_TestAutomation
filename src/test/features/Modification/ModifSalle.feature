Feature: Modification d une  salle
    En tant que collaborateur je veux changer les données d une salle afin de la modifier

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

  @Modifier_Salle
  Scenario: je vérifie la modification de la salle 
    Given je cherche la salle a modifer "S 716"
    And je clique sur icon stylo
    When je change le nom de salle "S 400"
    And je change la capacité de la salle "50"
    And je change  le type de la salle "TD"
    And je clique sur bouton Modifier
    Then je vérifie la modification de nouvelle salle avec le message popup "La salle a été modifiée avec succès."
    And je clique sur bouton OK pour con firmer la modification et je deconnecte
