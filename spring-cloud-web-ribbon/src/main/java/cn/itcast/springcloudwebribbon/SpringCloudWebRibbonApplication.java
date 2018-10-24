package cn.itcast.springcloudwebribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudWebRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudWebRibbonApplication.class, args);
    }
}
