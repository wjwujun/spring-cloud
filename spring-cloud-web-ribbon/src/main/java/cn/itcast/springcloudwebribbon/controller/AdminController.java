package cn.itcast.springcloudwebribbon.controller;

import cn.itcast.springcloudwebribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/hi")
    public String saiHi(String message){
        return  this.adminService.sayHi(message);
    }



}
