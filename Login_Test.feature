#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Action

Scenario: Login Done with Click
	Given User is on Login Page
	When User finds the Submit Button
	And User enters UserName and Password
	And User clicks the Submit Button
	Then Message displayed Login Done with Click
Scenario: Login Done with Submit
	When User finds the Submit Button
	And User enters UserName and Password
	And User Submits Login
	Then Message displayed Login Done with Submit


	