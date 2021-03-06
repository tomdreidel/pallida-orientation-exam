package com.greenfox.tomdreidel.exam.service;

import com.greenfox.tomdreidel.exam.model.ApiResponse;
import com.greenfox.tomdreidel.exam.model.LicencePlates;
import com.greenfox.tomdreidel.exam.repository.PlateRepository;
import java.util.regex.Pattern;
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
    }

    else if (diplomat == 1) {
      return plateRepository.searchByStart("DT");
    }

    else {
        return plateRepository.searchByString(string);
    }
  }

  public Iterable<LicencePlates> searchByBrand(String brand) {
    return plateRepository.searchByBrand(brand);
  }

  public ApiResponse apiRequestByBrand(String brand) {
    ApiResponse result = new ApiResponse();
    result.setResult("ok");
    result.setData(plateRepository.searchByBrand(brand));
    return result;

  }

  public boolean validateInput(String input) {
    Pattern pattern = Pattern.compile("^[A-Za-z0-9/s*]++$");
    if (input.length() > 7 || !pattern.matcher(input).matches()) {
      return false;
    }
    return true;
  }
}

