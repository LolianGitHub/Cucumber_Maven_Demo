Feature: Write Shopping Review

  Background: 
    Given I've a valid set of data and access

  @ShoppingWriteReview
  Scenario: Shopping Write Review Process
    When Home page Display
    Then Go to Our Stories Page
    Then Click Case Studies
    Then Go to Contact Us Page
    Then Enter Valid Data
      | Name           | aditya        |
      | Email          | Email         |
      | Business Name  | Business Name |
      | Business Phone |     088888888 |
      | Message        | Message       |
    Then Click Send
    And Close
