Feature: test Get APIS

  Background: 
    Given url 'https://reqres.in/api'

  Scenario: testing the fature files
    Given path '/users/2'
    When method GET
    Then status 200
    And print response
    And match response.data.first_name == "Janet"
    And match response ==
      """
      {"data": {
          "id": 2,
          "email": "janet.weaver@reqres.in",
          "first_name": "Janet",
          "last_name": "Weaver",
          "avatar": "https://reqres.in/img/faces/2-image.jpg"
        },
        "support": {
          "url": "https://reqres.in/#support-heading",
          "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
        }
      }
      """
    * def data = call read('post.feature')
