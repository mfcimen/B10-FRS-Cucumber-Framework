@smoke
Feature: Smoke Tests

  Scenario: Verify that 'Inventory' tab is visible
    Given manager is on the landing page
    When manager clicks on BriteErpDemo button
    When the manager enters valid email address
    And the manager enters valid password
    And the manager clicks Log in button
    Then the manager should see Inventory tab on the navigation bar

  @wip
  Scenario: Verify that sections under Inventory page is visible
    Given manager is on the landing page
    When manager clicks on BriteErpDemo button
    When the manager enters valid email address
    When the manager enters valid password
    And the manager clicks Log in button
    And the manager clicks Inventory tab on the navigation tab
    Then the manager should see following sections on the left navigation bar:
      | Dashboard     |
      | Operations    |
      | Master Data   |
      | Reporting     |
      | Configuration |