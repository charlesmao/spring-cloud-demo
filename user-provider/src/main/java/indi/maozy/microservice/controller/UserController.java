package indi.maozy.microservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 * 控制器
 *
 * @author 毛中勇
 * @create 2019-05-27 14:57
 */
@RefreshScope
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Value("${cn.spring-cloud.book}")
    private String remoteInfo;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello, " + name;
    }

    @GetMapping("/remote/info")
    public String getRemoteInfo() {
        return remoteInfo;
    }

}