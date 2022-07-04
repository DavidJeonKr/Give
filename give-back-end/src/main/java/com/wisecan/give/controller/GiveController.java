package com.wisecan.give.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/give")
public class GiveController {

    @GetMapping
    public String test() {
        String test = "test";
        return "test";
    }
}
