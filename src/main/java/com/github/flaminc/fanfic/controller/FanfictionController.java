package com.github.flaminc.fanfic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FanfictionController {
    @RequestMapping("/story")
    public String store() {
        return "test";
    }
}
