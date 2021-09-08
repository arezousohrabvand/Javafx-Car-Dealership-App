package sample;

import java.awt.*;

public class Company {
    private String name,streetName,city,province,postalCode,soldNumber,price;


    public Company(String name, String streetName, String city, String province, String postalCode, String soldNumber, String price) {
        this.name = name;
        this.streetName = streetName;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.soldNumber = soldNumber;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getSoldNumber() {
        return soldNumber;
    }

    public void setSoldNumber(String soldNumber) {
        this.soldNumber = soldNumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
