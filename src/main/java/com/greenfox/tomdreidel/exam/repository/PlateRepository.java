package com.greenfox.tomdreidel.exam.repository;

import com.greenfox.tomdreidel.exam.model.LicencePlates;
import org.springframework.data.repository.CrudRepository;

public interface PlateRepository extends CrudRepository<LicencePlates, String> {

}
