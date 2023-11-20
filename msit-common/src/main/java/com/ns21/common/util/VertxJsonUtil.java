package com.ns21.common.util;

import io.vertx.core.json.JsonObject;

public class VertxJsonUtil {

    public static String jsonReadValueToString(JsonObject json, String path) {
        String value = null;
        JsonObject subJson = json;

        String [] pathKey = path.split("\\.");
        Integer pathSize = pathKey.length;

        //String, Integer, Double, Float
        for (int i = 0; i < pathSize; i++) {
            if((pathSize-1) == i) {
                value = subJson.getString(pathKey[i]);
                return value;
            }
            subJson = subJson.getJsonObject(pathKey[i]);
            if(subJson == null) break;
        }

        return value;
    }

    public static Integer jsonReadValueToInteger(JsonObject json, String path) {
        Integer value = null;
        JsonObject subJson = json;

        String [] pathKey = path.split("\\.");
        Integer pathSize = pathKey.length;

        //String, Integer, Double, Float
        for (int i = 0; i < pathSize; i++) {
            if((pathSize-1) == i) {
                value = subJson.getInteger(pathKey[i]);
                return value;
            }
            subJson = subJson.getJsonObject(pathKey[i]);
            if(subJson == null) break;
        }

        return value;
    }

    public static Long jsonReadValueToLong(JsonObject json, String path) {
        Long value = null;
        JsonObject subJson = json;

        String [] pathKey = path.split("\\.");
        Integer pathSize = pathKey.length;

        //String, Integer, Double, Float
        for (int i = 0; i < pathSize; i++) {
            if((pathSize-1) == i) {
                value = subJson.getLong(pathKey[i]);
                return value;
            }
            subJson = subJson.getJsonObject(pathKey[i]);
            if(subJson == null) break;
        }

        return value;
    }

    public static Double jsonReadValueToDouble(JsonObject json, String path) {
        Double value = null;
        JsonObject subJson = json;

        String [] pathKey = path.split("\\.");
        Integer pathSize = pathKey.length;

        //String, Integer, Double, Float
        for (int i = 0; i < pathSize; i++) {
            if((pathSize-1) == i) {
                value = subJson.getDouble(pathKey[i]);
                return value;
            }
            subJson = subJson.getJsonObject(pathKey[i]);
            if(subJson == null) break;
        }

        return value;
    }

    public static Float jsonReadValueToFloat(JsonObject json, String path) {
        Float value = null;
        JsonObject subJson = json;

        String [] pathKey = path.split("\\.");
        Integer pathSize = pathKey.length;

        //String, Integer, Double, Float
        for (int i = 0; i < pathSize; i++) {
            if((pathSize-1) == i) {
                value = subJson.getFloat(pathKey[i]);
                return value;
            }
            subJson = subJson.getJsonObject(pathKey[i]);
            if(subJson == null) break;
        }

        return value;
    }

    public static Boolean jsonReadValueToBoolean(JsonObject json, String path) {
        Boolean value = null;
        JsonObject subJson = json;

        String [] pathKey = path.split("\\.");
        Integer pathSize = pathKey.length;

        //String, Integer, Double, Float
        for (int i = 0; i < pathSize; i++) {
            if((pathSize-1) == i) {
                value = subJson.getBoolean(pathKey[i]);
                return value;
            }
            subJson = subJson.getJsonObject(pathKey[i]);
            if(subJson == null) break;
        }

        return value;
    }

}
