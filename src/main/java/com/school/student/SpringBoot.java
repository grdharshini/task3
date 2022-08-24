package com.school.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBoot {
    @GetMapping("/Hello")
    public String Hello(){
        return "Spring boot is very easy";
    }
}
