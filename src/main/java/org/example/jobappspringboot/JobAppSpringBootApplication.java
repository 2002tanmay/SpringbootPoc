package org.example.jobappspringboot;

import org.example.jobappspringboot.model.JobPost;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class JobAppSpringBootApplication {

    public static void main(String[] args) {
       ApplicationContext context= SpringApplication.run(JobAppSpringBootApplication.class, args);

    }

}
