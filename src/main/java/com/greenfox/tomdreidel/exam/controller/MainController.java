package com.greenfox.tomdreidel.exam.controller;

import com.greenfox.tomdreidel.exam.service.LicencePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  LicencePlateService licencePlateService;

  @RequestMapping({"", "/"})
  public String index(Model model) {
    model.addAttribute("resultSet", licencePlateService.getPlates());
    return "index";
  }

  @RequestMapping("/search")
  public String search(@RequestParam(value = "q", required = false) String search, Model model) {
    model.addAttribute("resultSet", licencePlateService.searchBy(search));
    return "index";
  }

}
