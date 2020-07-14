package com.gan.wcarefinanceservice.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversionUtil {


    public static String objectToJsonString(Object object) {
        ObjectMapper objectMapper = new ObjectMapper();

        String jsonString = null;
        try {
            jsonString = objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return jsonString;
    }

    public static Object jsonToObject(String jsonString, Class className) {
        Object result = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            result = objectMapper.readValue(jsonString, className);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
