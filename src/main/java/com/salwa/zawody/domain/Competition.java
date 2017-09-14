package com.salwa.zawody.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Piotr Karasiński
 */
@Entity
@NoArgsConstructor
public @Data class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int year;
    private String city;
    @ManyToOne
    private Championship championship;
    private Discipline discipline;
    @ManyToOne
    private Event event;
    @ManyToOne
    private Category category;
    
    @OneToMany(mappedBy="competition")
    @OrderBy("result")
    private List<Result> results;     
}
