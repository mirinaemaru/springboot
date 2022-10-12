package net.iotinfra.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        System.out.println("test...");
        return "Greeting from Spring Boot!";
    }
}
