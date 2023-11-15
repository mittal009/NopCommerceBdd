
Feature: Register
@register
  Scenario: As a user, i should able to register successfully
    Given I am on Nopcommerce HomePage
    When I Click On Register Button
    And I enter all required registration details
    Then I should able to register successfully

  @Comment
  Scenario: New Release Comment Should Appear In the List
    Given I am on Nopcommerce HomePage
    When I Click On Details Button
    And I Click On Comment Button
    Then My Comment Should Appear In The Comment List Below
    And Comments Should Be Verify In The List