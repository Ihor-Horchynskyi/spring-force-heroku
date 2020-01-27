package com.koroka.herokuIntegration.data.entities;

import lombok.Data;

import javax.persistence.*;

@Data
//@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @Column
    public String name;
    @Column
    public String surname;
}
