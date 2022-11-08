$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature%20Files/Login.feature");
formatter.feature({
  "name": "To check Login function in Facebook",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "To open Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_open_Chrome_Browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To pass valid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "To pass valid username and valid password",
  "rows": [
    {
      "cells": [
        "user-1",
        "java"
      ]
    },
    {
      "cells": [
        "user-2",
        "selenium"
      ]
    },
    {
      "cells": [
        "pass-1",
        "111"
      ]
    },
    {
      "cells": [
        "pass-2",
        "222"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.toPassValidUsernameAndValidPassword(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To close window",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.toCloseWindow()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "To open Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_open_Chrome_Browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To pass invalid username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "To pass invalid username and password",
  "rows": [
    {
      "cells": [
        "user",
        "pass"
      ]
    },
    {
      "cells": [
        "java",
        "111"
      ]
    },
    {
      "cells": [
        "selenium",
        "222"
      ]
    },
    {
      "cells": [
        "python",
        "333"
      ]
    },
    {
      "cells": [
        "devops",
        "444"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.toPassInvalidUsernameAndPassword(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To close window",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.toCloseWindow()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});