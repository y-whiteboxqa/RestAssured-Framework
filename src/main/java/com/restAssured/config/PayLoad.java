package com.restAssured.config;

import java.util.HashMap;

public class PayLoad {

    public static HashMap<String, String> postPayload() {

        HashMap<String, String> data = new HashMap<String, String>();
        data.put("name", "morpheus");
        data.put("job", "leader");
        return data;
    }

    public static HashMap<String, String> putPayload() {
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("name", "morpheus");
        data.put("job", "zion resident");
        return data;

    }
}
