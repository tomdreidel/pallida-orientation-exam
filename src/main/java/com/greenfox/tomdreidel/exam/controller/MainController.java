package com.greenfox.tomdreidel.exam.controller;

import com.greenfox.tomdreidel.exam.service.LicensePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @Autowired
  LicensePlateService licensePlateService;

  @RequestMapping({"", "/"})
  public String index(Model model) {
    model.addAttribute("resultSet", licensePlateService.getPlates());
    return "index";
  }

}
