package com.salwa.zawody.domain;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Piotr Karasiński
 */
@RepositoryRestResource(collectionResourceRel = "athlete", path = "athlete")
public interface  AthleteRepository extends PagingAndSortingRepository<Athlete, Long> {
    
    List<Athlete> findByName(@Param("name") String name);
    List<Athlete> findByYearOfBirth(@Param("yearOfBirth") int yearOfBirth);
}
