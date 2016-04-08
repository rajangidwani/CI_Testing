package com.sample.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rgidwani on 08-04-2016.
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }
}
