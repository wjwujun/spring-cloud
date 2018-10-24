package cn.itcast.springcloudservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Value("${server.port}")
    private  String  port;

    @GetMapping("hi")
    public String sayhi(String message){

        return String.format("this is your port:%s , and  your message is: %s",port,message);
    }
}
