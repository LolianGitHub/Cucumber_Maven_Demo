$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/feature/demo.feature");
formatter.feature({
  "line": 1,
  "name": "Write Shopping Review",
  "description": "",
  "id": "write-shopping-review",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6511729813,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I\u0027ve a valid set of data and access",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionDemo.ValidUserCheck()"
});
formatter.result({
  "duration": 732985420,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Shopping Write Review Process",
  "description": "",
  "id": "write-shopping-review;shopping-write-review-process",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@ShoppingWriteReview"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Home page Display",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Go to Our Stories Page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click Case Studies",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Go to Contact Us Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Enter Valid Data",
  "rows": [
    {
      "cells": [
        "Name",
        "aditya"
      ],
      "line": 13
    },
    {
      "cells": [
        "Email",
        "Email"
      ],
      "line": 14
    },
    {
      "cells": [
        "Business Name",
        "Business Name"
      ],
      "line": 15
    },
    {
      "cells": [
        "Business Phone",
        "088888888"
      ],
      "line": 16
    },
    {
      "cells": [
        "Message",
        "Message"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Click Send",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Close",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionDemo.registrationDisplay()"
});
formatter.result({
  "duration": 10304954102,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionDemo.EnterShoppingPage()"
});
formatter.result({
  "duration": 4062713532,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionDemo.SelectBrandsCategory()"
});
formatter.result({
  "duration": 728474860,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionDemo.SelectActeonCategory()"
});
formatter.result({
  "duration": 2949205096,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionDemo.enterValidData(DataTable)"
});
formatter.result({
  "duration": 2035843127,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionDemo.click_Submit()"
});
formatter.result({
  "duration": 1702113271,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionDemo.close()"
});
formatter.result({
  "duration": 150288,
  "status": "passed"
});
formatter.write("Finishied scenario");
formatter.after({
  "duration": 1414836513,
  "status": "passed"
});
});