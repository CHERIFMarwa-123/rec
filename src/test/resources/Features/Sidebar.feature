Feature: Feature to test sidebar functionality


  @Smoke
  Scenario: Verify the sidebar is displayed or no
    Given check that the sidebar is displayed by default
    And Hide the sidebar and verify that it is hidden
    Then Show the sidebar and check that it is visible
  @Smoke
  Scenario: Verify the title is displayed
    Given verify that the word Tekniva is displayed
  @Smoke
  Scenario: Check the contents of items in the sidebar
    Given Check the contents of items in the sidebar
   @Smoke 
  Scenario: Check the functionality of the links 

  
  