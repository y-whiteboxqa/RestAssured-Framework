package com.restAssured.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import com.restAssured.base.TestBase;
import com.restAssured.config.PayLoad;
import com.restAssured.config.Resources;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PutAPITest extends TestBase {

    Logger log = Logger.getLogger(PutAPITest.class);

    @Test
    public void putRequest() {

        log.info("******* Starting putRequest test case *******");

        RestAssured.baseURI = prop.getProperty("BaseURL");
        Response response = given().contentType("application/json").body(PayLoad.putPayload()).when()
                .put(Resources.putRequest()).then().statusCode(200).assertThat().body("job", equalTo("zion resident"))
                .extract().response();
        log.info(response.getStatusLine());

        log.info("******* Ending putRequest test case *******");

    }
}
