package com.example.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kongyunhui on 2017/8/28.
 */
@RestController
@RequestMapping("/")
public class SimpleController {
    @RequestMapping("")
    public String index(){
        return "index5";
    }
}
