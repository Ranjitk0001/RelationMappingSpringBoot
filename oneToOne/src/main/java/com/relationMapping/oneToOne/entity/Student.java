package com.relationMapping.oneToOne.entity;

import javax.persistence.*;

@Entity
@Table(name = "Studentes")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int mobile;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //    default constructor
    public Student() {
    }

    public Student( String name, int mobile) {

        this.name = name;
        this.mobile = mobile;
    }

    public Student( String name, int mobile,Address address) {

        this.mobile = mobile;
        this.name = name;
        this.address = address;
    }
    //    Getter Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

//    toString

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
