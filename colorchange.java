package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class colorchange{
    @GetMapping("dis")
    public String getMyFav(){
        String yourFavColor="Green";
        return "My favorite color is "+ yourFavColor;
    }
}