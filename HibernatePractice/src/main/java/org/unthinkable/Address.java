package org.unthinkable;

import javax.persistence.*;

@Entity
@Table(name = "student_address")
public class Address {
    public void setId(int id) {
        this.id = id;
    }

    @Id
    private int id;

    private String street;
    private String city;
    private boolean isOpen;

    private double x;

    public int getId() {
        return id;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", isOpen=" + isOpen +
                ", x=" + x +
                '}';
    }

    public Address( String street, String city, boolean isOpen, double x) {

        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.x = x;
    }
    public Address(){

    }
}
