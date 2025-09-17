Feature: Test data genrator

  Background: 
    * def body = Java.type('karateframe.Genration');

  Scenario: Test module data
    * def name = body.maile();
    * def job = body.mahesh();
    Given url 'https://reqres.in/api/users'
    And request {"name": "#(name)","job":"#(job)"}
    When method post
    Then status 201
    And print response
    And match response.name =='#present	'
    And match response.id == '#id	'
