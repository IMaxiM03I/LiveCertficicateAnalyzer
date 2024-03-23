package com.maxim03.services;

import org.json.JSONObject;

public class JSONHandlerService {

    public static JSONObject JSONFromString(String message) {
        return new JSONObject(message);
    }

}
