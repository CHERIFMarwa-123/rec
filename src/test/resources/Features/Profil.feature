Feature: Feature to test profil functionality

  Background: 
    Given user clicks company link
    Then user clicks profile link

  @Smoke
  Scenario: User test profile functionality
    Given user update new logo
    When user clicks mis a jours link
    And user enters description
    And user enters company
    And user enters siret
    And user enters adress
    And user enters phone number
    And user clicks enregistrer les changements
    And verify that a success message is displayed Votre compte est mis à jour ! and clicks ok boutton
    Then verify that the new information is disable in the profile page

  @Smoke
  Scenario: User test profile with empty company
    Given user update new logo
    When user clicks mis a jours link
    And user enters description
    And user leaves the country field blank
    And user enters siret
    And user enters adress
    And user enters phone number
    Then the bouton enregistrer les changements is desabled

  @Smoke
  Scenario: User test profile with empty siret
    Given user update new logo
    When user clicks mis a jours link
    And user enters description
    And user enters company
    And user leaves the siret field blank
    And user enters adress
    And user enters phone number
    Then the bouton enregistrer les changements is desabled

  @Smoke
  Scenario: User test profile with empty phone number
    Given user update new logo
    When user clicks mis a jours link
    And user enters description
    And user enters company
    And user enters siret
    And user enters adress
    And user leaves the phone number field blank
    Then the bouton enregistrer les changements is desabled

  @Smoke
  Scenario: User test profile with invalid siret
    Given user update new logo
    When user clicks mis a jours link
    And user enters description
    And user enters company
    And user enters invailed siret
    And user enters adress
    And user enters phone number
    And user clicks enregistrer les changements
    Then verify that a erreur message is displayed Le champ SIRET doit contenir uniquement 14 chiffres ! and clicks ok boutton

  @Smoke
  Scenario: User test profile with invalid phone number
    Given user update new logo
    When user clicks mis a jours link
    And user enters description
    And user enters company
    And user enters siret
    And user enters adress
    And user enters invailed phone number
    And user clicks enregistrer les changements
    Then verify that a erreur message is displayed Le champ MOBILE doit contenir uniquement 10 chiffres ! and clicks ok boutton
