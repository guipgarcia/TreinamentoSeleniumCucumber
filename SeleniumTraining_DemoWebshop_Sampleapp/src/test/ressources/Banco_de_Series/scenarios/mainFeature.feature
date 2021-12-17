#language: en

  Feature: Main Flow for Banco de Series
    @ExecuteBancoTests
      Scenario: Signin on Banco de Series
        Given that I access banco de series
        When I click on criar conta button
        And fill in all required fields


    @ExecuteBancoTests
    Scenario: Choose a sitcom from more watched in the last 15 days
      Given that I access banco de series
      When I select a sitcom from more watched list
      Then The page redirects to the chosen sitcom
