package com.rahul.accounts.controller;

import com.rahul.accounts.dto.CustomerDto;
import com.rahul.accounts.dto.ResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path="/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountController {

    @GetMapping("sayHello")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/create")
    public ResponseEntity<ResponseDto> createAccount() {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto("OK", "Created"));
    }
}
