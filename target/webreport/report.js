$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cucumber.feature");
formatter.feature({
  "name": "To test the login feature of the wepage adactin",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validate the login feature with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@validLogin"
    }
  ]
});
formatter.step({
  "name": "Open the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter the \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the click button",
  "keyword": "And "
});
formatter.step({
  "name": "User can enter into input page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "mngr341161",
        "erypUre"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate the login feature with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@validLogin"
    }
  ]
});
formatter.step({
  "name": "Open the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.open_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the \"mngr341161\" and \"erypUre\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enter_the_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the click button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enter_the_click_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can enter into input page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_can_enter_into_input_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Validate the login feature with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@InvalidLogin"
    }
  ]
});
formatter.step({
  "name": "Open the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter the \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the click button",
  "keyword": "And "
});
formatter.step({
  "name": "User can see the error page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "gnanas",
        "erypUre"
      ]
    },
    {
      "cells": [
        "mngr341161",
        "gnanas"
      ]
    },
    {
      "cells": [
        "admin",
        "admin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate the login feature with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@InvalidLogin"
    }
  ]
});
formatter.step({
  "name": "Open the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.open_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the \"gnanas\" and \"erypUre\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enter_the_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the click button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enter_the_click_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can see the error page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_can_see_the_error_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validate the login feature with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@InvalidLogin"
    }
  ]
});
formatter.step({
  "name": "Open the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.open_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the \"mngr341161\" and \"gnanas\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enter_the_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the click button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enter_the_click_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can see the error page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_can_see_the_error_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validate the login feature with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@InvalidLogin"
    }
  ]
});
formatter.step({
  "name": "Open the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.open_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the \"admin\" and \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enter_the_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the click button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enter_the_click_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can see the error page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_can_see_the_error_page()"
});
formatter.result({
  "status": "skipped"
});
});