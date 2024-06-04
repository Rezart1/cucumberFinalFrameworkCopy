Feature: Use actions to interact with context menu

  # Scenario Outline, DataTable

  # Scenario Outline runs same set of steps with different data
  # Each set of data will be treated as a separate user that has a bit different intention
  # And the scenario is strictly executed from the beginning
  # You can think of multiple users with different data test cases

  # DataTables are used when we want to imitate one user interaction
  # There will not be multiple executions with different data
  # It will execute only once and the DataTable will be fully used in that execution
  # Consequently, it replicates one user

  @context
  Scenario Outline: Context click show alert with a message
    Given user navigates to jquery application
    When user right clicks on the right click me button
    And selects "<Option>" option from the context menu
    Then user can see an alert with content as "<Text>"
    And can accept the alert
    Examples:
      | Option | Text   |
      | Edit   | edit   |
      | Cut    | cut    |
      | Copy   | copy   |
      | Paste  | paste  |
      | Delete | delete |
      | Quit   | quit   |