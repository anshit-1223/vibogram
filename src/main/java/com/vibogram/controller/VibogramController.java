package com.vibogram.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VibogramController {

    @GetMapping("/posts")
    public String allPosts(){
        return "All Posts Shown";
    }

    @GetMapping("/waves")
    public String allWaves(){
        return "All Waves Shown";
    }
}
