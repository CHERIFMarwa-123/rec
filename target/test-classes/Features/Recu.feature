Feature: Feature to test received functionality

  Background: 
    Given user clicks recu link
    Then user clicks ajouter recu

  @Smoke
  Scenario: User test recu with valid functionality
    Given User enters a valid technicien
    And user enters a valid date
    And user enter a valid categorie
    And user enter a valid picture
    And user enter a valid price
    And user enter a valid TVA
    Then user clicks ajouter un recu

  @Smoke
  Scenario: User test recu with empty picture
    Given User enters a valid technicien
    And user enters a valid date
    And user enter a valid categorie
    And user leaves the picture field blank 
    And user enter a valid price
    And user enter a valid TVA
    Then The boutton ajouter un recu isdisabel
    
  @Smoke 
  Scenario: User test recu with empty price
    Given User enters a valid technicien
    And user enters a valid date
    And user enter a valid categorie
    And user enter a valid picture
    And user leaves the price field blank 
    And user enter a valid TVA
    Then The boutton ajouter un recu isdisabel
  
   @Smoke 
  Scenario: User test recu with empty TVA
    Given User enters a valid technicien
    And user enters a valid date
    And user enter a valid categorie
    And user enter a valid picture
    And user enter a valid price
    And user leaves the TVA field blank 
    Then The boutton ajouter un recu isdisabel