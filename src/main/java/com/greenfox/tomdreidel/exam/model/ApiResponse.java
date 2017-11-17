package com.greenfox.tomdreidel.exam.model;

public class ApiResponse {
  private String result;
  private Iterable<LicencePlates> data;

  public ApiResponse() {
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public Iterable<LicencePlates> getData() {
    return data;
  }

  public void setData(Iterable<LicencePlates> data) {
    this.data = data;
  }
}
