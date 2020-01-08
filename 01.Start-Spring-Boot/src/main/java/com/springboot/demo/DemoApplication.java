package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zheng haijain
 * @createTime 2020-01-08 10:22
 * @description
 */
@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "hello spring boot ";
    }

    public static void main(String[] args){
        SpringApplication.run(DemoApplication.class);
    }

}
