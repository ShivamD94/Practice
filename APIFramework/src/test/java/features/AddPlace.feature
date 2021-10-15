Feature: Validating Place API's

  Scenario Outline: Verify Add Place APi is working fine
    Given Add Place Payload with "<name>" "<language>" "<address>"
    When User calls "AddPlaceAPI" with "Post" http request
    Then APi call is success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    And put "<place_id>" in Map

    Examples: 
      | name   | language | address            | place_id |
      | anames | english  | kuchbhiaddressesss | place_id |

  
  Scenario Outline: : Verify Get Place APi is working fine
    Given GetPlace Payload with "<place_id>"
    When User calls "GetPlaceAPI" with "Get" http request
    Then APi call is success with status code 200

    Examples: 
      | place_id |
      | place_id |
