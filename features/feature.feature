Feature: itera login page
Scenario: Log-in with valid username and password 
	Given Open the browser
	When Enter the URL 
	And Enter registered username and password
	And Click on login button
	Then User must successfully login to the web page
	
	
	
	
	#Scenario Outline: Verify Leave approval
	#Given I Login to OrangeHRM
	#When I Click on Leave button
	#And I enter fields employee name as "<empl>" and sub unit as "<subunit>"
	#And I click on search button
	#And I click on checkbox at row "1" in Leave Table
	#And I click "Approve"  button
	#Then I should see success message "Successfully Updated"
	#Examples:
	#|empl|subunit|	
    #|Charlie Carter|Development|
    #|Charlie Carter|Development|
    #|Charlie Carter|Development|
	
	
	#Scenario : Verify Leave approval
	#Given I Login to OrangeHRM
	#When I Click on Leave button
	#And I enter fields <>
	#And I click on search button
	
	
	Scenario: verify Leave type
	Given I Login to OrangeHRM
	When I Click on Leave button
	And I enter fields <from date> and <to date> 
	|from date |to date|show with status|leave type|record found|
	|2021-2-23|2021-4-26|taken|can vacation|
	And I Click on search button
	



