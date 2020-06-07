package com.luv2code.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class DriverTwo {
    public static void main(String[] args) {

        try{
            ObjectMapper mapper = new ObjectMapper();
            Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);
            for(String language: student.getLanguages()){
                System.out.println(language);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
