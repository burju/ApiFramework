package com.hrms.api.steps.practice;

import com.hrms.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*; //manually import that

public class APIAuthenticationSteps {

    private Response response;
    public  static String Token;
    private static RequestSpecification request;
    String generateTokenURI= "http://3.237.189.167/syntaxapi/api/generateToken.php";


    @Test
    @Given("user generates token")
    public void user_generates_token() {
        request= given().header("Content-Type", "application/json");
       // System.out.println(request.log().all());

        //now writing my when part:
        response= request.body(CommonMethods.readJson("C:\\Users\\rucha\\eclipse-workspace\\CucumberFrameWorkBatch8\\src\\test\\resources\\jsonFiles\\generateToken.json"))
        .post(generateTokenURI);
       response.prettyPrint();

       //from the response let's get only Token value.
        Token= response.jsonPath().getString("token");
        System.out.println(Token);
    }

}
