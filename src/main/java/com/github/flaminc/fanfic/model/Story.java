package com.github.flaminc.fanfic.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Story {
    @Id
    @GeneratedValue
    private long id;

    private String title;

    @ManyToOne
    private Author author;
}
