package com.cybertactics.yahoo.hellojavaspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello/{name}")
    @ResponseBody
    public String getEmployeesById(@PathVariable String name) {
        return "Hello " + name;
    }
}
