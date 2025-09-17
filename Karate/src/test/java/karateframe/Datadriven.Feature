Feature: Test the data driven

  Background: 
    Given url 'https://reqres.in/api/users'

  Scenario Outline: Test APi test
    And request {"name":<name>,"job":<job>}
    When method Post
    Then status 201
    And print response

    Examples: 
      | name    |  | job        |
      | mahesh  |  | automation |
      | shiav   |  | om         |
      | sai ram |  | om         |
