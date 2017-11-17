package com.greenfox.tomdreidel.exam.service;

import com.greenfox.tomdreidel.exam.model.LicencePlates;
import com.greenfox.tomdreidel.exam.repository.PlateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicencePlateService {

  @Autowired
  PlateRepository plateRepository;

  public Iterable<LicencePlates> getPlates() {
    return plateRepository.findAll();
  }

  public Iterable<LicencePlates> searchBy(String string, int police, int diplomat) {
    if (police == 1) {
      return plateRepository.searchByStart("RB");
    } else if (diplomat == 1) {
      return plateRepository.searchByStart("DT");
    } else {
      return plateRepository.searchByString(string);
    }
  }

  public Iterable<LicencePlates> searchByBrand(String brand) {
    return plateRepository.searchByBrand(brand);
  }
}
