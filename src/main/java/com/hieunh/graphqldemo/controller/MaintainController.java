package com.hieunh.graphqldemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class MaintainController {
    @GetMapping("/ping")
    public String getPing() {
        return "Ping success...";
    }
}
