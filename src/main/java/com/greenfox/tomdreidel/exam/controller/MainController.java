package com.greenfox.tomdreidel.exam.controller;

import com.greenfox.tomdreidel.exam.service.LicencePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
  public String search(
      @RequestParam(value = "q", required = false) String search,
      @RequestParam(value = "police", required = false, defaultValue = "0") int police,
      @RequestParam(value = "diplomat", required = false, defaultValue = "0") int diplomat,
      Model model) {
    model.addAttribute("resultSet", licencePlateService.searchBy(search, police, diplomat));
    return "index";
  }

  @RequestMapping("/search/{brand}")
  public String search(@PathVariable("brand") String brand, Model model) {
    model.addAttribute("resultSet", licencePlateService.searchByBrand(brand));
    return "index";
  }

}
