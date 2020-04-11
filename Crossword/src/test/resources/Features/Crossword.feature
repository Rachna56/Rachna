@Crossword
Feature: Crossword website


@TC_01_Crossword
Scenario Outline: validate Login Functionality
Given I launch the browser and enter the url
When login page is opened
Then I enter the <username> and <password>
And I click on the signin button

Examples: 
|username                   	| password      |
|rachnakumaresan56@gmail.com	| 123456        |


@TC_02_Crossword
Scenario Outline: To write a review for the book
Given I launch the login page
When I search a book
Then I click on the book
Then I enter the <review> for the book
And I click the submit button

Examples:
|review			|
|A good one	|


@TC_03_Crossword
Scenario Outline: To update a  address in the account 
Given I launch  browser login
When I click on My Account
Then I click on the address book and Add newaddress
Then I add <name>,<address>,country,State,<city>,<pincode>,<Mobilenumber>
And I click the create button

Examples:
|	name		|	address		     | city			|      pincode	|	Mobilenumber	|
|Rachna		|1/823 mogappair | Chennai  |       600037	| 9952005897 		|
              


  