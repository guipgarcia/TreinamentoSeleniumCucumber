#language: en

  Feature: Login on Demo Webshop Application
    @ExecuteTest
    Scenario Outline: login on application using default credentials
      Given that I access demo webshop application
      When I click on login button
      And input my "<username>" and "<password>"
      Then I can see the post login screen

      Examples:
      |   username    |password|
      |gt12@email.com |teste123|