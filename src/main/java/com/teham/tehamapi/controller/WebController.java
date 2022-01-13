package com.teham.tehamapi.controller;

import com.teham.tehamapi.model.Hello;
import com.teham.tehamapi.model.Vue;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {

    
@MessageMapping("/hello")
@SendTo("/topic/hi")
public Hello greeting(Vue v) throws Exception{
       // Thread.sleep(1000);
    
    return new Hello("Hi  "+v.getV1()+"!");
        
}
   
}
