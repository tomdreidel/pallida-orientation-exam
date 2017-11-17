package com.greenfox.tomdreidel.exam.repository;

import com.greenfox.tomdreidel.exam.model.LicencePlates;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PlateRepository extends CrudRepository<LicencePlates, String> {

  @Query(value = "SELECT * FROM licence_plates WHERE plate LIKE CONCAT('%',?1,'%')", nativeQuery = true)
  Iterable<LicencePlates> searchByString(String string);

  @Query(value = "SELECT * FROM licence_plates WHERE plate LIKE CONCAT(?1,'%')", nativeQuery = true)
  Iterable<LicencePlates> searchByStart(String string);

  @Query(value = "SELECT * FROM licence_plates WHERE car_brand = ?1", nativeQuery = true)
  Iterable<LicencePlates> searchByBrand(String brand);
}
