Feature: Feature to test login functionality


  Scenario: invalid username
    Given User enters  invalid username and valid password
    When System should display an appropriate error message is Utilisateur non trouvé
    Then User clicks ok button

 
  Scenario: invalid password
    Given User enters a valid username and invalid password
    When System should display an appropriate error message Svp vérifiez votre mot de passe
    Then User clicks ok button

 
  Scenario: Empty username
    Given User enters a valid password  and empty username
    When System should display an appropriate error message Svp vérifiez votre email
    Then User clicks ok button

  
  Scenario: Valid Credentials
    Given User enters a valid username and password
    When Successful login into the system and appropriate successful message Vous êtes connecté
    Then User clicks ok button and navigate to home page   
    
    