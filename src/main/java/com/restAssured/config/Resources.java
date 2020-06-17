package com.restAssured.config;

public class Resources {

    public static String getRequest() {

        String resource = "/api/users?page=2";
        return resource;
    }

    public static String postRequest() {

        String resource = "/api/users";
        return resource;
    }

    public static String putRequest() {

        String resource = "/api/users/2";
        return resource;
    }

    public static String deleteRequest() {

        String resource = "/api/users/2";
        return resource;
    }
}
