Feature: test post calls

  Background: 
    Given url 'https://reqres.in/api/users'
    * def data = read('request')
  Scenario: testing the fature files
    And request { "name": "Peddaboina","job": "karate"}
    When method Post
    Then status 201
    And print response
    And match response.name == "Peddaboina"
    And match response.job == "karate"
    And match response.id == "#string"
    And match response == { "name": "Peddaboina","job": "karate","id": "#string","createdAt": "#ignore"}
    
    Scenario: post data in read files
    And request data
    When method Post
    Then status 201
    And print response
