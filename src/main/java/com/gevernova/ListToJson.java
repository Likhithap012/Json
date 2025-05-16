package com.gevernova;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;


public class ListToJson {
    public static void main(String[] args) {
        try {
            // Create a list of Car objects
            List<Cars> cars = new ArrayList<>();
            cars.add(new Cars("Toyota", "Camry", 2020));
            cars.add(new Cars("Honda", "Civic", 2019));
            cars.add(new Cars("Ford", "Mustang", 2021));

            // Create ObjectMapper instance
            ObjectMapper mapper = new ObjectMapper();

            // Convert list to JSON string (JSON array)
            String jsonArray = mapper.writeValueAsString(cars);

            // Print JSON array
            System.out.println(jsonArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
