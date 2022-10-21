@login
Feature: User login

  As a registered user
  I want to _login to the app_
  In order to **use the Calculator**

  @negative @login-001
  Scenario Outline: Verify login with invalid credential

  Unfortunately, User forget his username and password and tried to logged in several times

    Given that User is already on Simple App Login Page
    When he login with username <username> and password <password>
    Then he is restricted to login
    But message <message> appear
    Examples:
      | username       | password       | message                        |
      | wrong_username | wrong_password | Login failed                   |
      | admin          |                | Password must be >4 characters |
      | admin          | adm            | Password must be >4 characters |
      |                |                | Password must be >4 characters |

  @positive @login-002
  Scenario: Verify login with valid credential

  Finally, User remember his credentials and try to login

    Given that User is already on Simple App Login Page
    When he login as admin
    Then he should logged in
    * Calculator page shown up
    * message Welcome ! Admin appear

  @negative @login-003
  Scenario: Check if the credentials validation system is case sensitive
    Given that User is already on Simple App Login Page
    When he login with username ADMIN and password ADMIN
    Then he is restricted to login
    But message Login Failed appear