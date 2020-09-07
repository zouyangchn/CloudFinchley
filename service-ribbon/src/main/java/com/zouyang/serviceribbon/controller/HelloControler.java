package com.zouyang.serviceribbon.controller;

import com.zouyang.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EX_100380990
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloServiceImpl;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloServiceImpl.hiService( name );
    }
}
