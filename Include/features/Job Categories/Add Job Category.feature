
Feature: Add Job Category

  
  Scenario Outline: Successfully add new job category
    
    Given users navigate to job category page
    When users click on add job category button
    And users enter job category name <jobCategories> 
    And users click on save job category button
    Then users should be able to add new job category
    
    Examples: 
    |	jobCategories	|
		|	Admin					|
		|	IT						|
		|	Engineer			|
		
		
  Scenario Outline: Users enter existing job category
   
    Given users navigate to job category page
    When users click on add job category button
    And users enter job category name  <jobCategories> 
    And users click on save job category button
    Then job category name already exists message will appear
    
     Examples: 
     |	jobCategories	|
		 |	Admin					|
    
