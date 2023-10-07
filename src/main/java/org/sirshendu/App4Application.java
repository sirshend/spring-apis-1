package org.sirshendu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@EnableAutoConfiguration(exclude = DataSourceInitializationConfiguration.class)
public class App4Application  {

    public static void main(String[] args) {
        SpringApplication.run(App4Application.class, args);
    }

}