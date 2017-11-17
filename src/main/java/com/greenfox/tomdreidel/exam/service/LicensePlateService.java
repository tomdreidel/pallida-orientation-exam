package com.greenfox.tomdreidel.exam.service;

import com.greenfox.tomdreidel.exam.model.LicencePlates;
import com.greenfox.tomdreidel.exam.repository.PlateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicensePlateService {

  @Autowired
  PlateRepository plateRepository;

  public Iterable<LicencePlates> getPlates() {
    return plateRepository.findAll();
  }

}
