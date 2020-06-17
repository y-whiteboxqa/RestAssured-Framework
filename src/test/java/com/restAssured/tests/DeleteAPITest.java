package com.restAssured.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import com.restAssured.base.TestBase;
import com.restAssured.config.Resources;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteAPITest extends TestBase {

    Logger log = Logger.getLogger(DeleteAPITest.class);
    
    @Test
    public void deleteRequest() {

        log.info("******* Starting deleteRequest test case *******");
        
        RestAssured.baseURI = prop.getProperty("BaseURL");
        Response response = given()

                .when().delete(Resources.deleteRequest())

                .then().statusCode(204).extract().response();

       log.info(response.getStatusLine());
        
        log.info("******* Ending deleteRequest test case *******");
    }
}
