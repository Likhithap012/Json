package com.gevernova;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
public class MergeJson {
    public static void main(String[] args) {

        String jsonOne = "{ \"name\": \"Likhitha\", \"age\": 21 }";
        JsonObject objOne = JsonParser.parseString(jsonOne).getAsJsonObject();

        //Parse the string into a generic JSON element, then treat it as a JSON object.

        String jsonTwo = "{ \"email\": \"likhitha@example.com\", \"city\": \"Hyderabad\" }";
        JsonObject objTwo = JsonParser.parseString(jsonTwo).getAsJsonObject();

        // Merge objTwo into objOne
        for (String key : objTwo.keySet()) {
            objOne.add(key, objTwo.get(key));
        }

        // Output merged JSON
        System.out.println("Merged JSON: " + objOne.toString());
    }
}
