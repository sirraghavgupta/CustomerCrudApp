package com.raghav.beans;

public class Customer {

    private Integer id;
    private String name;
    private Integer age;
    private String country;
    private String address;
    private String gender;
    private String areasOfInterest;

    public Customer() {
    }

    public Customer(String name, Integer age, String country, String address, String gender, String areasOfInterest) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.address = address;
        this.gender = gender;
        this.areasOfInterest = areasOfInterest;
    }

    public Customer(Integer id, String name, Integer age, String country, String address, String gender, String areasOfInterest) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
        this.address = address;
        this.gender = gender;
        this.areasOfInterest = areasOfInterest;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAreasOfInterest() {
        return areasOfInterest;
    }

    public void setAreasOfInterest(String areasOfInterest) {
        this.areasOfInterest = areasOfInterest;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", areasOfInterest='" + areasOfInterest + '\'' +
                '}';
    }
}
