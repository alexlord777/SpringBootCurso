package com.martin.curso.sprintboot.webapp.springboot_webapp.controllers;

import java.util.ArrayList;
import java.util.List;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martin.curso.sprintboot.webapp.springboot_webapp.models.User;
import com.martin.curso.sprintboot.webapp.springboot_webapp.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UseResController {

   @GetMapping("/details2")
   public UserDto details(Model model) {

      User user= new User("albert","gert");
      // Map<String, Object> body = new HashMap<>();
      // body.put("title", "hola mundo");
      // body.put("User", user);
      UserDto userDto= new UserDto();
      userDto.setUser(user);
      userDto.setTittle("Hola mundo dto");
      return userDto;
   }

   @GetMapping("/listUsers")
   public List<User> listUsers(){
      User user1= new User("albert","gert");
      User user2= new User("albert1","arias");
      User user3= new User("albert2","rosas");

      List<User> list= new ArrayList<>();
      list.add(user1);
      list.add(user2);
      list.add(user3);
      return list;
   }
}
