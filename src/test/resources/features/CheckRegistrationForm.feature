Feature: Verify Form Registration Functionality

  @RegisterForm
  Scenario: Verify Form Registration Functionality
    Given that the Demo QA application is initiated
    When the form is completed and submitted
    Then verify that a successful submission message is displayed
