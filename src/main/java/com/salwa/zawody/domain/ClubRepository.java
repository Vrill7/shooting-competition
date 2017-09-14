package com.salwa.zawody.domain;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Piotr Karasiński
 */
@RepositoryRestResource(collectionResourceRel = "club", path = "club")
public interface  ClubRepository extends PagingAndSortingRepository<Club, Long> {
    
    List<Club> findByShortName(@Param("shortName") String shortName);
}
