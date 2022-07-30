package stepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import utilities.OtherExpenseRequestBuilder;

import static io.restassured.RestAssured.given;

public class MyStepdefs {
    String reqObject;
    OtherExpenseRequestBuilder reqBuilder;

    @Given("user set flag as{string}")
    public void userSetFlagAs(String arg0) {
       // if(arg0.equals("true")){
             reqBuilder=new OtherExpenseRequestBuilder();
        System.out.println("yyyyyyyyyyyyyyyyyyy");


    }

    @Given("user creat request data {string}, {string}, {string}, {string} for otherExpense")
    public void userCreatRequestDataForOtherExpense(String name, String amount, String expenseDateTime, String expenseNameId) throws JsonProcessingException {
//         reqBuilder.setName(name);
//         reqBuilder.setAmount(amount);
//         reqBuilder.setExpenseDateTime(expenseDateTime);
//         reqBuilder.setOtherExpenseNameId(expenseNameId);
//         ObjectMapper objectMapper=new ObjectMapper();
//        reqObject= objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(reqBuilder);
        System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuu");

    }









    @And("user submit Post request to api")
    public void userSubmitPostRequestToApi() {
//        String createExpense_URL="http://dev-mb.yoll.io/api/expenses/create";
//        Response resp=given()
//                .param("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1laWRlbnRpZmllciI6IjExMzcyIiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6Im1pbmhsZSIsIkFzcE5ldC5JZGVudGl0eS5TZWN1cml0eVN0YW1wIjoiZjg0NGExMzQtZjQ5YS00NzA2LTg5YmMtMWY3ZjlhZjJjZTk4IiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9yb2xlIjoiU2VsZkVtcGxveWVkIiwiaHR0cDovL3d3dy5hc3BuZXRib2lsZXJwbGF0ZS5jb20vaWRlbnRpdHkvY2xhaW1zL3RlbmFudElkIjoiMSIsInN1YiI6IjExMzcyIiwianRpIjoiZWY4YWMwODgtN2Y1NS00MDM2LWE2MDItMmZiNmEwNTBjNjVhIiwiaWF0IjoxNjUyOTEyMTcxLCJuYmYiOjE2NTI5MTIxNzEsImV4cCI6MTY4NDQ0ODE3MSwiaXNzIjoiTWVhbEIiLCJhdWQiOiJNZWFsQiJ9.q0ykPp7YVnzTPWC4x3HioomRkzEkdSkXvM49ic86mlY")
//                .body(reqObject)
//                .post(createExpense_URL);
        System.out.println("ttttttttttttttttttttttt");
    }


    @And("user validate if statusCode is {int}")
    public void userValidateIfStatusCodeIs(int arg0) {
        System.out.println("pppppppppp");
    }

    @Then("user validate if value of name in response is {string}")
    public void userValidateIfValueOfNameInResponseIs(String arg0) {
        System.out.println(" jfkjfkfdkjfkdjf");
    }


}
