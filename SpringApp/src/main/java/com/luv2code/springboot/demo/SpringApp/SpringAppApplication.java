package com.luv2code.springboot.demo.SpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;


public class SpringAppApplication {

    public static void main(String[] args) {


        List<String> al = Arrays.asList("A","B","C","D","E");
        al.stream().forEach(e-> System.out.println(e));

    }

}
