package com.martin.curso.sprintboot.webapp.springboot_webapp.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.martin.curso.sprintboot.webapp.springboot_webapp.models.dto.ParamDto;


import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/params")
public class RequestParamsContrller {
    
    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false) String message)
    {
       ParamDto param=new ParamDto();
       param.setMessage(message);

       return param;
    }

    @GetMapping("/bar")
    public ParamDto getMethodName(@RequestParam(required = false) String text,@RequestParam(required = false) Integer code){
        ParamDto params= new ParamDto();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }
    

    @GetMapping("request")
    public ParamDto getMethodName(HttpServletRequest req) {
        ParamDto param= new ParamDto();
        param.setMessage(req.getParameter("text"));
        param.setCode(Integer.parseInt(req.getParameter("code")));
        return param;
    }
    
}
