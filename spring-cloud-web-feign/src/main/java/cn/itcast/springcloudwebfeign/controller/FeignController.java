package cn.itcast.springcloudwebfeign.controller;


import cn.itcast.springcloudwebfeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

        @Autowired
        private FeignService feignService;
        @GetMapping("hi")
        public String sayhi(String message){
            return  this.feignService.sayhi(message);
        };

}
