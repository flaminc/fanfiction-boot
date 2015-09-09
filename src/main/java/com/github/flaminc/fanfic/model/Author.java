package com.github.flaminc.fanfic.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Author {
    @Id
    @GeneratedValue
    private long id;

    private String username;

}
