package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class kk {
    public static void main(String[] args) {
        System.out.println("12312312312321312321");
    }
    @RequestMapping("/hello")
    public void hello(){
        System.out.println("ashjkashdkj");
    }
}
