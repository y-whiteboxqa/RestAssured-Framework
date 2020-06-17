package com.restAssured.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import com.restAssured.base.TestBase;
import com.restAssured.config.PayLoad;
import com.restAssured.config.Resources;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostAPITest extends TestBase {

    Logger log = Logger.getLogger(PostAPITest.class);
    
    @Test
    public void postRequest() {

        log.info("******* Starting postRequest test case *******");
        
        RestAssured.baseURI = prop.getProperty("BaseURL");
        Response response = given().contentType("application/json").body(PayLoad.postPayload()).when()
                .post(Resources.postRequest()).then().statusCode(201).assertThat().body("name", equalTo("morpheus"))
                .and().assertThat().header("Content-Length", equalTo("84"))
                .extract().response();

        // when you extract response you will get raw data
        // first convert that response to string variable

        String responseString = response.asString();
       log.info(responseString);

        // now convert string into json format
        // in real time you need to extract data from response and pass it to the
        // further requests

        JsonPath js = new JsonPath(responseString);
        String name = js.get("name");
        log.info(name);
        
        log.info("******* Ending postRequest test case *******");

    }

}
