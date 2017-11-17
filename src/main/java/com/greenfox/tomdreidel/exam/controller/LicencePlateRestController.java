package com.greenfox.tomdreidel.exam.controller;

import com.greenfox.tomdreidel.exam.model.ApiResponse;
import com.greenfox.tomdreidel.exam.service.LicencePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LicencePlateRestController {

  @Autowired
  LicencePlateService licencePlateService;


  @RequestMapping("/api/search/{brand}")
  public ApiResponse searchApi(@PathVariable("brand") String brand) {
    return licencePlateService.apiRequestByBrand(brand);
  }
}
