package com.salwa.zawody.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Piotr Karasiński
 */
@Entity
@NoArgsConstructor
public @Data class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Competition competition;
    @ManyToOne
    private Athlete athlete;
    private String result;
    
}
