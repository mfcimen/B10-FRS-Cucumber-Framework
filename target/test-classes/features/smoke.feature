#@BRIT-4002 @wip @regression @smoke
Feature: BriteErpDemo Purchases functionalities smoke tests

	#Check for the system to be up and running.
	#
	#Purchases and related functionalities are up and running.

  Background: Go to login page
    Given the user opens a browser
    When the user goes to http://52.39.162.23/
    Then the title should be Odoo


  Scenario: Test WebApplication is up and running
    Then the page should contain <links> to databases
      | BriteErp     |
      | BriteErpDemo |
      | Test         |

  @links
  Scenario Outline: Login
    Given the user clicks on BriteErpDemo
    When the user enters valid "<email>" and "<password>"
    And the user clicks Log in button
    Then the url is correct
    And the title contains "#Inbox - Odoo"

    Examples:
      | email                  | password |
      | in_pos_user2@info.com    | KjKtfgrs38 |
      | in_pos_manager2@info.com | KjKtfgrs31 |
		     
		