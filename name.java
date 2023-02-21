package com.example.demo;
import org.springframework.web.bind.annotation.*;

@RestController
public class name {
	@GetMapping("/")  
        public String getName() {
            String studentName="IamNeo";
            return "Welcome"+ studentName +"!";
        
    
}
}