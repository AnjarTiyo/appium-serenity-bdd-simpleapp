@calculator
Feature: Calculator Apps

  As an logged in user
  I want to _use Calculator App_
  In order to **perform arithmetic operation**

  Background:
    Given User already logged in

  @positive @calc-001
  Scenario Outline: Check the operator dropdown work properly
    Given Calculator page shown up
    When User set operator to <operator>
    Then The operator is set to <operator>

    Examples:
    | operator |
    | +        |
    | -        |
    | *        |
    | /        |

  @negative @calc-002
  Scenario: Check whether Calculator is accept Scientific Number

  User is curious does it accept Scientific Number

    Given User input 1e3 to angka1 field
    * User input 1e3 to angka2 field
    * User set operator to +
    When User tap equal button
    Then User should get answer 2e3

  @positive @calc-003
  Scenario: Check whether Calculator can handle decimal

    Given User input 0.0001 to angka1 field
    * User input 0.0003 to angka2 field
    * User set operator to +
    When User tap equal button
    Then User should get answer 0.0004

  @negative @calc-004
  Scenario: Check whether Calculator can handle empty input
    Given User input  to angka1 field
    * User input  to angka2 field
    * User set operator to +
    When User tap equal button
    Then User should get answer N/A
#    considered as fail because app crash rather shown of N/A

  @positive
  Rule: Check operation using only acceptable input format

    After knowing the app limitation
    As an informed user,
    I want to _check Calculator app functionality_
    In order to *** check that the Calculator work correctly***

    @calc-005
    Scenario Outline: Check the addition of two numbers
      Given User input <number1> to angka1 field
      * User input <number2> to angka2 field
      * User set operator to +
      When User tap equal button
      Then User should get answer <answer>

      Examples:
        | number1     | number2     | answer      |
#        | 0           | 0           | 0           |
        | 32679       | 32678       | 65357       |
        | 65536       | -65537      | 1           |
        | -2147483649 | -2147483648 | -4294967296 |

    @calc-006
    Scenario Outline: Check the subtraction of two integer number
      Given User input <number1> to angka1 field
      * User input <number2> to angka2 field
      * User set operator to -
      When User tap equal button
      Then User should get answer <answer>

      Examples:
        | number1     | number2     | answer |
        | 0           | 0           | 0      |
        | 32679       | 32678       | 1      |
        | 65536       | -65537      | 131073 |
        | -2147483649 | -2147483648 | -1     |

    @calc-007
    Scenario Outline: Check the multiplication of two integer number
      Given User input <number1> to angka1 field
      * User input <number2> to angka2 field
      * User set operator to *
      When User tap equal button
      Then User should get answer <answer>

      Examples:
        | number1     | number2     | answer              |
        | 0           | 0           | 0                   |
        | 32679       | 32678       | 1067884362          |
        | 65536       | -65537      | 4294901760          |
        | -2147483649 | -2147483648 | 4611686020574870000 |

    @calc-008
    Scenario Outline: Check the division of two integer number
      Given User input <number1> to angka1 field
      * User input <number2> to angka2 field
      * User set operator to /
      When User tap equal button
      Then User should get answer <answer>

      Examples:
        | number1     | number2     | answer |
        | 32678       | 16339       | 2      |
        | 65536       | -32768      | -2     |
        | -2147483649 | -1073741825 | 2      |

  @negative @calc-009
  Scenario Outline: Check the division of any number by zero
    Given User input <number> to angka1 field
    * User input 0 to angka2 field
    * User set operator to /
    When User tap equal button
    Then User should get answer NaN

    Examples:
    | number  |
#    | 0       |
    | 32678   |
    | -32768  |

  @negative
  Rule: Check operation using input string

    After try several valid format,
    As a curious user
    I want to _ input string to the Calculator app_
    In order to **know how the app will reject my input**

    @calc-010
    Example: Check the addition of two string
      Given User input notNumber1 to angka1 field
      * User input notNumber2 to angka2 field
      * User set operator to +
      When User tap equal button
      Then User should get answer N/A

    @calc-011
    Example: Check the subtraction of two string
      Given User input notNumber1 to angka1 field
      * User input notNumber2 to angka2 field
      * User set operator to -
      When User tap equal button
      Then User should get answer N/A

    @calc-012
    Example: Check the multiplication of two string
      Given User input notNumber1 to angka1 field
      * User input notNumber2 to angka2 field
      * User set operator to *
      When User tap equal button
      Then User should get answer N/A

    @calc-013
    Example: Check the division of two string
      Given User input notNumber1 to angka1 field
      * User input notNumber2 to angka2 field
      * User set operator to /
      When User tap equal button
      Then User should get answer N/A

  @positive @calc-014
  Scenario Outline: Check the division of zero by any number
    Given User input 0 to angka1 field
    * User input <number> to angka2 field
    * User set operator to *
    When User tap equal button
    Then User should get answer 0

    Examples:
      | number  |
      | 0       |
      | 0.32678 |
      | 32678   |
      | -32768  |

  @positive @calc-015
  Scenario Outline: Check maximum input of Calculator can process
    Given User input <digit> digits of 1 to angka1 field
    * User input <digit> digits of 1 to angka2 field
    * User set operator to *
    When User tap equal button
    Then User should get <digit> of 2

    Examples:
      | digit |
      | 8     |
      | 16    |
      | 32    |
      | 64    |
      | 128   |