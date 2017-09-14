package com.salwa.zawody.domain;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Piotr Karasiński
 */
@Entity
@NoArgsConstructor
public @Data class Athlete {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int yearOfBirth;
    @ManyToOne
    private Club club;
    @OneToMany(mappedBy="athlete")
    private Set<Result> results;
}
