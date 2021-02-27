package com.hrms.api.steps.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.*;


public class SampleAPITest {

    @Test
    public void getAllJobTitles() {
        Response response =
                RestAssured
                .given().
                        contentType("application/json")
                        .header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MTM4MzQ2OTEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYxMzg3Nzg5MSwidXNlcklkIjoiMjQ3MiJ9.3otRq2fP7ppFPuP7063nPPprW_XkQAWRB-RajGrW44s")
                .when()
                        .get("http://3.237.189.167/syntaxapi/api/jobTitle.php");

        response.prettyPrint();
        int actualResponseCode = response.getStatusCode();
        System.out.println(actualResponseCode);
    }


    @Test
    public void getOneEmployee(){

        Response response= RestAssured.given().param("employee_id", "14369A").contentType("application/json").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MTM4MzQ2OTEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYxMzg3Nzg5MSwidXNlcklkIjoiMjQ3MiJ9.3otRq2fP7ppFPuP7063nPPprW_XkQAWRB-RajGrW44s")
                .when().get("http://3.237.189.167/syntaxapi/api/getOneEmployee.php");
        response.prettyPrint();
    }


//    @Test
//    public void createEmployee(){
//      Response response=
//           RestAssured.given()
//          .contentType("application/json").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MTM4MzQ2OTEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYxMzg3Nzg5MSwidXNlcklkIjoiMjQ3MiJ9.3otRq2fP7ppFPuP7063nPPprW_XkQAWRB-RajGrW44s")
//                .param( "emp_firstname", "VAli")
//                .param("emp_lastname", "Yorav")
//                .param("emp_middle_name", "")
//                .param(  "emp_gender", "F")
//                .param("emp_birthday", "1950-02-16")
//                .param("emp_status", "Employee")
//                .param("emp_job_title", "Developer")
//          .when().post("http://3.237.189.167/syntaxapi/api/createEmployee.php");
//
//      response.prettyPrint();
//      int statusCode= response.getStatusCode();
//        System.out.println(statusCode);
//        Assert.assertEquals(200, statusCode);
//    }

    @Test
    public void getAllEmployees(){
        Response response= RestAssured.given().contentType("application/json").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MTM4MzQ2OTEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYxMzg3Nzg5MSwidXNlcklkIjoiMjQ3MiJ9.3otRq2fP7ppFPuP7063nPPprW_XkQAWRB-RajGrW44s")
                .when().get("http://3.237.189.167/syntaxapi/api/getAllEmployees.php");

        response.prettyPrint();
        int statusCode= response.getStatusCode();

    }
}
