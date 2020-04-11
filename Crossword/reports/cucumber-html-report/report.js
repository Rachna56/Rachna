$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Crossword.feature");
formatter.feature({
  "line": 2,
  "name": "Crossword website",
  "description": "",
  "id": "crossword-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Crossword"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "validate Login Functionality",
  "description": "",
  "id": "crossword-website;validate-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@TC_01_Crossword"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter the \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on the signin button",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "crossword-website;validate-login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "crossword-website;validate-login-functionality;;1"
    },
    {
      "cells": [
        "rachnakumaresan56@gmail.com",
        "123456"
      ],
      "line": 14,
      "id": "crossword-website;validate-login-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "validate Login Functionality",
  "description": "",
  "id": "crossword-website;validate-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Crossword"
    },
    {
      "line": 5,
      "name": "@TC_01_Crossword"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter the rachnakumaresan56@gmail.com and 123456",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on the signin button",
  "keyword": "And "
});
formatter.match({
  "location": "Crossword_Login.i_launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 39544659499,
  "status": "passed"
});
formatter.match({
  "location": "Crossword_Login.login_page_is_opened()"
});
formatter.result({
  "duration": 3358226000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rachnakumaresan56@gmail.com",
      "offset": 12
    },
    {
      "val": "123456",
      "offset": 44
    }
  ],
  "location": "Crossword_Login.i_enter_the_and(String,String)"
});
formatter.result({
  "duration": 1841800500,
  "status": "passed"
});
formatter.match({
  "location": "Crossword_Login.i_click_on_the_signin_button()"
});
formatter.result({
  "duration": 3632722399,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "To write a review for the book",
  "description": "",
  "id": "crossword-website;to-write-a-review-for-the-book",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@TC_02_Crossword"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I launch the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I search a book",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I click on the book",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I enter the \u003creview\u003e for the book",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I click the submit button",
  "keyword": "And "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "crossword-website;to-write-a-review-for-the-book;",
  "rows": [
    {
      "cells": [
        "review"
      ],
      "line": 26,
      "id": "crossword-website;to-write-a-review-for-the-book;;1"
    },
    {
      "cells": [
        "A good one"
      ],
      "line": 27,
      "id": "crossword-website;to-write-a-review-for-the-book;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 27,
  "name": "To write a review for the book",
  "description": "",
  "id": "crossword-website;to-write-a-review-for-the-book;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Crossword"
    },
    {
      "line": 17,
      "name": "@TC_02_Crossword"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I launch the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I search a book",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I click on the book",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I enter the A good one for the book",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I click the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Crossword_Review.i_launch_the_login_page()"
});
formatter.result({
  "duration": 37304193400,
  "status": "passed"
});
formatter.match({
  "location": "Crossword_Review.i_search_a_book()"
});
formatter.result({
  "duration": 4661369301,
  "status": "passed"
});
formatter.match({
  "location": "Crossword_Review.i_click_on_the_book()"
});
formatter.result({
  "duration": 872533100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A good one",
      "offset": 12
    }
  ],
  "location": "Crossword_Review.i_enter_the_for_the_book(String)"
});
formatter.result({
  "duration": 13285958299,
  "status": "passed"
});
formatter.match({
  "location": "Crossword_Review.i_click_the_submit_button()"
});
formatter.result({
  "duration": 7430398901,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 31,
  "name": "To update a  address in the account",
  "description": "",
  "id": "crossword-website;to-update-a--address-in-the-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 30,
      "name": "@TC_03_Crossword"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "I launch  browser login",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "I click on My Account",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "I click on the address book and Add newaddress",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I add \u003cname\u003e,\u003caddress\u003e,country,State,\u003ccity\u003e,\u003cpincode\u003e,\u003cMobilenumber\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "I click the create button",
  "keyword": "And "
});
formatter.examples({
  "line": 38,
  "name": "",
  "description": "",
  "id": "crossword-website;to-update-a--address-in-the-account;",
  "rows": [
    {
      "cells": [
        "name",
        "address",
        "city",
        "pincode",
        "Mobilenumber"
      ],
      "line": 39,
      "id": "crossword-website;to-update-a--address-in-the-account;;1"
    },
    {
      "cells": [
        "Rachna",
        "1/823 mogappair",
        "Chennai",
        "600037",
        "9952005897"
      ],
      "line": 40,
      "id": "crossword-website;to-update-a--address-in-the-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 40,
  "name": "To update a  address in the account",
  "description": "",
  "id": "crossword-website;to-update-a--address-in-the-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Crossword"
    },
    {
      "line": 30,
      "name": "@TC_03_Crossword"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "I launch  browser login",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "I click on My Account",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "I click on the address book and Add newaddress",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I add Rachna,1/823 mogappair,country,State,Chennai,600037,9952005897",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "I click the create button",
  "keyword": "And "
});
formatter.match({
  "location": "Crossword_Myaccount.i_launch_browser_login()"
});
formatter.result({
  "duration": 45500297399,
  "status": "passed"
});
formatter.match({
  "location": "Crossword_Myaccount.i_click_on_my_account()"
});
formatter.result({
  "duration": 8852660399,
  "status": "passed"
});
formatter.match({
  "location": "Crossword_Myaccount.i_click_on_the_address_book_and_add_newaddress()"
});
formatter.result({
  "duration": 2016906599,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rachna",
      "offset": 6
    },
    {
      "val": "1/823 mogappair",
      "offset": 13
    },
    {
      "val": "Chennai",
      "offset": 43
    },
    {
      "val": "600037",
      "offset": 51
    },
    {
      "val": "9952005897",
      "offset": 58
    }
  ],
  "location": "Crossword_Myaccount.i_add_countrystate(String,String,String,String,String)"
});
formatter.result({
  "duration": 1947760101,
  "status": "passed"
});
formatter.match({
  "location": "Crossword_Myaccount.i_click_the_create_button()"
});
formatter.result({
  "duration": 2828199500,
  "status": "passed"
});
});