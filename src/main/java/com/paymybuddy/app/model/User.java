package com.paymybuddy.app.model;

import java.time.LocalDate;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "first_name")
  @NotNull
  private String firstName;

  @Column(name = "last_name")
  @NotNull
  private String lastName;

  @Column(name = "email")
  @NotNull
  private String email;

  @Column(name = "password")
  @NotNull
  private String password;

  @Column(name = "address")
  @NotNull
  private String address;

  @Column(name = "city")
  @NotNull
  private String city;

  @Column(name = "zip")
  @NotNull
  private String zip;

  @Column(name = "phone")
  @NotNull
  private String phone;

  @Column(name = "birthdate")
  @NotNull
  private LocalDate birthDate;

  @Column(name = "treasury")
  @NotNull
  private Double treasury;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public Double getTreasury() {
    return treasury;
  }

  public void setTreasury(Double treasury) {
    this.treasury = treasury;
  }

  @Override
  public String toString() {
    return "User{" +
            "id='" + id + '\'' +
            ",firstName='" + firstName + '\'' +
            ", email='" + email + '\'' +
            ", password='" + password + '\'' +
            ", lastName='" + lastName + '\'' +
            ", address='" + address + '\'' +
            ", city='" + city + '\'' +
            ", zip='" + zip + '\'' +
            ", phone='" + phone + '\'' +
            ", birthDate=" + birthDate +
            ", treasury=" + treasury +
            '}';
  }
}
