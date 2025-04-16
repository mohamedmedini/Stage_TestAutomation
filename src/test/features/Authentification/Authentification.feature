Feature: je vérifie la connexion à Studdify 
  en tant que collaborateur je veux acceder a mon compte Studdify

  @Studdify_Ahtnentification
  Scenario: connecter à Studdify  
    Given je saisis url "https://staging.erudaxis.com/"
    When je saisis le login "medinimed89@gmail.com"
    And je saisis le mot de passe "Mohamed@123"
    And je clique sur le bouton login
    Then je verifie la connexion par le texte "General Statistics"