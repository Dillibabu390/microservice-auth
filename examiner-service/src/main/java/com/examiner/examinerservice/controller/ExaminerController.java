package com.examiner.examinerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/baunit")
public class ExaminerController {



    @GetMapping("/hello")
    public String getValue(){
        return "hello it works";
    }

}
