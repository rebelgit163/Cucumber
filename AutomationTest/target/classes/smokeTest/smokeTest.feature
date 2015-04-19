Feature: "Automating ASOS website"
  As a ASOS QA 
  I want to automate smoke scenarios
  so that I can verify the stability of the site

Scenario: Smoke test for Women's section
Given I am on ASOS home page "http://www.asos.com/"
When WOMEN section is displayed
And I click on Women tab
Then URL should be this "http://www.asos.com/women/?via=top"
