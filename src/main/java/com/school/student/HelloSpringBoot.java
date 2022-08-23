package com.school.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {
    @GetMapping("/GoodMorning")
    public String GoodMorning(){
        return "Spring boot is very funny";
    }
}
