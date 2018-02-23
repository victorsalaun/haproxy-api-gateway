package com.example.app2;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2Controller {

    private final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "/app2/sayHello")
    public String sayHello() {
        LOGGER.info("Hello App 2");
        return "Hello App 2";
    }

}
