package com.ono.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer passportNo;
    private LocalDate passportDate;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PERSONID_FK", unique = true)
    private Person person;

    public Integer getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(Integer passportNo) {
        this.passportNo = passportNo;
    }

    public LocalDate getPassportDate() {
        return passportDate;
    }

    public void setPassportDate(LocalDate passportDate) {
        this.passportDate = passportDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
