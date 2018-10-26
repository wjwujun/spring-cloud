package cn.itcast.springcloudwebribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String message){
        return restTemplate.getForObject("http://spring-cloud-service/hi?message="+message,String.class);
    }

    public String hiError(String message){
        return String.format("hi your message is :%s , but request bad!",message);

    }
}
