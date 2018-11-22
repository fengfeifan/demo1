package com.yingda.demo1;

import io.micrometer.shaded.org.pcollections.HashPMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);

        new HashMap<String,String>();
    }
}
