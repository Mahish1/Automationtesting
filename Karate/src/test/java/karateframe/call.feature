Feature: passing datat

  Background: 
    Given url 'https://reqres.in/api/users'
 Given def datagen = Java.type('karateframe.anthor')
  Scenario: request user data
    And def job = Mahee.relly ();
    And print job
    And def mah = Mahee.random ();
    And print mah
    And request {"name":"#(mah)","job":"#(job)"}
    When method Post
    Then status 201
