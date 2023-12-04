package org.example.core;

import java.util.Date;

public abstract class Person {
    // Attributes
    private int id;
    private String name;
    private Date birthDate;
    private String address;
    private String phone;
    private String personId;
    private String email;

    // Constructors
    public Person() {
    }

    public Person(int id, String name, String address, String phone, String personId, Date birthDate, String email) {
        this.id = id;
        this.phone = phone;
        this.personId = personId;
        this.birthDate = birthDate;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    // Getter and Setter methods for 'id'
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter methods for 'name'
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for 'address'
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and Setter methods for 'phone'
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getter and Setter methods for 'personId'
    public String getPersonId() {
        return this.personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    // Getter and Setter methods for 'birthDate'
    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    // Getter and Setter methods for 'email'
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
