package cn.itcast.springcloudwebfeign.service;


import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystrix implements FeignService {

    @Override
    public String sayhi(String message) {
        return String.format("hi your message is :%s , but request bad!",message);
    }
}
