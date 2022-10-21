@menu
Feature: Open lateral menu

  As a logged on user
  I want to __navigate to other App feature__
  In order to **open feature I want**

  Background:
    Given User already logged in

  @positive @menu-001
  Scenario: : Ensure that by tapping hamburger menu will display the panel
    Given Calculator page shown up
    When he tap hamburger button
    Then he should see the Android icon
    #TODO create data driven
    * he should see Calculator option
    * he should see List option
#    * following options are seen:
#    | list_options_menu |
#    | Calculator        |
#    | List              |

  Rule: User already open lateral menu
    @positive @menu-002
    Example: Ensure that by swiping left will close menu
      Given User tap hamburger button
      When he swipe screen LEFT
      Then Calculator page shown up

#    Example: Ensure that by pressing back button will close the menu
#      Given he tap hamburger button
#      When he tap android BACK button
#      Then Calculator page shown up

    @positive @menu-003
    Scenario Outline: : Ensure that every menu in panel is correctly linked to App
      Given User tap hamburger button
      When he tap on <options> options
      Then <options> page shown up

      Examples:
      | options    |
      | Calculator |
      | List       |

