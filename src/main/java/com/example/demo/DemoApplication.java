package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

@Controller
class DemoController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

}

@RestController
@RequestMapping("/api")
class DemoRestController {

    @GetMapping("timestamp")
    public Timestamp timestamp() {
        return new Timestamp(System.currentTimeMillis());
    }


    @GetMapping("date")
    public Date getDate() {
        return new Date();
    }


}