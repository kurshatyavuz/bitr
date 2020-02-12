$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\login\\Login.feature");
formatter.feature({
  "name": "As user I want to login under different roles",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as a hr",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hr"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as a \"hr\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that \"Activity Stream\" page name is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_verifies_that_page_name_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify warning message for invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@negative"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in with \"wrong\" username and \"wrong\" password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_with_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that \"Incorrect login or password\" warning message is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_verifies_that_warning_message_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});