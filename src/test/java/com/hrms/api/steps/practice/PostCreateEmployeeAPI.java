package com.hrms.api.steps.practice;

import com.hrms.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.*;


public class PostCreateEmployeeAPI {

private static RequestSpecification request;
private Response response;
String baseURL="http://3.237.189.167/syntaxapi/api";
String createEmployeeResource="/createEmployee.php";


    @Given("user calls createEmployee API request")
    public void user_calls_createEmployee_API_request() {
        request= given().header("Content-Type", "application/json").header("Authorization", APIAuthenticationSteps.Token);

        request.body(CommonMethods.readJson("C:\\Users\\rucha\\eclipse-workspace\\CucumberFrameWorkBatch8\\src\\test\\resources\\jsonFiles\\createEmployee.json"));
    }

    @When("user retrieves response")
    public void user_retrieves_response() {
      response= request.post(baseURL+createEmployeeResource);

    }
    @Then("status code is {int}")
    public void status_code_is(Integer int1) {
        response.then().assertThat().statusCode(int1);

    }
    @Then("user validates employee is created")
    public void user_validates_employee_is_created() {
        // Write code here that turns the phrase above into concrete actions

    }

}
