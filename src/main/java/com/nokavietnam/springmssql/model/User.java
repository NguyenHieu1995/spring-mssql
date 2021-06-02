package com.nokavietnam.springmssql.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author : NOKA NGUYEN
 * @since : 6/1/2021, Tue
 **/
@Getter
@Setter
@Entity
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "STATUS")
    private String status;

}
