package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/victor")
@Controller
public class TesteController {

    @GetMapping("/teste")
    public ResponseEntity<String> teste () {
        return ResponseEntity.status(HttpStatus.OK).body("teste");
    }
}
