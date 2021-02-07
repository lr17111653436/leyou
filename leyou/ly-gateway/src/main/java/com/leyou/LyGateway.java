package com.leyou;

//import com.leyou.gateway.config.FilterProperties;
//import com.leyou.gateway.config.JwtProperties;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.SpringCloudApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringCloudApplication
@EnableZuulProxy     //EnableZuulProxy过滤器功能更全
//@EnableConfigurationProperties({JwtProperties.class, FilterProperties.class})
//@EnableEurekaClient
public class LyGateway {
    public static void main(String[] args) {
        SpringApplication.run(LyGateway.class, args);
    }
}