@list
Feature: List App

  As a curious User
  I want to __explore the options__
  In order to **see what options I have**

  Background:
    Given User already logged in
    * he already open List app

  @positive @list-001
  Scenario: Ensure that all available feature loaded up
    Given User swipe screen UP
    When he reach the last of List App options
    Then he should see options List ke-100
    When he swipe screen DOWN
    * he reach the first of List App options
    Then he should see options List ke-1
    When he swipe screen UP
    * he reach the middle of List App options
    Then he should see options List ke-50

  @positive @list-002
  Scenario: Verify List Options with long tap
    Given User should see options List ke-1
    When he long tap List Options List ke-1
    Then message List ke-1 appear

  @positive @list-003
  Scenario: Verify List Options with multiple tap
    Given User should see options List ke-9
    When he tap 5 times on List ke-9
    Then message List ke-9 appear