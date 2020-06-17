package com.restAssured.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.log4testng.Logger;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import com.restAssured.base.TestBase;
import com.restAssured.config.Resources;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAPITest extends TestBase {

    Logger log = Logger.getLogger(GetAPITest.class);

    @Test
    public void getRequest() {

        log.info("******* Starting getRequest test case *******");

        RestAssured.baseURI = prop.getProperty("BaseURL");
        Response response = given()

                .when().get(Resources.getRequest())

                .then().statusCode(200).statusLine("HTTP/1.1 200 OK").assertThat().body("page", equalTo(2)).and()
                .assertThat().contentType("application/json").extract().response();
        String responseString = response.asString();
        log.info(responseString);
        Assert.assertTrue(responseString.contains("Michael"));

        log.info("******* Ending getRequest test case *******");

    }
}
