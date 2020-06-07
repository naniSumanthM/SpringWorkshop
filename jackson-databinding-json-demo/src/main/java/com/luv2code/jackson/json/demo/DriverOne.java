package com.luv2code.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class DriverOne {
    public static void main(String[] args) {

        try{
            ObjectMapper mapper = new ObjectMapper();
            Student student = mapper.readValue(new File("data/sample-lite.json"), Student.class);
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
