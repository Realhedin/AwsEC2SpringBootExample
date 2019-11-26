package com.example.simpleec2foraws;

import org.springframework.web.bind.annotation.*;

@RestController
public class DummyRestController {

    @GetMapping
    @RequestMapping("/health")
    public String healthCheck() {
        return "OK";
    }


    @RequestMapping("/dummy")
    @GetMapping
    public String dummyString() {
        return "dummy string";
    }


    @RequestMapping("/dummyPost")
    @PostMapping
    public String dummyStringPost(@RequestBody String name) {
        return "string is " + name;
    }
}
