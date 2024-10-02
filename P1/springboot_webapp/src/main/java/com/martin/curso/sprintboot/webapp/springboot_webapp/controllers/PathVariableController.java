package com.martin.curso.sprintboot.webapp.springboot_webapp.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.martin.curso.sprintboot.webapp.springboot_webapp.models.User;
import com.martin.curso.sprintboot.webapp.springboot_webapp.models.dto.ParamDto;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @GetMapping("/baz/{message}")
    public ParamDto getMethodName(@PathVariable(required = false) String message) {
        ParamDto pa= new ParamDto();
        pa.setMessage(message);
        return pa;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        
        return user;
    }
    
    
}
