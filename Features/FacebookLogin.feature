Feature: Facebook Login Validation
 
 In order to verify Facebook
 as a registered user 
 I need to visit Facebook Landing page and type username and password then click on the login button

 Scenario Outline: validate facebook login with valid data
 Given user should visit facebook landing page
 When user type the "<username>"
 And user should type the  "<password>"
 And user should click login button
 Then user should be able to login
 Examples: 
 | username | password |
 | sirajusa2003@yahoo.com | P@ssw0rd33 |