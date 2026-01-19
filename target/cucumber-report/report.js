$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login SauceDemo",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login valid",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user open login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.openLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login using \"standard_user\" and \"secret_sauce\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be redirected to inventory page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLogin()"
});
formatter.result({
  "status": "passed"
});
});