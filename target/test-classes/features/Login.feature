  @login @wip
  Feature: Login

    Scenario: Positive login test - Manager
      Given manager is on the landing page
      When manager clicks on BriteErpDemo button
      Then the title should be Login | Website localhost
      And the database should be "BriteErpDemo"
      When the manager enters valid email address
      And the manager enters valid password
      And the manager clicks Log in button
      Then the title should be Odoo


