package mypackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class Application {

    @RequestMapping("/message")
    public String home() {
        return "Hello World! This is sample web app with Spring Boot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}