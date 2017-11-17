package com.greenfox.tomdreidel.exam.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LicencePlates {

  @Id
  private String plate;
  private String carBrand;
  private String carModel;
  private String color;
  private int year;

  public LicencePlates() {
  }

  public String getPlate() {
    return plate;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

  public String getCarBrand() {
    return carBrand;
  }

  public void setCarBrand(String carBrand) {
    this.carBrand = carBrand;
  }

  public String getCarModel() {
    return carModel;
  }

  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}
