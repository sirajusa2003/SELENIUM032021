

Feature: Facebook signup Validation

In order to verify Facebook signup
as a new user
I need to visit Facebook Homepage and click on create new account
then type first name, last name, email or phone number, password
then I have to select my DOB and gender, and finally click on the signup button
@FBSignUp
Scenario Outline: validate facebook signup
Given user visit facebook
And click on create a new account
When user will type the "<firstname>" and "<lastname>"
And type "<email>" first
And confirm "<email>" and "<password>"
And user should select dob
And select gender
Then user click on the signup button
And user should be able to create a new account

Examples: 
|   firstname    |  lastname|                email                      |    password    |  
| Mohammed |    Islam     | sirajusa2003@yahoo.com | P@ssw0rd33      |