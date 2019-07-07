Feature: User Registration

Scenario Outline: Valid Registration
		Given user opens the browser
		And User opens the application
		When Click Signin in Home Page
		And Enter emaild id as '<Email Id>' in Create Account section
		And Click CreateAccount in Create Account section
		Then Check if registration page is displayed
		When Click Mrs
		And Enter 'Customer First Name' as 'FName'
		And Enter 'Customer Last Name' as 'LName'
		And Enter 'Customer Password' as 'Test@123'
		And Enter 'Address First Name' as 'AddFName'
		And Enter 'Address Last Name' as 'AddLName'
		And Enter 'Address' as 'Address1'
		And Enter 'City' as 'Amlin'
		And Enter 'State' as 'Ohio'
		And Enter 'PostCode' as '43002'
		And Enter 'Mobile' as '9978098768'
		And Enter 'Alias' as 'test@testy.com'
    And click submit button
    Then check if My Account section is displayed
 		And Close the browser
Examples:
|Email Id|
|Testwexzc@testmail.com|
|hyujjj@out.com|

@Smoke
Scenario: Invalid registration
 		Given user opens the browser
		And User opens the application
		When Click Signin in Home Page
		And Enter emaild id as 'testijikholng@ituol.com' in Create Account section
		And Click CreateAccount in Create Account section
		Then Check if registration page is displayed
    When click submit button
    Then Check if error message section is displayed
		Then Close the browser
 