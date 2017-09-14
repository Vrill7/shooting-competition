package com.salwa.zawody.domain;

import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public @Data class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fullName;
    private String shortName;
    @OneToMany(mappedBy="club")
    @OrderBy("name")
    private List<Athlete> athletes;

    public Club(String shortName) {
        this.shortName = shortName;
    }

}
