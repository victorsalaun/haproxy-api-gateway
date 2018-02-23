package com.example.app1;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App1Controller {

    private final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "/app1/sayHello")
    public String sayHello() {
        LOGGER.info("Hello App 1");
        return "Hello App 1";
    }

}
