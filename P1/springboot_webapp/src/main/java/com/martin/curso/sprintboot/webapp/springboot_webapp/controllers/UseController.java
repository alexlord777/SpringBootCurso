package com.martin.curso.sprintboot.webapp.springboot_webapp.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.martin.curso.sprintboot.webapp.springboot_webapp.models.User;

@Controller
public class UseController {

   @GetMapping("/details")
   public String details(Model model) {
      User user = new User("pam", "ar");
      model.addAttribute("title", "hola mundo");
      model.addAttribute("user", user);
      return "details";
   }

   @GetMapping("/list")
   public String list(ModelMap model) {

      model.addAttribute("tittle", "modcut");
      return "list";
   }

   @ModelAttribute("users")
   public List<User> modelUser() {
      return Arrays.asList(new User("ped", "deuc", "sj@jsjz"),
            new User("ped", "deuc", "sj@jsjz"), new User("ped", "deuc", "sj@jsjz"),
            new User("ped", "deuc", "sj@jsjz"));
   }
}
