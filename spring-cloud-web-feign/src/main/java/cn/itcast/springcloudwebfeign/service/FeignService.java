package cn.itcast.springcloudwebfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-service")
public interface FeignService {

    @GetMapping(value = "hi")
    public String sayhi(@RequestParam(value = "message") String message);
}
