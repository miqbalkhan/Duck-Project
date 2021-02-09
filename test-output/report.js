$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Google for ducks.feature");
formatter.feature({
  "line": 2,
  "name": "Verify Google serch component",
  "description": "",
  "id": "verify-google-serch-component",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smookTest"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Successfully serch for duck in google",
  "description": "",
  "id": "verify-google-serch-component;successfully-serch-for-duck-in-google",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user go to the google home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user verify the title of the page as \"Google\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user type \"ducks\" in the serch box",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user verify that ducks were properly searched for",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user close the browser.",
  "keyword": "And "
});
formatter.match({
  "location": "duckStepdefination.user_go_to_the_google_home_page()"
});
formatter.result({
  "duration": 7184346700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Google",
      "offset": 38
    }
  ],
  "location": "duckStepdefination.user_verify_the_title_of_the_page_as(String)"
});
formatter.result({
  "duration": 32719200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ducks",
      "offset": 11
    }
  ],
  "location": "duckStepdefination.user_type_in_the_serch_box(String)"
});
formatter.result({
  "duration": 2671750300,
  "status": "passed"
});
formatter.match({
  "location": "duckStepdefination.user_verify_that_ducks_were_properly_searched_for()"
});
formatter.result({
  "duration": 46600900,
  "status": "passed"
});
formatter.match({
  "location": "duckStepdefination.user_close_the_browser()"
});
formatter.result({
  "duration": 1468960300,
  "status": "passed"
});
});