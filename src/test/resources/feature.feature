@smoke
Feature:jfdjk
  Background:fjkdk

    Scenario Outline:kkj
      Given user set flag as"true"
      Given user creat request data "<name>", "<amount>", "<expenseDateTime>", "<expenseNameId>" for otherExpense
      And user submit Post request to api
      And user validate if statusCode is 200
      Then user validate if value of name in response is "<responseName>"
      Examples:
      |   name    |   amount    |  expenseDateTime  | expenseNameId| responseName|
      |   tatnuocdaudinh |   amount    |  expenseDateTime  | expenseNameId| responseName|
      |   hongnhanbacphan|   amount    |  expenseDateTime  | expenseNameId| responseName|
      |   name           |   amount    |  expenseDateTime  | expenseNameId| responseName|

