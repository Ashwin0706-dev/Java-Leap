package com.example.boot1;

import org.springframework.web.bind.annotation.*;

@RestController
public class Add {

    @GetMapping("/display/{string}")
    public String display(@PathVariable String string) {
        return string + " hello";
    }
}