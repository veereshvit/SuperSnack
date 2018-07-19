package com.veeresh.southstar.Controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
//@RequestMapping("/RestControllers")
public class RestController {
    @RequestMapping(value = "/health",method = RequestMethod.GET)
    public String health(){
        return "200";
    }
}
