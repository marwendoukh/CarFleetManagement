/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author marwen
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Id
    @Column(name = "username")
    String username;

    @Column(name = "cin")
    Integer cin;

    @Column(name = "name")
    String name;

    @Column(name = "surname")
    String surname;

    @Column(name = "password")
    String password;

    @Column(name = "address", insertable = false, updatable = false)
    String Address;

    @Column(name = "phoneNumber")

    Integer phoneNumber;

    @Column(name = "address")
    String address;

    @Enumerated(EnumType.STRING)
    Role role;

    @ManyToOne
    Departement departement;

    public User() {
    }

    public User(String username, Integer cin, String name, String surname, String password, String Address, Integer phoneNumber, String address, Role role, Departement departement) {
        this.username = username;
        this.cin = cin;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.Address = Address;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.role = role;
        this.departement = departement;
    }

    public User(Integer cin, String name, String surname, String username, String password, String Address, Integer phoneNumber) {
        this.cin = cin;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.Address = Address;
        this.phoneNumber = phoneNumber;
    }

    public User(Integer id, Integer cin, String name, String surname, String username, String password, String Address, Integer phoneNumber) {
        this.id = id;
        this.cin = cin;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.Address = Address;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCin() {
        return cin;
    }

    public void setCin(Integer cin) {
        this.cin = cin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.username);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

}
